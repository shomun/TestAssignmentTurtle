package com.monirul.myturtle.command;

import java.util.HashMap;
import java.util.Map;

import com.monirul.myturtle.command.board.BoardPlaceCmd;
import com.monirul.myturtle.command.game.ExitCmd;
import com.monirul.myturtle.command.game.ReportCmd;
import com.monirul.myturtle.command.turtle.MoveForwardCmd;
import com.monirul.myturtle.command.turtle.MoveLeftCmd;
import com.monirul.myturtle.command.turtle.MoveRightCmd;
import com.monirul.myturtle.exception.ApplicationException;

public enum CommandConfig {
	
	INSTANCE;
		
	private Map<String, UserCommand> commands= new HashMap<>();
	
	private CommandConfig(){
		this.populate();
	}
	
	private void populate(){
		this.commands.put("EXIT", new ExitCmd());
		this.commands.put("REPORT", new ReportCmd());
		this.commands.put("PLACE", new BoardPlaceCmd());
		this.commands.put("RIGHT", new MoveRightCmd());
		this.commands.put("LEFT", new MoveLeftCmd());
		this.commands.put("MOVE", new MoveForwardCmd());
	}
	
	public UserCommand getCommand(String command)throws ApplicationException{
		String key = command.trim().toUpperCase();
		if(this.commands.containsKey(key)){
			return this.commands.get(key);
		}else{
			throw new ApplicationException("Command not supported");
		}
		
	}
}
