package com.monirul.myturtle.turtle;

import com.monirul.myturtle.simulation.Direction;
import com.monirul.myturtle.simulation.Position;
import com.monirul.myturtle.exception.ApplicationException;

public abstract class AbstractTurtle implements Turtle {

	protected  Position currentPosition;
	
	
	@Override
	public void turnRight() throws ApplicationException {
		if(this.isPlaced()){
			Direction newDirection =  this.currentPosition.getDirection().rotateRight();
			this.currentPosition.setDirection(newDirection);
		}
	}

	@Override
	public void turnLeft() throws ApplicationException {
		if(this.isPlaced()){
			Direction newDirection = this.currentPosition.getDirection().rotateLeft();
			this.currentPosition.setDirection(newDirection);
		}
	}
	
	/**
	 * check whether Turtle has been placed on board or not
	 * @return
	 * @throws ApplicationException
	 */
	public boolean isPlaced() throws ApplicationException{
		if(this.currentPosition == null){
			throw new ApplicationException("TURTLE is required to be placed on the Board first.");
		}
		return true;
	}

	@Override
	public void setNewPosition(Position newPosition) {
		this.currentPosition = newPosition;
	}

	@Override
	public Position getCurrentPosition() throws ApplicationException{
		this.isPlaced();
		return this.currentPosition;
	}

}
