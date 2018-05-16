package com.monirul.myturtle.board;

import com.monirul.myturtle.simulation.Position;
import com.monirul.myturtle.turtle.Turtle;
import com.monirul.myturtle.exception.ApplicationException;

public abstract class AbstractBoard implements Board {

	protected int cols;
	protected int rows;
	
	
	
	
	public int getCols() {
		return cols;
	}



	public void setXCols(int cols) {
		this.cols = cols;
	}



	public int getRows() {
		return rows;
	}



	public void setRows(int rows) {
		this.rows = rows;
	}
	

	public boolean isValidPosition(Position position) throws ApplicationException {
		boolean isValid = !(position.getX() > this.cols || position.getX() < 0
				|| position.getY() > this.rows || position.getY() < 0
		);
		if(!isValid){
			throw new ApplicationException("Cannot MOVE, already at the Edge");
		}
		return isValid;
	}



	@Override
	public void placeRobot(Turtle robot, Position newPosition) throws ApplicationException {
		if(this.isValidPosition(newPosition)){
			robot.setNewPosition(newPosition);
		}
		
	}
}
