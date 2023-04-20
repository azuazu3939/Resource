package azuazu3939.resource;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class afterweaponboxaxe {

    public static void get(Player player) {

        List<String> s = new ArrayList<>();
        s.add("m");
        s.add("n");
        s.add("p");
        s.add("l");
        s.add("j");
        s.add("t");

        Random ran = new Random();
        int i = ran.nextInt(6);
        int count = ran.nextInt(40) + 1;

        if (s.get(i).equals("m")) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " seira" + count + " 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、seira" + count + "を1つ付与しました。");
        }
        if (s.get(i).equals("n")) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " agito" + count + " 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、agito" + count + "を1つ付与しました。");
        }
        if (s.get(i).equals("p")) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " rairai" + count + " 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、rairai" + count + "を1つ付与しました。");
        }
        if (s.get(i).equals("l")) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " tamahagane" + count + " 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、tamahagane" + count + "を1つ付与しました。");
        }
        if (s.get(i).equals("j")) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " ganzanzan" + count + " 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、ganzanzan" + count + "を1つ付与しました。");
        }
        if (s.get(i).equals("t")) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " danzetuha" + count + " 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、danzetuha" + count + "を1つ付与しました。");
        }
    }
}
