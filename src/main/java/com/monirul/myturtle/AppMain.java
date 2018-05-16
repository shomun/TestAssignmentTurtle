package com.monirul.myturtle;


import com.monirul.myturtle.board.Board;
import com.monirul.myturtle.board.SquareBoard;
import com.monirul.myturtle.turtle.Turtle;
import com.monirul.myturtle.turtle.SimpleTurtle;
import com.monirul.myturtle.exception.ApplicationException;

public class AppMain {

	public static void main(String[] args) {
		try{
			Board board = new SquareBoard(5);
			Turtle turtle = new SimpleTurtle();
			
			Game game = new Game(turtle, board);
			game.play();
			
		}catch(ApplicationException e){
			System.out.println(e.getMessage());
		}
	}
}
