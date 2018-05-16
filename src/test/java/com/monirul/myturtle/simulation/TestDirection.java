package com.monirul.myturtle.simulation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.monirul.myturtle.simulation.Direction;

public class TestDirection {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Direction direction = Direction.NORTH;
		Assert.assertEquals(Direction.NORTH, direction);
	}
	
	@Test
	public void rotateRightNorth2East(){
		Direction direction = Direction.NORTH;
		Direction newDirection = direction.rotateRight();
		Assert.assertEquals(Direction.EAST, newDirection);
	}
	
	@Test
	public void rotateLeftNorth2West(){
		Direction direction = Direction.NORTH;
		Direction newDirection = direction.rotateLeft();
		Assert.assertEquals(Direction.WEST, newDirection);
	}
	
	@Test
	public void rotateRightEast2South(){
		Direction direction = Direction.EAST;
		Direction newDirection = direction.rotateRight();
		Assert.assertEquals(Direction.SOUTH, newDirection);
	}
	
	@Test
	public void rotateLeftEast2North(){
		Direction direction = Direction.EAST;
		Direction newDirection = direction.rotateLeft();
		Assert.assertEquals(Direction.NORTH, newDirection);
	}
	
	
	@Test
	public void rotateRightSouth2East(){
		Direction direction = Direction.SOUTH;
		Direction newDirection = direction.rotateRight();
		Assert.assertEquals(Direction.WEST, newDirection);
	}
	
	@Test
	public void rotateLeftSouth2West(){
		Direction direction = Direction.SOUTH;
		Direction newDirection = direction.rotateLeft();
		Assert.assertEquals(Direction.EAST, newDirection);
	}
	
	@Test
	public void rotateRightWest2North(){
		Direction direction = Direction.WEST;
		Direction newDirection = direction.rotateRight();
		Assert.assertEquals(Direction.NORTH, newDirection);
	}
	
	@Test
	public void rotateLeftWest2South(){
		Direction direction = Direction.WEST;
		Direction newDirection = direction.rotateLeft();
		Assert.assertEquals(Direction.SOUTH, newDirection);
	}
	

}
