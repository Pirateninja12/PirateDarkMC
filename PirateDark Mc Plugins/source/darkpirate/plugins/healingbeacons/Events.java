package darkpirate.plugins.healingbeacons;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Events implements Listener {

	@SuppressWarnings("static-access")
	@EventHandler
	public void onInteract(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		Action action = event.getAction();
		Block block = event.getClickedBlock();
		
		if(action.equals(action.RIGHT_CLICK_BLOCK)) {
			if(block.equals(Material.BEACON)){
				if(player.hasPermission("beacon.heal")) {
					if(player.getHealth() != 20) {
						player.setHealth(player.getHealth() + 1);
						player.sendMessage(ChatColor.GREEN + "You have being healed because you clicked a block at " + block.getX() + block.getY() + block.getZ());
						player.sendMessage(ChatColor.BLUE + "You have gained half a heart");
					}else{
						player.sendMessage(ChatColor.RED + "You have full health");
					}
				}
				
			}
		}
		
	}
}
