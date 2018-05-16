package com.monirul.myturtle.simulation;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.monirul.myturtle.exception.ApplicationException;

public class TestPosition {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void initPosition() throws ApplicationException {
		Position postion = new Position(1, 2, Direction.NORTH);
		Assert.assertEquals(1,postion.getX());
		Assert.assertEquals(2,postion.getY());
		Assert.assertEquals(Direction.NORTH,postion.getDirection());
	}

	@Test
	public void initPositionWithNegativeValue() throws ApplicationException {
		Position postion = new Position(-1, -2, Direction.NORTH);
		Assert.assertEquals(-1,postion.getX());
		Assert.assertEquals(-2,postion.getY());
		Assert.assertEquals(Direction.NORTH,postion.getDirection());
	}
	
	@Test(expected=ApplicationException.class)
	public void initPositionWithInvalidDirectioWillThrowException() throws ApplicationException {
		Position postion = new Position(1, 2, null);
		Assert.assertEquals(1,postion.getX());
		Assert.assertEquals(2,postion.getY());
		Assert.assertEquals(Direction.NORTH,postion.getDirection());
	}


}
