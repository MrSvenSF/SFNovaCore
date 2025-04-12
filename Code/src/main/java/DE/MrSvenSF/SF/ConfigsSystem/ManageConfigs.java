package DE.MrSvenSF.SF.ConfigsSystem;

import org.bukkit.plugin.java.JavaPlugin;


public class ManageConfigs {
    private MainConfig mainConfig;
    private LoadingConfigs loadingConfigs;

    public ManageConfigs() {
        this.mainConfig = new MainConfig();
        this.loadingConfigs = new LoadingConfigs();
    }

    public void loadConfigs() {
        JavaPlugin plugin = JavaPlugin.getProvidingPlugin(getClass());
        mainConfig.loadConfig(plugin); // Pass the JavaPlugin instance
        loadingConfigs.loadModules(mainConfig.getConfig(), plugin); // Pass the JavaPlugin instance instead of File
    }

    public void reloadConfigs() {
        loadConfigs();
    }
}
