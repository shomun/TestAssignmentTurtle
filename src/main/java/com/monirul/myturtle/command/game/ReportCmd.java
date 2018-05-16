package com.monirul.myturtle.command.game;

import com.monirul.myturtle.GameContext;
import com.monirul.myturtle.command.AbstractCommand;
import com.monirul.myturtle.exception.ApplicationException;

public class ReportCmd extends AbstractCommand {

	@Override
	public void execute(GameContext gameContext) throws ApplicationException {
		System.out.println(gameContext.getTurtle().getCurrentPosition());
	}

}
