package me.tl0x.main;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiNetherite extends JavaPlugin implements Listener {

    public static boolean enabled = true;

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Registering Events");
        Bukkit.getPluginManager().registerEvents(new Events(this), this);

        System.out.println("Registering Commands");
        getCommand("toggle").setExecutor(new ToggleCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
