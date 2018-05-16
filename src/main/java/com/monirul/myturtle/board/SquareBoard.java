package com.monirul.myturtle.board;

import com.monirul.myturtle.exception.ApplicationException;

public class SquareBoard extends AbstractBoard{

	public SquareBoard(int size) throws ApplicationException {
		if(size <= 0){
			throw new ApplicationException("Board size cannot be negative or Zero.");
		}else{
			this.cols = this.rows = size;
		}
	}

}
