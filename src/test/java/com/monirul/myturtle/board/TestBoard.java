package com.monirul.myturtle.board;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.monirul.myturtle.simulation.Direction;
import com.monirul.myturtle.simulation.Position;
import com.monirul.myturtle.exception.ApplicationException;

public class TestBoard {

	private SquareBoard board;
	@Before
	public void setUp() throws Exception {
		board = new SquareBoard(5);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void initSquareBoard() {
		Assert.assertEquals(5,board.getCols());
		Assert.assertEquals(5,board.getRows());
	}

	@Test
	public void validPosition() {
		try {
			Position position = new Position(1, 2, Direction.EAST);
			Assert.assertEquals(true,board.isValidPosition(position));
		} catch (ApplicationException e) {
			
		}
	}
	
	@Test(expected=ApplicationException.class)
	public void invalidPosition() throws ApplicationException {
		Position position = new Position(-1, 0, Direction.EAST);
		board.isValidPosition(position);
		
	}
	
	@Test(expected=ApplicationException.class)
	public void invalidPosition2() throws ApplicationException {
		Position position = new Position(1, 6, Direction.EAST);
		board.isValidPosition(position);
		
	}

}
