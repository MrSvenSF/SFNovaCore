package DE.MrSvenSF.SF.ConfigsSystem;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class MainConfig {
    private FileConfiguration config;

    public void loadConfig(JavaPlugin plugin) {
        File configFile = new File(plugin.getDataFolder(), "MainConfig.yml");
        if (!configFile.exists()) {
            plugin.saveResource("MainConfig.yml", false); // Save the default resource if it doesn't exist
        }
        config = YamlConfiguration.loadConfiguration(configFile); // Load the configuration from the file
    }

    public FileConfiguration getConfig() {
        return config;
    }
}

