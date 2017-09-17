package darkpirate.plugin.hb.Events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import net.md_5.bungee.api.ChatColor;

public class Events implements Listener {

	@EventHandler
	public void onInteract(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		Action action = event.getAction();
		Block block = event.getClickedBlock();
		
		if(action.equals(Action.LEFT_CLICK_BLOCK)) {
			if(block.getType().equals(Material.BEACON)){
				if(player.hasPermission("beacon.heal")) { 
					if(player.getHealth() != 20) {
						player.setHealth(player.getHealth() + 1);
						player.sendMessage(ChatColor.DARK_GREEN + "You have being healed because you punched a beacon" + ChatColor.LIGHT_PURPLE + " X: " + ChatColor.WHITE + block.getX() + ChatColor.LIGHT_PURPLE + " Y: " + ChatColor.WHITE + block.getY() + ChatColor.LIGHT_PURPLE + " Z: " + ChatColor.WHITE + block.getZ());
						player.sendMessage(ChatColor.BLUE + "You have gained half a heart");
					}else{
						player.sendMessage(ChatColor.RED + "You have full health");
					}
				}else{
					player.sendMessage(ChatColor.RED + "You do not have permission to punch this beacon and get healed");
				}
				
			}
		}else if(action.equals(Action.RIGHT_CLICK_BLOCK)) {
			
		}
		
	}

}
