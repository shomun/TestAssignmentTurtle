package com.monirul.myturtle.turtle;

import com.monirul.myturtle.simulation.Position;
import com.monirul.myturtle.exception.ApplicationException;

public interface Turtle {
	/**
	 * Rotate Turtle to Right by 45 degree i.e if the Turtle is facing North, it will turn to East.
	 * @throws ApplicationException if Turtle is not placed on Board
	 */
	void turnRight() throws ApplicationException;
	
	/**
	 * Rotate Turtle to Left by 45 degree i.e if the Turtle is facing North, it will turn to West.
	 * @throws ApplicationException if Turtle is not placed on Board
	 */
	void turnLeft() throws ApplicationException;
	
	/**
	 * Set new position 
	 * @param newPosition
	 */
	void setNewPosition(Position newPosition);
	
	/**
	 * Get Current Position
	 * @return
	 */
	Position getCurrentPosition() throws ApplicationException;
	
	/**
	 * Check whether the Turtle is placed already on the board
	 * @return
	 * @throws ApplicationException if Turtle is not placed on Board
	 */
	boolean isPlaced() throws ApplicationException;
	
}
