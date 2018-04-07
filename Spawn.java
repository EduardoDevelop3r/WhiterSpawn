package com.bestfyplugner.witherspawn.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import com.bestfyplugner.api.manager.CommandManager;
import com.bestfyplugner.witherspawn.Main;

public class Spawn extends CommandManager {
	public Spawn() {
		super("spawn");
		// TODO Auto-generated constructor stub
	}
	public void command(CommandSender sender, Command command, String label,
			String[] args) {
		if (Main.wither == null) {
			if (Main.hasSpawn()) {
				Main.spawnWither();
				sender.sendMessage(Main.config.message("Spawn"));
			} else {
				sender.sendMessage(Main.config.message("NoSpawn"));
			}

		} else {
			sender.sendMessage(Main.config.message("Spawned"));
		}
	}

}
