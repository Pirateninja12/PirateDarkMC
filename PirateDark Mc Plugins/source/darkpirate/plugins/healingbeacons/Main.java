package darkpirate.plugins.healingbeacons;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	 
    @Override
    public void onEnable() {
       getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nHealing Beacons have being enabled\n\n");
    }
   
    @Override
    public void onDisable() {
       getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nHealing Beacons has being disabled\n\n");
    }

}