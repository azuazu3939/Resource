package azuazu3939.resource;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Random;

public class unknownopenbox {

    public void get(Player player) {

        Random ran = new Random();
        int get = ran.nextInt(54) + 1;

        //USetA
        if (get <= 11) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " diarod 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、diarodを1つ付与しました。");
        }
        //USetB
        if (get > 11 && get <= 22) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " emrod 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、emrodを1つ付与しました。");

        }
        //USetC
        if (get > 22 && get <= 33) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " goldrod 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、goldrodを1つ付与しました。");
        }
        //USetD
        if (get > 33 & get <= 44) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " ironrod 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、ironrodを1つ付与しました。");
        }
        //USetE
        if (get > 44 && get <= 53) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " nether_star 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、nether_starを1つ付与しました。");
        }
        //USetF
        if (get == 54) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " weaponbox 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、weaponboxを1つ付与しました。");
        }
    }
}
