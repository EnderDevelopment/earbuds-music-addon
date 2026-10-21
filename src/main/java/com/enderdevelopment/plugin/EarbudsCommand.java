package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EarbudsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be used by players.");
            return true;
        }

        Player player = (Player) sender;

        if (args.length == 0) {
            player.sendMessage("Usage: /earbuds <play|stop|insert|remove>");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "play":
                // Play music logic
                player.sendMessage("Playing music...");
                break;
            case "stop":
                // Stop music logic
                player.sendMessage("Stopping music...");
                break;
            case "insert":
                // Insert music disc logic
                player.sendMessage("Inserting music disc...");
                break;
            case "remove":
                // Remove music disc logic
                player.sendMessage("Removing music disc...");
                break;
            default:
                player.sendMessage("Usage: /earbuds <play|stop|insert|remove>");
                break;
        }
        return true;
    }
}