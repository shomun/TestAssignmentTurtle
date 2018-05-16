package com.monirul.myturtle.command;

import com.monirul.myturtle.GameContext;
import com.monirul.myturtle.exception.ApplicationException;

public abstract class AbstractCommand implements UserCommand {

	@Override
	public boolean isValid(GameContext gameContext) throws ApplicationException {
		return true;
	}

	
}
