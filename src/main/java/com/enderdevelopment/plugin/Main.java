package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("EarbudsPlugin has been enabled!");
        this.getCommand("earbuds").setExecutor(new EarbudsCommand());
        getServer().getPluginManager().registerEvents(new EarbudsListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("EarbudsPlugin has been disabled!");
    }
}