package net.pixelnw.pixelmobcoin.pixelmobcoin;

import com.sk89q.worldguard.bukkit.RegionContainer;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import com.sk89q.worldguard.protection.ApplicableRegionSet;
import com.sk89q.worldguard.protection.managers.RegionManager;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import de.NeonnBukkit.CoinsAPI.API.CoinsAPI;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.BlockVector;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class MobCoins implements Listener{

    PixelMobCoin l = PixelMobCoin.getPlugin(PixelMobCoin.class);

    static HashMap<UUID, Integer> number = new HashMap<>();

    @EventHandler
    public void onEntityDamage(EntityDeathEvent e) {
        if (e.getEntity() instanceof LivingEntity && e.getEntity().getKiller() instanceof Player) {
            LivingEntity killed = e.getEntity();
            Player killer = e.getEntity().getKiller();

            //GARDİYAN
            if(killed.hasMetadata("Gardiyan")){
                    if(Cooldown.checkCooldown(killer)){
                        Cooldown.setCooldowns(killer, 15);
                        number.remove(killer.getUniqueId());
                        number.put(killer.getUniqueId(), 5);
                    }
                    else{
                        int amount = number.get(killer.getUniqueId()) + 5;
                        number.put(killer.getUniqueId(), amount);
                        Cooldown.setCooldowns(killer, 15);
                    }
                    addJeton(killer, number.get(killer.getUniqueId()));
            }
            //DİĞERLERİ
            else{
                if(Cooldown.checkCooldown(killer)){
                    Cooldown.setCooldowns(killer, 15);
                    number.remove(killer.getUniqueId());
                    number.put(killer.getUniqueId(), 2);
                }
                else{
                    int amount = number.get(killer.getUniqueId()) + 2;
                    number.put(killer.getUniqueId(), amount);
                    Cooldown.setCooldowns(killer, 15);
                }
                addJeton(killer, number.get(killer.getUniqueId()));
            }

        }
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event){
        Block b = event.getBlock();
        Player player = event.getPlayer();
        if(player.getWorld().getName().equalsIgnoreCase("world")){
            World world = Bukkit.getWorld("world");
            RegionContainer container = getWorldGuard().getRegionContainer();
            RegionManager regions = container.get(world);

            ProtectedRegion yosunlutas1 = regions.getRegion("yosunlutas1");
            ProtectedRegion yosunlutas2 = regions.getRegion("yosunlutas2");
            ProtectedRegion obsidyen1 = regions.getRegion("obsidyen1");
            ProtectedRegion obsidyen2 = regions.getRegion("obsidyen2");

            if (yosunlutas1.contains((int) b.getLocation().getX(), (int) b.getLocation().getY(), (int) b.getLocation().getZ()) || yosunlutas2.contains((int) b.getLocation().getX(), (int) b.getLocation().getY(), (int) b.getLocation().getZ())
                    || obsidyen1.contains((int) b.getLocation().getX(), (int) b.getLocation().getY(), (int) b.getLocation().getZ()) || obsidyen2.contains((int) b.getLocation().getX(), (int) b.getLocation().getY(), (int) b.getLocation().getZ())) {

                //YOSUNLU TAŞ
                if(event.getBlock().getType().equals(Material.MOSSY_COBBLESTONE)){
                    event.setCancelled(true);
                    event.getBlock().setType(Material.AIR);
                    if(Cooldown.checkCooldown(event.getPlayer())){
                        Cooldown.setCooldowns(event.getPlayer(), 15);
                        number.remove(player.getUniqueId());
                        number.put(player.getUniqueId(), 1);
                    }
                    else{
                        int amount = number.get(player.getUniqueId()) + 1;
                        number.put(player.getUniqueId(), amount);
                        Cooldown.setCooldowns(event.getPlayer(), 15);
                    }
                    addJeton(player, number.get(player.getUniqueId()));
                }

                //OBSİDYEN
                if(event.getBlock().getType().equals(Material.OBSIDIAN)){
                    event.setCancelled(true);
                    event.getBlock().setType(Material.AIR);
                    if(Cooldown.checkCooldown(event.getPlayer())){
                        Cooldown.setCooldowns(event.getPlayer(), 15);
                        number.remove(player.getUniqueId());
                        number.put(player.getUniqueId(), 10);
                    }
                    else{
                        int amount = number.get(player.getUniqueId()) + 10;
                        number.put(player.getUniqueId(), amount);
                        Cooldown.setCooldowns(event.getPlayer(), 15);
                    }
                    addJeton(player, number.get(player.getUniqueId()));
                }
            }
        }
    }

    private WorldGuardPlugin getWorldGuard() {
        Plugin plugin = l.getServer().getPluginManager().getPlugin("WorldGuard");
        return plugin != null && plugin instanceof WorldGuardPlugin ? (WorldGuardPlugin)plugin : null;
    }

    public void addJeton(Player killer, int number){
        CoinsAPI.addCoins(killer.getUniqueId().toString(), number);
        sendActionBar(killer, "§a+" + PixelMobCoin.FORMATTER.format(number) + " Jeton");
        killer.getWorld().playSound(killer.getLocation(), Sound.valueOf("NOTE_STICKS"), 1f, 1f);
    }

    public void deleteJeton(Player killer, int number){
        CoinsAPI.removeCoins(killer.getUniqueId().toString(), number);
        sendActionBar(killer, "§c-" + PixelMobCoin.FORMATTER.format(number) + " Jeton");
        killer.getWorld().playSound(killer.getLocation(), Sound.valueOf("NOTE_PLING"), 1f, 1f);
    }

    public void sendActionBar(Player p, String nachricht) {
        CraftPlayer cp = (CraftPlayer) p;
        IChatBaseComponent cbc = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + nachricht + "\"}");
        PacketPlayOutChat ppoc = new PacketPlayOutChat(cbc, (byte) 2);
        cp.getHandle().playerConnection.sendPacket(ppoc);
    }

}
