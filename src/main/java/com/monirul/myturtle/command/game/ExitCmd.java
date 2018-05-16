package com.monirul.myturtle.command.game;

import com.monirul.myturtle.GameContext;
import com.monirul.myturtle.command.AbstractCommand;
import com.monirul.myturtle.exception.ApplicationException;

public class ExitCmd extends AbstractCommand {

	@Override
	public void execute(GameContext gameContext) throws ApplicationException {
		System.exit(1);
	}

}
