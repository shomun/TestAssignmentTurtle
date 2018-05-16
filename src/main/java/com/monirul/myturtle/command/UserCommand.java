package com.monirul.myturtle.command;

import com.monirul.myturtle.GameContext;
import com.monirul.myturtle.exception.ApplicationException;

public interface UserCommand {

	boolean isValid(GameContext gameContext) throws ApplicationException;
	void execute(GameContext gameContext) throws ApplicationException;
}
