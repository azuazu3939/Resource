package azuazu3939.resource;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Random;

public class Yunknownopenbox {

    public void get(Player player) {

        Random ran = new Random();
        int get = ran.nextInt(49) + 1;

        //YUSetA
        if (get <= 11) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " sigencustomticketA 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、sigencustomticketAを1つ付与しました。");
        }
        //YUSetB
        if (get > 11 && get <= 22) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " sigencustomticketB 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、sigencustomticketBを1つ付与しました。");
        }
        //YUSetC
        if (get > 22 && get <= 33) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " sigencustomticketC 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、sigencustomticketCを1つ付与しました。");
        }
        //YUSetD
        if (get > 33 && get <= 44) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " sigencustomticketD 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、sigencustomticketDを1つ付与しました。");
        }
        //YUSetE
        if (get > 44 && get <= 48) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " weaponboxaxe 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、weaponboxaxeを1つ付与しました。");
        }
        if (get == 49) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " nether_star 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、nether_starを1つ付与しました。");
        }
    }
}
