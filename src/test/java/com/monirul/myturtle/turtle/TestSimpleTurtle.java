package com.monirul.myturtle.turtle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.monirul.myturtle.exception.ApplicationException;

public class TestSimpleTurtle {

	private SimpleTurtle robot;
	@Before
	public void setup() throws ApplicationException{
		robot = new SimpleTurtle();
	}
	
	@Test
	public void initializeSimpleRobot() {
		Assert.assertTrue(robot instanceof SimpleTurtle);;
	}

	@Test(expected = ApplicationException.class)
	public void turnRightWithoutPlacing() throws ApplicationException {
		robot.turnRight();
	}

	@Test(expected = ApplicationException.class)
	public void turnLeftWithoutPlacing() throws ApplicationException {
		robot.turnLeft();
	}
	
	

}
