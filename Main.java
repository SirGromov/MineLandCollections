package main;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin{
		
	@Override
	public void onEnable() {
		getLogger().info("YA VKLUCHILSA EPTA!");
		this.getCommand("givecontent").setExecutor(new CommandGivecontent());
	}
	
	public void onDisable() {
		getLogger().info("YA VIKLUCHILSA EPTA!");
	}

}
