package main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandGivecontent implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		if(cmd.getName().equalsIgnoreCase("givecontent")) {
			if(!(sender instanceof Player)) {
				sender.sendMessage("This command can be run by a Player!");
				return true;
			}
			else {
				Player p = (Player) sender;
				if(args[0].equalsIgnoreCase("time")) {
					ItemStack item = timeCollection.ItemAssembler(args[1]);
					p.getInventory().addItem(item);
					return true;
				}
			}
		}
		return true;
	}
}
