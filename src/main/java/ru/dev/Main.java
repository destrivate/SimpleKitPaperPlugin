package ru.dev;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static Main instance;
    public FileConfiguration config;

    public void onEnable() {
        instance = this;
        this.saveDefaultConfig();
        config = this.getConfig();
        new DClanExpansion().register();

    }
}
