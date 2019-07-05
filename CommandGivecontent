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
					if(args[1].equalsIgnoreCase("1")) {
						ItemStack item = timeCollection.MinelandItemPortalDevice();
						p.getInventory().addItem(item);
						return true;
					}
					else if(args[1].equalsIgnoreCase("2")) {
						ItemStack item = timeCollection.MinelandItemCodecs();
						p.getInventory().addItem(item);
						return true;
					}
					else if(args[1].equalsIgnoreCase("3")) {
						ItemStack item = timeCollection.MinelandItemCore();
						p.getInventory().addItem(item);
						return true;
					}
					else if(args[1].equalsIgnoreCase("4")) {
						ItemStack item = timeCollection.MinelandItemMedievalSword();
						p.getInventory().addItem(item);
						return true;
					}
					else if(args[1].equalsIgnoreCase("5")) {
						ItemStack item = timeCollection.MinelandItemPrimalAxe();
						p.getInventory().addItem(item);
						return true;
					}
					else if(args[1].equalsIgnoreCase("6")) {
						ItemStack item = timeCollection.MinelandItemGreekColumn();
						p.getInventory().addItem(item);
						return true;
					}
					else if(args[1].equalsIgnoreCase("7")) {
						ItemStack item = timeCollection.MinelandItemNukelarBomb();
						p.getInventory().addItem(item);
						return true;
					}
					else if(args[1].equalsIgnoreCase("8")) {
						ItemStack item = timeCollection.MinelandItemTzarCrown();
						p.getInventory().addItem(item);
						return true;
					}
					else if(args[1].equalsIgnoreCase("9")) {
						ItemStack item = timeCollection.MinelandItemPocketChronometer();
						p.getInventory().addItem(item);
						return true;
					}
					else if(args[1].equalsIgnoreCase("10")) {
						ItemStack item = timeCollection.MinelandItemExitFromExitlessSituationsButton();
						p.getInventory().addItem(item);
						return true;
					}
					else if(args[1].equalsIgnoreCase("11")) {
						ItemStack item = timeCollection.MinelandItemGolem();
						p.getInventory().addItem(item);
						return true;
					}
					else if(args[1].equalsIgnoreCase("boss1_1")) {
						ItemStack item = timeCollection.MinelandItemGolemMask();
						p.getInventory().addItem(item);
						return true;
					}
					else if(args[1].equalsIgnoreCase("boss1_2")) {
						ItemStack item = timeCollection.MinelandItemGolemBody();
						p.getInventory().addItem(item);
						return true;
					}
					else if(args[1].equalsIgnoreCase("boss1_3")) {
						ItemStack item = timeCollection.MinelandItemGolemLegs();
						p.getInventory().addItem(item);
						return true;
					}
					else if(args[1].equalsIgnoreCase("boss1_4")) {
						ItemStack item = timeCollection.MinelandItemGolemBoots();
						p.getInventory().addItem(item);
						return true;
					}
					else if(args[1].equalsIgnoreCase("boss1_5")) {
						ItemStack item = timeCollection.MinelandItemGolemSword();
						p.getInventory().addItem(item);
						return true;
					}
				}
			}
		}
		return true;
	}
}
