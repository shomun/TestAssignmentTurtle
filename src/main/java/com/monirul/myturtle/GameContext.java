package com.monirul.myturtle;

import com.monirul.myturtle.board.Board;
import com.monirul.myturtle.turtle.Turtle;

/**
 * Container to carry Robot and Board instance to be used by the Commands
 * @author Monirul
 *
 */
public class GameContext {

	private Turtle turtle;
	
	private Board board;
	
	private String userCommand;
	
	public GameContext(Turtle turtle,Board board){
		this.turtle = turtle;
		this.board = board;
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

	public String getUserCommand() {
		return userCommand;
	}

	public void setUserCommand(String userCommand) {
		this.userCommand = userCommand;
	}
	
	
}
