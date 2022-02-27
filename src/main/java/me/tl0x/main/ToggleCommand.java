package me.tl0x.main;

import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ToggleCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {


            if (player.hasPermission("AntiNetherite.commands")) {
                if (AntiNetherite.enabled) {
                    AntiNetherite.enabled = false;
                    player.sendMessage("AntiNetherite disabled");
                } else if (AntiNetherite.enabled == false) {
                    AntiNetherite.enabled = true;
                    player.sendMessage("AntiNetherite Enabled");
                }
            }
            else {
                player.sendMessage(Color.RED + "You do not have permission to use the command. Contact the server admins if you believe this to be an issue.");
            }

        }
        return false;
    }
}
