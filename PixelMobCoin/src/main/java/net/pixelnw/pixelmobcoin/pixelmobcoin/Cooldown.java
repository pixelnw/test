package net.pixelnw.pixelmobcoin.pixelmobcoin;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class Cooldown {

    public static HashMap<UUID, Double> cooldowns;

    public static void setupCoolDown(){
        cooldowns = new HashMap<>();
    }

    public static void setCooldowns(Player player, int seconds){
        double delay = System.currentTimeMillis() + (seconds * 1000);
        cooldowns.put(player.getUniqueId(), delay);
    }

    public static boolean checkCooldown(Player player){
        if(!cooldowns.containsKey(player.getUniqueId()) || cooldowns.get(player.getUniqueId()) <= System.currentTimeMillis()){
            return true;
        }
        return false;
    }

    public static long countdown(Player player){
        long secondsLeft = (long) (((cooldowns.get(player.getUniqueId())/1000)+1) - (System.currentTimeMillis()/1000));
        return secondsLeft;

    }

}
