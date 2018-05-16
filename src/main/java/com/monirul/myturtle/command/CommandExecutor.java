package com.monirul.myturtle.command;

import com.monirul.myturtle.GameContext;
import com.monirul.myturtle.exception.ApplicationException;

public enum CommandExecutor {

	INSTANCE;
	
	public void executeCommand(UserCommand userCommand, GameContext gameContext) throws ApplicationException{
		if(userCommand.isValid(gameContext)){
			userCommand.execute(gameContext);
		}else{
			throw new ApplicationException("Command Not Supported");
		}
	}
}
