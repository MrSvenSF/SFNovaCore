package DE.MrSvenSF.SF.ConfigsSystem;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.logging.Logger;

public class LoadingConfigs {
    // das soll aus der MainConfig.yml die modules laden
    // als beispiel: die Werbung, er soll die aus den plugin/Modules/Werbung/WerbungConfig.yml und WerbungCommands.yml laden

    public void loadModules(FileConfiguration mainConfig, JavaPlugin plugin) {
        Logger logger = plugin.getLogger();

        if (mainConfig.getBoolean("Module.TPAs")) {
            File tpaConfig = new File(plugin.getDataFolder(), "Modules/TPAs/TPAConfig.yml");
            File tpaCommands = new File(plugin.getDataFolder(), "Modules/TPAs/TPACommands.yml");

            try {
                if (!tpaConfig.exists()) {
                    plugin.saveResource("Modules/TPAs/TPAConfig.yml", false);
                }
                if (!tpaCommands.exists()) {
                    plugin.saveResource("Modules/TPAs/TPACommands.yml", false);
                }

                YamlConfiguration.loadConfiguration(tpaConfig);
                YamlConfiguration.loadConfiguration(tpaCommands);
                logger.info("TPAs module loaded successfully.");
            } catch (Exception e) {
                logger.severe("Error loading TPAs module: " + e.getMessage());
            }
        }

        if (mainConfig.getBoolean("Module.Homes")) {
            File homesConfig = new File(plugin.getDataFolder(), "Modules/Homes/HomesConfig.yml");
            File homesCommands = new File(plugin.getDataFolder(), "Modules/Homes/HomesCommands.yml");

            try {
                if (!homesConfig.exists()) {
                    plugin.saveResource("Modules/Homes/HomesConfig.yml", false);
                }
                if (!homesCommands.exists()) {
                    plugin.saveResource("Modules/Homes/HomesCommands.yml", false);
                }

                YamlConfiguration.loadConfiguration(homesConfig);
                YamlConfiguration.loadConfiguration(homesCommands);
                logger.info("Homes module loaded successfully.");
            } catch (Exception e) {
                logger.severe("Error loading Homes module: " + e.getMessage());
            }
        }

        if (mainConfig.getBoolean("Module.Skins")) {
            File skinsConfig = new File(plugin.getDataFolder(), "Modules/Skins/SkinsConfig.yml");
            File skinsCommands = new File(plugin.getDataFolder(), "Modules/Skins/SkinsCommands.yml");

            try {
                if (!skinsConfig.exists()) {
                    plugin.saveResource("Modules/Skins/SkinsConfig.yml", false);
                }
                if (!skinsCommands.exists()) {
                    plugin.saveResource("Modules/Skins/SkinsCommands.yml", false);
                }

                YamlConfiguration.loadConfiguration(skinsConfig);
                YamlConfiguration.loadConfiguration(skinsCommands);
                logger.info("Skins module loaded successfully.");
            } catch (Exception e) {
                logger.severe("Error loading Skins module: " + e.getMessage());
            }
        }

        if (mainConfig.getBoolean("Module.Werbung")) {
            File werbungConfig = new File(plugin.getDataFolder(), "Modules/Werbung/WerbungConfig.yml");
            File werbungCommands = new File(plugin.getDataFolder(), "Modules/Werbung/WerbungCommands.yml");

            try {
                if (!werbungConfig.exists()) {
                    plugin.saveResource("Modules/Werbung/WerbungConfig.yml", false);
                }
                if (!werbungCommands.exists()) {
                    plugin.saveResource("Modules/Werbung/WerbungCommands.yml", false);
                }

                YamlConfiguration.loadConfiguration(werbungConfig);
                YamlConfiguration.loadConfiguration(werbungCommands);
                logger.info("Werbung module loaded successfully.");
            } catch (Exception e) {
                logger.severe("Error loading Werbung module: " + e.getMessage());
            }
        }

        if (mainConfig.getBoolean("Module.Chests")) {
            File chestsConfig = new File(plugin.getDataFolder(), "Modules/Chests/ChestsConfig.yml");
            File chestsCommands = new File(plugin.getDataFolder(), "Modules/Chests/ChestsCommands.yml");

            try {
                if (!chestsConfig.exists()) {
                    plugin.saveResource("Modules/Chests/ChestsConfig.yml", false);
                }
                if (!chestsCommands.exists()) {
                    plugin.saveResource("Modules/Chests/ChestsCommands.yml", false);
                }

                YamlConfiguration.loadConfiguration(chestsConfig);
                YamlConfiguration.loadConfiguration(chestsCommands);
                logger.info("Chests module loaded successfully.");
            } catch (Exception e) {
                logger.severe("Error loading Chests module: " + e.getMessage());
            }
        }
    }
}
