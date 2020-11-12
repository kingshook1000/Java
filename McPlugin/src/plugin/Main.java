package plugin;

import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;
import plugin.commands.HelloCommand;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\nPlugin Enabled");
		//new HelloCommand(this);
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "\nPlugin Disabled");
		//new HelloCommand(this);
	}
	
}
