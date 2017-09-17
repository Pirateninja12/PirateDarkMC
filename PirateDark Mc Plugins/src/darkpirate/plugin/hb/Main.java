package darkpirate.plugin.hb;

import org.bukkit.plugin.java.JavaPlugin;

import darkpirate.plugin.hb.Events.Events;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	 
    @Override
    public void onEnable() {
       getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nHealing Beacons have being enabled\n\n");
       getServer().getPluginManager().registerEvents(new Events(), this);
    }
   
    @Override
    public void onDisable() {
       getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nHealing Beacons has being disabled\n\n");
    }

}