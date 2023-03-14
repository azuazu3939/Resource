package azuazu3939.resource;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class afterweaponbox {

    public void get(Player player) {

        List<String> s = new ArrayList<>();
        s.add("a");
        s.add("h");
        s.add("e");
        s.add("s");
        s.add("k");
        s.add("t");

        Random ran = new Random();
        int i = ran.nextInt(6);
        Random rand = new Random();
        int count = rand.nextInt(40) + 1;

        if (s.get(i).equals("a")) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " akuaria" + count + " 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、akuaria" + count + "を1つ付与しました。");
        }
        if (s.get(i).equals("h")) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " hebunria" + count + " 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、hebunria" + count + "を1つ付与しました。");
        }
        if (s.get(i).equals("e")) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " enpire" + count + " 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、enpire" + count + "を1つ付与しました。");
        }
        if (s.get(i).equals("s")) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " sion" + count + " 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、sion" + count + "を1つ付与しました。");
        }
        if (s.get(i).equals("k")) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " ryuunokiba" + count + " 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、ryuunokiba" + count + "を1つ付与しました。");
        }
        if (s.get(i).equals("t")) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " ryuunotugai" + count + " 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、ryuunotugai" + count + "を1つ付与しました。");
        }
    }
}
