package com.pluginforge.stash1smox56oakt9plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Stash1smox56oakt9Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        StashCommand command = new StashCommand(this);
        if (getCommand("stash") != null) {
            getCommand("stash").setExecutor(command);
            getCommand("stash").setTabCompleter(command);
        }
        getServer().getPluginManager().registerEvents(command, this);
        getLogger().info("Stash1smox56oakt9Plugin enabled.");
    }
}
