package azuazu3939.resource;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Resource extends JavaPlugin {

    private static Resource resource;
    public Resource() {resource = this;}
    public static Resource inst() {return resource;}
    @Override
    public void onEnable() {
        // Plugin startup logic
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new ItemListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
