package com.monirul.myturtle;


import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.monirul.myturtle.board.Board;
import com.monirul.myturtle.command.CommandConfig;
import com.monirul.myturtle.command.CommandExecutor;
import com.monirul.myturtle.command.UserCommand;
import com.monirul.myturtle.turtle.Turtle;
import com.monirul.myturtle.exception.ApplicationException;

public class Game {

	private Turtle turtle;
	private Board board;
	
	private GameContext gameContext;
	public Game(Turtle turtle,Board board) throws ApplicationException{
		this.board = board;
		this.turtle = turtle;
		gameContext = new GameContext(this.turtle, this.board);
	}
	
	
	/**
	 * start playing game. Game instruction are given in file.each line can contain ';' delimated game commands
	 * eg. place2,2,NORTH;move;left;move;move;report;right
	 * if file name is not provided game starts in manual mode. 
	 * @param fileName
	 * @throws ApplicationException
	 */
	public void play(String fileName) throws ApplicationException{
		if(fileName != null){
			this.playFromFile(fileName);
		}else{
			this.playFromConsole();
		}
	}
	
	/**
	 * start playing the game in manual mode.
	 * @throws ApplicationException
	 */
	public void play() throws ApplicationException{
		this.play(null);
	}
	
	
	/**
	 * read instructions from a file. each line can contain ';' delimated game commands
	 * eg. place2,2,NORTH;move;left;move;move;report;right
	 * @param fileName
	 * @throws ApplicationException
	 */
	private void playFromFile(String fileName) throws ApplicationException{
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line = null;
			line = reader.readLine();
			do{
				
				System.out.println("Input from file : "+ line);
				this.simulate(line);
				line = reader.readLine();
			}while(line != null);
		} catch (FileNotFoundException e) {
			throw new ApplicationException("Input file not found");
		} catch (IOException e) {
			throw new ApplicationException("Input file access problem");
		}
		
		
		
		
	}
	
	/**
	 * start the console to play game manually
	 */
	private void playFromConsole(){
		Scanner scanIn = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter a Command, Valid Commands are: ");
		System.out.println("'PLACE X,Y,NORTH|WEST|SOUTH|EAST ', MOVE, LEFT, RIGHT, REPORT or EXIT");
		boolean keepRunning = true;
		while(keepRunning){
			String inputString = scanIn.nextLine().trim();
			this.simulate(inputString);
		}
	}
	
	/**
	 * Simalation management
	 * @param inputString
	 * @return
	 */
	private void simulate(String inputString){
		String[] inputCmd = inputString.split(";");
			UserCommand userCommand = null;
			for (String input : inputCmd) {
				input = input.trim().toUpperCase();
				String userCmd[] = input.split(" ");
				
				try {
					userCommand = CommandConfig.INSTANCE.getCommand(userCmd[0]);
					gameContext.setUserCommand(input);
					CommandExecutor.INSTANCE.executeCommand(userCommand, gameContext);
				} catch (ApplicationException e) {
					System.out.println(e.getMessage());
				}
			}	

	}


	public Turtle getTurtle() {
		return turtle;
	}


	public void setTurtle(Turtle turtle) {
		this.turtle = turtle;
	}


	public Board getBoard() {
		return board;
	}


	public void setBoard(Board board) {
		this.board = board;
	}
	
	
}
