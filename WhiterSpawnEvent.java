package com.bestfyplugner.witherspawn.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDeathEvent;

import com.bestfyplugner.api.setup.Mine;
import com.bestfyplugner.api.setup.Mine.EventsManager;
import com.bestfyplugner.witherspawn.Main;

public class WitherSpawnEvent extends EventsManager {
	
	
	public WitherSpawnEvent() {
	}
	
	@EventHandler
	public void event(EntityDeathEvent e) {
		if (e.getEntity().equals(Main.wither)) {
			Main.config.set("WitherDeathTime", Mine.getNow());
			Main.config.saveConfig();
			Main.wither = null;
		}
	}
}
