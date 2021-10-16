package net.pixelnw.pixelmobcoin.pixelmobcoin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemEditor {

    public static ItemStack kategoriKilic(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        item.addEnchantment(Enchantment.DAMAGE_ALL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aKılıçlar"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Kategori"));
        lore.add("");
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Birbirinden farklı özelliklere sahip"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7kılıçları buradan satın alabilirsin."));
        lore.add("");
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eAçmak için tıkla"));
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack kategoriKazma(){
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        item.addEnchantment(Enchantment.DIG_SPEED, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aKazmalar"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Kategori"));
        lore.add("");
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Birbirinden farklı özelliklere sahip"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7kazmaları buradan satın alabilirsin."));
        lore.add("");
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eAçmak için tıkla"));
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack kategoriYay(){
        ItemStack item = new ItemStack(Material.BOW);
        item.addEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aYaylar"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Kategori"));
        lore.add("");
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Birbirinden farklı özelliklere sahip"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7yayları buradan satın alabilirsin."));
        lore.add("");
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eAçmak için tıkla"));
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack kategoriSetler(){
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        item.addEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aSetler"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Kategori"));
        lore.add("");
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Birbirinden farklı özelliklere sahip"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7setleri buradan satın alabilirsin."));
        lore.add("");
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eAçmak için tıkla"));
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack kategoriDiger(){
        ItemStack item = new ItemStack(Material.STORAGE_MINECART);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aDiğer"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Kategori"));
        lore.add("");
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Buraya sığdıramadığımız diğer"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7eşyaları buradan satın alabilirsin."));
        lore.add("");
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eAçmak için tıkla"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack vipKazmaKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Verimlilik 4"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 4"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Servet 2"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a75.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&3VIP Kazma", lore, Material.DIAMOND_PICKAXE);

        return item;
    }

    public static ItemStack vipPKazmaKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Verimlilik 7"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 5"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Servet 3"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a125.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&3VIP&c+ &3Kazma", lore, Material.DIAMOND_PICKAXE);

        return item;
    }

    public static ItemStack mvipKazmaKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Verimlilik 8"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 6"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Servet 4"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a375.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&6MVIP Kazma", lore, Material.DIAMOND_PICKAXE);

        return item;
    }

    public static ItemStack mvipPKazmaKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Verimlilik 9"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 7"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Servet 4"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a750.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&6MVIP&c+ &6Kazma", lore, Material.DIAMOND_PICKAXE);

        return item;
    }

    public static ItemStack baronKazmaKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Verimlilik 10"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 8"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Servet 5"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a1.000.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&bBaron Kazma", lore, Material.DIAMOND_PICKAXE);

        return item;
    }

    public static ItemStack mozartKazmaKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Verimlilik 11"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 9"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Servet 6"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a1.500.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&cMozart Kazma", lore, Material.DIAMOND_PICKAXE);

        return item;
    }

    public static ItemStack dianaKazmaKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Verimlilik 12"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 10"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Servet 7"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a3.000.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&dDiana Kazma", lore, Material.DIAMOND_PICKAXE);

        return item;
    }

    public static ItemStack morpheusKazmaKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Verimlilik 13"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 11"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Servet 8"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a5.000.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&aMorpheus Kazma", lore, Material.DIAMOND_PICKAXE);

        return item;
    }


    public static ItemStack vipKilicKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Keskinlik 4"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 4"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Alevden Çehre 1"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Ganimet 1"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a75.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&3VIP Kılıç", lore, Material.DIAMOND_SWORD);

        return item;
    }

    public static ItemStack vipPKilicKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Keskinlik 7"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 5"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Alevden Çehre 2"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Ganimet 2"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a125.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&3VIP&c+ &3Kılıç", lore, Material.DIAMOND_SWORD);

        return item;
    }

    public static ItemStack mvipKilicKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Keskinlik 8"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 6"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Alevden Çehre 3"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Ganimet 3"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a375.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&6MVIP Kılıç", lore, Material.DIAMOND_SWORD);

        return item;
    }

    public static ItemStack mvipPKilicKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Keskinlik 9"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 7"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Alevden Çehre 4"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Ganimet 4"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a750.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&6MVIP&c+ &6Kılıç", lore, Material.DIAMOND_SWORD);

        return item;
    }

    public static ItemStack baronKilicKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Keskinlik 10"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 8"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Alevden Çehre 5"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Ganimet 5"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Darbe 2"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a1.000.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&bBaron Kılıç", lore, Material.DIAMOND_SWORD);

        return item;
    }

    public static ItemStack mozartKilicKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Keskinlik 11"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 9"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Alevden Çehre 6"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Ganimet 6"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Darbe 3"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a1.500.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&cMozart Kılıç", lore, Material.DIAMOND_SWORD);

        return item;
    }

    public static ItemStack DianaKilicKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Keskinlik 12"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 10"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Alevden Çehre 7"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Ganimet 7"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Darbe 4"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a3.000.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&dDiana Kılıç", lore, Material.DIAMOND_SWORD);

        return item;
    }

    public static ItemStack MorpheusKilicKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Keskinlik 13"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 11"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Alevden Çehre 8"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Ganimet 8"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Darbe 5"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a5.000.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&aMorpheus Kılıç", lore, Material.DIAMOND_SWORD);

        return item;
    }

    public static ItemStack vipSetKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Koruma 4"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 4"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a75.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&3VIP Set", lore, Material.DIAMOND_CHESTPLATE);

        return item;
    }

    public static ItemStack vipPSetKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Koruma 7"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 5"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a125.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&3VIP&c+ &3Set", lore, Material.DIAMOND_CHESTPLATE);

        return item;
    }

    public static ItemStack mvipSetKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Koruma 8"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 6"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a375.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&6MVIP Set", lore, Material.DIAMOND_CHESTPLATE);

        return item;
    }

    public static ItemStack mvipPSetKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Koruma 9"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 7"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a750.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&6MVIP&c+ &6Set", lore, Material.DIAMOND_CHESTPLATE);

        return item;
    }

    public static ItemStack baronSetKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Koruma 10"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 8"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a1.000.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&bBaron Set", lore, Material.DIAMOND_CHESTPLATE);

        return item;
    }

    public static ItemStack mozartSetKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Koruma 11"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 9"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a1.500.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&cMozart Set", lore, Material.DIAMOND_CHESTPLATE);

        return item;
    }

    public static ItemStack dianaSetKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Koruma 12"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 10"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a3.000.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&dDiana Set", lore, Material.DIAMOND_CHESTPLATE);

        return item;
    }

    public static ItemStack morpheusSetKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Koruma 13"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &8- &7Kırılmazlık 11"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a5.000.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&aMorpheus Set", lore, Material.DIAMOND_CHESTPLATE);

        return item;
    }

    public static ItemStack BaronKasaAnahtaritKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &7Kasa bölgesinde bulunan"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &7Baron Kasası'nı açmanı sağlar."));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a100.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&bBaron Kasası Anahtarı", lore, Material.TRIPWIRE_HOOK);

        return item;
    }

    public static ItemStack MozartKasaAnahtaritKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &7Kasa bölgesinde bulunan"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &7Mozart Kasası'nı açmanı sağlar."));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a500.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&cMozart Kasası Anahtarı", lore, Material.TRIPWIRE_HOOK);

        return item;
    }

    public static ItemStack DianaKasaAnahtaritKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &7Kasa bölgesinde bulunan"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &7Diana Kasası'nı açmanı sağlar."));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a1.000.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&dDiana Kasası Anahtarı", lore, Material.TRIPWIRE_HOOK);

        return item;
    }

    public static ItemStack SpawnerKasaAnahtaritKategori(){
        ArrayList<String> lore = new ArrayList<>();

        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Özellikler:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &7Kasa bölgesinde bulunan"));
        lore.add(ChatColor.translateAlternateColorCodes('&', " &7Spawner Kasası'nı açmanı sağlar."));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Fiyat: &a6.000.000 Jeton"));
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&eSatın almak için tıkla"));

        ItemStack item = esyaGoruntu("&6Spawner Kasası Anahtarı", lore, Material.TRIPWIRE_HOOK);

        return item;
    }

    public static ItemStack esyaGoruntu(String name, ArrayList<String> lore, Material material){
        ItemStack item = new ItemStack(material);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack vipKazma(){
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 4);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 2);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3VIP Kazma"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack vipPKazma(){
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 7);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3VIP&c+ &3Kazma"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack mvipKazma(){
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 8);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 6);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6MVIP Kazma"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack mvipPKazma(){
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 9);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 7);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6MVIP&c+ &6Kazma"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack BaronKazma(){
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 8);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 5);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bBaron Kazma"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack MozartKazma(){
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 11);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 6);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cMozart Kazma"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack DianaKazma(){
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 12);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 7);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&dDiana Kazma"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack MorpheusKazma(){
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 13);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 11);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 8);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aMorpheus Kazma"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack vipKilic(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 4);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3VIP Kılıç"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack vipPKilic(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 7);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 2);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3VIP&c+ &3Kılıç"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack mvipKilic(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 8);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 6);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 3);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 3);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6MVIP Kılıç"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack mvipPKilic(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 9);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 7);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 4);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6MVIP&c+ &6Kılıç"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack baronKilic(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 8);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 5);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 2);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bKaron Kılıç"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack MozartKilic(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 11);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 6);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 6);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 3);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cMozart Kılıç"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack DianaKilic(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 12);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 7);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 7);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&dDiana Kılıç"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack MorpheusKilic(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 13);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 11);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 8);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 8);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 5);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aMorpheus Kılıç"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack vipKask(){
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 4);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3VIP Kask"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack vipZirh(){
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 4);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3VIP Zırh"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack vipPantolon(){
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 4);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3VIP Pantolon"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack vipBot(){
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 4);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3VIP Bot"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack vipPKask(){
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 7);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3VIP&c+ &3Kask"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack vipPZirh(){
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 7);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3VIP&c+ &3Zırh"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack vipPPantolon(){
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 7);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3VIP&c+ &3Pantolon"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack vipPBot(){
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 7);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3VIP&c+ &3Bot"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack mvipKask(){
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 8);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 6);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6MVIP Kask"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack mvipZirh(){
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 8);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 6);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6MVIP Zırh"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack mvipPantolon(){
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 8);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 6);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6MVIP Pantolon"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack mvipBot(){
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 8);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 6);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6MVIP Bot"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack mvipPKask(){
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 9);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 7);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6MVIP&c+ &6Kask"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack mvipPZirh(){
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 9);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 7);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6MVIP&c+ &6Zırh"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack mvipPPantolon(){
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 9);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 7);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6MVIP&c+ &6Pantolon"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack mvipPBot(){
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 9);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 7);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6MVIP&c+ &6Bot"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack baronKask(){
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 8);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bBaron Kask"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack baronZirh(){
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 8);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bBaron Zırh"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack baronPantolon(){
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 8);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bBaron Pantolon"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack baronBot(){
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 8);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bBaron Bot"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack mozartKask(){
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 11);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cMozart Kask"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack mozartZirh(){
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 11);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cMozart Zırh"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack mozartPantolon(){
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 11);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cMozart Pantolon"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack mozartBot(){
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 11);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cMozart Bot"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack dianaKask(){
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 12);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&dDiana Kask"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack dianaZirh(){
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 12);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&dDiana Zırh"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack dianaPantolon(){
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 12);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cDiana Pantolon"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack dianaBot(){
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 12);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&dDiana Bot"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack morpheusKask(){
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 13);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 11);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aMorpheus Kask"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack morpheusZirh(){
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 13);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 11);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aMorpheus Zırh"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack morpheusPantolon(){
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 13);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 11);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aMorpheus Pantolon"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack morpheusBot(){
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 13);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 11);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aMorpheus Bot"));
        item.setItemMeta(meta);
        return item;
    }



}
