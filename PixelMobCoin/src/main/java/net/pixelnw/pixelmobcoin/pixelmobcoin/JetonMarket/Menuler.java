package net.pixelnw.pixelmobcoin.pixelmobcoin.JetonMarket;

import com.hakan.inventoryapi.InventoryAPI;
import com.hakan.inventoryapi.inventory.ClickableItem;
import com.hakan.inventoryapi.inventory.HInventory;
import com.hakan.inventoryapi.inventory.Pagination;
import de.NeonnBukkit.CoinsAPI.API.CoinsAPI;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import net.pixelnw.pixelmobcoin.pixelmobcoin.PixelMobCoin;
import net.pixelnw.pixelmobcoin.pixelmobcoin.Utils.ItemEditor;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menuler {

    public void openMenuKategori(Player player){
        HInventory hInventory = InventoryAPI.getInstance(PixelMobCoin.plugin).getInventoryCreator().setTitle("Jeton Marketi").setClosable(true).setSize(4).setId("b").create();

        ItemStack kapat = new ItemStack(Material.BARRIER, 1);
        ItemMeta kapatmeta = kapat.getItemMeta();
        kapatmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cKapat"));
        kapat.setItemMeta(kapatmeta);

        hInventory.setItem(31, ClickableItem.of(kapat, (event) -> {
            hInventory.close(player);
        }));

        hInventory.setItem(10, ClickableItem.of(ItemEditor.kategoriKilic(), (event) -> {
            openKiliclar(player);
        }));

        hInventory.setItem(12, ClickableItem.of(ItemEditor.kategoriKazma(), (event) -> {
            openKazmalar(player);
        }));

        hInventory.setItem(14, ClickableItem.of(ItemEditor.kategoriSetler(), (event) -> {
            openSetler(player);
        }));

        hInventory.setItem(16, ClickableItem.of(ItemEditor.kategoriDiger(), (event) -> {
           openDiger(player);
        }));


        hInventory.open(player);

    }

    public void openKiliclar(Player player){
        HInventory hInventory = InventoryAPI.getInstance(PixelMobCoin.plugin).getInventoryCreator().setTitle("Jeton Marketi").setClosable(true).setSize(5).setId("b").create();

        ItemStack kapat = new ItemStack(Material.BARRIER, 1);
        ItemMeta kapatmeta = kapat.getItemMeta();
        kapatmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cGeri Dön"));
        kapat.setItemMeta(kapatmeta);

        hInventory.setItem(40, ClickableItem.of(kapat, (event) -> {
            openMenuKategori(player);
        }));

        hInventory.setItem(11, ClickableItem.of(ItemEditor.vipKilicKategori(), (event) -> {
            itemControl(player, 75000, ItemEditor.vipKilic());
        }));
        hInventory.setItem(12, ClickableItem.of(ItemEditor.vipPKilicKategori(), (event) -> {
            itemControl(player, 125000, ItemEditor.vipPKilic());
        }));
        hInventory.setItem(13, ClickableItem.of(ItemEditor.mvipKilicKategori(), (event) -> {
            itemControl(player, 375000, ItemEditor.mvipKilic());
        }));
        hInventory.setItem(14, ClickableItem.of(ItemEditor.mvipPKilicKategori(), (event) -> {
            itemControl(player, 750000, ItemEditor.mvipPKilic());
        }));
        hInventory.setItem(15, ClickableItem.of(ItemEditor.baronKilicKategori(), (event) -> {
            itemControl(player, 1000000, ItemEditor.baronKilic());
        }));
        hInventory.setItem(21, ClickableItem.of(ItemEditor.mozartKilicKategori(), (event) -> {
            itemControl(player, 1500000, ItemEditor.MozartKilic());
        }));
        hInventory.setItem(22, ClickableItem.of(ItemEditor.DianaKilicKategori(), (event) -> {
            itemControl(player, 3000000, ItemEditor.DianaKilic());
        }));
        hInventory.setItem(23, ClickableItem.of(ItemEditor.MorpheusKilicKategori(), (event) -> {
            itemControl(player, 5000000, ItemEditor.MorpheusKilic());
        }));


        hInventory.open(player);

    }

    public void openDiger(Player player){
        HInventory hInventory = InventoryAPI.getInstance(PixelMobCoin.plugin).getInventoryCreator().setTitle("Jeton Marketi").setClosable(true).setSize(5).setId("b").create();

        ItemStack kapat = new ItemStack(Material.BARRIER, 1);
        ItemMeta kapatmeta = kapat.getItemMeta();
        kapatmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cGeri Dön"));
        kapat.setItemMeta(kapatmeta);

        hInventory.setItem(40, ClickableItem.of(kapat, (event) -> {
            openMenuKategori(player);
        }));

        hInventory.setItem(11, ClickableItem.of(ItemEditor.BaronKasaAnahtaritKategori(), (event) -> {
            itemControlKasa(player, 100000, "&bBaron Kasası", "baron");
        }));

        hInventory.setItem(12, ClickableItem.of(ItemEditor.MozartKasaAnahtaritKategori(), (event) -> {
            itemControlKasa(player, 500000, "&cMozart Kasası", "mozart");
        }));

        hInventory.setItem(13, ClickableItem.of(ItemEditor.DianaKasaAnahtaritKategori(), (event) -> {
            itemControlKasa(player, 1000000, "&dDiana Kasası", "diana");
        }));

        hInventory.setItem(14, ClickableItem.of(ItemEditor.SpawnerKasaAnahtaritKategori(), (event) -> {
            itemControlKasa(player, 6000000, "&6Spawner Kasası", "spawner");
        }));

        hInventory.open(player);

    }

    public void openSetler(Player player){
        HInventory hInventory = InventoryAPI.getInstance(PixelMobCoin.plugin).getInventoryCreator().setTitle("Jeton Marketi").setClosable(true).setSize(5).setId("b").create();

        ItemStack kapat = new ItemStack(Material.BARRIER, 1);
        ItemMeta kapatmeta = kapat.getItemMeta();
        kapatmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cGeri Dön"));
        kapat.setItemMeta(kapatmeta);

        hInventory.setItem(40, ClickableItem.of(kapat, (event) -> {
            openMenuKategori(player);
        }));

        hInventory.setItem(11, ClickableItem.of(ItemEditor.vipSetKategori(), (event) -> {
            itemControl(player, 75000, "&3VIP", ItemEditor.vipKask(), ItemEditor.vipZirh(), ItemEditor.vipPantolon(), ItemEditor.vipBot());
        }));
        hInventory.setItem(12, ClickableItem.of(ItemEditor.vipPSetKategori(), (event) -> {
            itemControl(player, 125000, "&3VIP&c+", ItemEditor.vipPKask(), ItemEditor.vipPZirh(), ItemEditor.vipPPantolon(), ItemEditor.vipPBot());
        }));
        hInventory.setItem(13, ClickableItem.of(ItemEditor.mvipSetKategori(), (event) -> {
            itemControl(player, 375000, "&6MVIP", ItemEditor.mvipKask(), ItemEditor.mvipZirh(), ItemEditor.mvipPantolon(), ItemEditor.mvipBot());
        }));
        hInventory.setItem(14, ClickableItem.of(ItemEditor.mvipPSetKategori(), (event) -> {
            itemControl(player, 750000, "&6MVIP&c+", ItemEditor.mvipPKask(), ItemEditor.mvipPZirh(), ItemEditor.mvipPPantolon(), ItemEditor.mvipPBot());
        }));
        hInventory.setItem(15, ClickableItem.of(ItemEditor.baronSetKategori(), (event) -> {
            itemControl(player, 1000000, "&bBaron", ItemEditor.baronKask(), ItemEditor.baronZirh(), ItemEditor.baronPantolon(), ItemEditor.baronBot());
        }));
        hInventory.setItem(21, ClickableItem.of(ItemEditor.mozartSetKategori(), (event) -> {
            itemControl(player, 1500000, "&cMozart", ItemEditor.mozartKask(), ItemEditor.mozartZirh(), ItemEditor.mozartPantolon(), ItemEditor.mozartBot());
        }));
        hInventory.setItem(22, ClickableItem.of(ItemEditor.dianaSetKategori(), (event) -> {
            itemControl(player, 3000000, "&dDiana", ItemEditor.dianaKask(), ItemEditor.dianaZirh(), ItemEditor.dianaPantolon(), ItemEditor.dianaBot());
        }));
        hInventory.setItem(23, ClickableItem.of(ItemEditor.morpheusSetKategori(), (event) -> {
            itemControl(player, 5000000, "&aMorpheus", ItemEditor.morpheusKask(), ItemEditor.morpheusZirh(), ItemEditor.morpheusPantolon(), ItemEditor.morpheusBot());
        }));



        hInventory.open(player);

    }

    public void openKazmalar(Player player){
        HInventory hInventory = InventoryAPI.getInstance(PixelMobCoin.plugin).getInventoryCreator().setTitle("Jeton Marketi").setClosable(true).setSize(5).setId("b").create();

        ItemStack kapat = new ItemStack(Material.BARRIER, 1);
        ItemMeta kapatmeta = kapat.getItemMeta();
        kapatmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cGeri Dön"));
        kapat.setItemMeta(kapatmeta);

        hInventory.setItem(40, ClickableItem.of(kapat, (event) -> {
            openMenuKategori(player);
        }));

        hInventory.setItem(11, ClickableItem.of(ItemEditor.vipKazmaKategori(), (event) -> {
            itemControl(player, 75000, ItemEditor.vipKazma());
        }));
        hInventory.setItem(12, ClickableItem.of(ItemEditor.vipPKazmaKategori(), (event) -> {
            itemControl(player, 125000, ItemEditor.vipPKazma());
        }));
        hInventory.setItem(13, ClickableItem.of(ItemEditor.mvipKazmaKategori(), (event) -> {
            itemControl(player, 375000, ItemEditor.mvipKazma());
        }));
        hInventory.setItem(14, ClickableItem.of(ItemEditor.mvipPKazmaKategori(), (event) -> {
            itemControl(player, 750000, ItemEditor.mvipPKazma());
        }));
        hInventory.setItem(15, ClickableItem.of(ItemEditor.baronKazmaKategori(), (event) -> {
            itemControl(player, 1000000, ItemEditor.BaronKazma());
        }));
        hInventory.setItem(21, ClickableItem.of(ItemEditor.mozartKazmaKategori(), (event) -> {
            itemControl(player, 1500000, ItemEditor.MozartKazma());
        }));
        hInventory.setItem(22, ClickableItem.of(ItemEditor.dianaKazmaKategori(), (event) -> {
            itemControl(player, 3000000, ItemEditor.DianaKazma());
        }));
        hInventory.setItem(23, ClickableItem.of(ItemEditor.morpheusKazmaKategori(), (event) -> {
            itemControl(player, 5000000, ItemEditor.MorpheusKazma());
        }));

        hInventory.open(player);

    }


    public void itemControl(Player player, int amount, String name, ItemStack item1, ItemStack item2, ItemStack item3, ItemStack item4){
        new Onay().open(player, (state) -> {
            if(state){
                checkMoney(player, name, amount, item1, item2, item3, item4);
            }
            else {
                player.closeInventory();
            }

        });
    }

    public void itemControl(Player player, int amount, ItemStack item){
        new Onay().open(player, (state) -> {
            if(state){
                checkMoney(player, amount, item);
            }
            else {
                player.closeInventory();
            }

        });
    }

    public void itemControlKasa(Player player, int amount, String name, String kasaName){
        new Onay().open(player, (state) -> {
            if(state){
                checkMoneyKasa(player, amount, name, kasaName);
            }
            else {
                player.closeInventory();
            }

        });
    }

    public void checkMoney(Player player, String name, int amount, ItemStack item1, ItemStack item2, ItemStack item3, ItemStack item4){
        String formatter = "##,###,###";
        DecimalFormat df = new DecimalFormat(formatter);
        String yetersiz = ChatColor.translateAlternateColorCodes('&', "&cHata &8» &7Hesabınızda yeterli jeton yok!");
        int coinMiktar = CoinsAPI.getCoins(player.getUniqueId().toString());

        if(coinMiktar >= amount){
            deleteJeton(player, amount);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aBaşarılı &8» &7Başarıyla " + name + " &7setini &a" + df.format(amount) + " &ajeton &7karşılığında satın aldınız."));
            player.getInventory().addItem(item1);
            player.getInventory().addItem(item2);
            player.getInventory().addItem(item3);
            player.getInventory().addItem(item4);
        }
        else{
            player.sendMessage(yetersiz);
        }
    }

    public void checkMoneyKasa(Player player, int amount, String name, String kasaName){
        String formatter = "##,###,###";
        DecimalFormat df = new DecimalFormat(formatter);
        String yetersiz = ChatColor.translateAlternateColorCodes('&', "&cHata &8» &7Hesabınızda yeterli jeton yok!");
        int coinMiktar = CoinsAPI.getCoins(player.getUniqueId().toString());
        String cmd = "cc give physical " + kasaName + " 1 " + player.getName();

        if(coinMiktar >= amount){
            deleteJeton(player, amount);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aBaşarılı &8» &7Başarıyla " + name + " &7anahtarını &a" + df.format(amount) + " &ajeton &7karşılığında satın aldınız."));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), cmd);
        }
        else{
            player.sendMessage(yetersiz);
        }
    }

    public void checkMoney(Player player, int amount, ItemStack item){
        String formatter = "##,###,###";
        DecimalFormat df = new DecimalFormat(formatter);
        String yetersiz = ChatColor.translateAlternateColorCodes('&', "&cHata &8» &7Hesabınızda yeterli jeton yok!");
        int coinMiktar = CoinsAPI.getCoins(player.getUniqueId().toString());

        if(coinMiktar >= amount){
            deleteJeton(player, amount);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aBaşarılı &8» &7Başarıyla " + item.getItemMeta().getDisplayName() + " &7eşyasını &a" + df.format(amount) + " &ajeton &7karşılığında satın aldınız."));
            player.getInventory().addItem(item);
        }
        else{
            player.sendMessage(yetersiz);
        }
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
