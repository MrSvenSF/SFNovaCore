package DE.MrSvenSF.SF;

import org.bukkit.plugin.java.JavaPlugin;
import DE.MrSvenSF.SF.ConfigsSystem.ManageConfigs;

public final class SFNovaCore extends JavaPlugin {

    @Override
    public void onEnable() {
        ManageConfigs manageConfigs = new ManageConfigs();
        manageConfigs.loadConfigs();
    }

    @Override
    public void onDisable() {

    }
}
