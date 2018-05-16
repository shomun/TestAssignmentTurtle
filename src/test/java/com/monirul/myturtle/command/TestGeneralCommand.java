package com.monirul.myturtle.command;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.monirul.myturtle.GameContext;
import com.monirul.myturtle.board.SquareBoard;
import com.monirul.myturtle.command.game.ReportCmd;
import com.monirul.myturtle.simulation.Direction;
import com.monirul.myturtle.simulation.Position;
import com.monirul.myturtle.turtle.SimpleTurtle;
import com.monirul.myturtle.exception.ApplicationException;

public class TestGeneralCommand {

	private SimpleTurtle robot;
	@Before
	public void setup() throws ApplicationException{
		robot = new SimpleTurtle();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void report() throws ApplicationException {
		Position position = new Position(2, 2, Direction.NORTH);
		robot.setNewPosition(position);
		GameContext gameContext = new GameContext(robot, new SquareBoard(5));
		new ReportCmd().execute(gameContext);
	}

}
