package com.monirul.myturtle;

import java.net.URL;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.monirul.myturtle.board.Board;
import com.monirul.myturtle.board.SquareBoard;
import com.monirul.myturtle.turtle.Turtle;
import com.monirul.myturtle.turtle.SimpleTurtle;
import com.monirul.myturtle.exception.ApplicationException;

public class TestGame {

	private Game game;
	private Board board;
	private Turtle robot;
	@Before
	public void setUp() throws Exception {
		board = new SquareBoard(5);
		robot = new SimpleTurtle();
		game = new Game(robot, board);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGame() {
		Assert.assertTrue( game.getTurtle() instanceof SimpleTurtle );
	}

	@Test
	public void playGamefromFileInput() throws ApplicationException {
		URL url =this.getClass().getResource("/turtle_instruction.txt");
		game.play(url.getPath());
		Assert.assertEquals(5, game.getTurtle().getCurrentPosition().getX());
		Assert.assertEquals(5, game.getTurtle().getCurrentPosition().getY());
		Assert.assertEquals(com.monirul.myturtle.simulation.Direction.EAST, game.getTurtle().getCurrentPosition().getDirection());
	}

	@Test
	public void playGamefromFileInputMuliline() throws ApplicationException {
		URL url =this.getClass().getResource("/turtle_instruction_muliline.txt");
		game.play(url.getPath());
		Assert.assertEquals(1, game.getTurtle().getCurrentPosition().getX());
		Assert.assertEquals(5, game.getTurtle().getCurrentPosition().getY());
		Assert.assertEquals(com.monirul.myturtle.simulation.Direction.NORTH, game.getTurtle().getCurrentPosition().getDirection());
	}

}
