package me.de1v;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class CustomArmor extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Registering Armor");
        Bukkit.addRecipe(getHelmetRecipe());
        Bukkit.addRecipe(getChestplateRecipe());
        Bukkit.addRecipe(getLegginsRecipe());
        Bukkit.addRecipe(getBootsRecipe());
        Bukkit.addRecipe(getSwordRecipe());
        Bukkit.addRecipe(getPickaxeRecipe());
        Bukkit.addRecipe(getAxeRecipe());
        Bukkit.addRecipe(getShovelRecipe());
        Bukkit.addRecipe(getHoeRecipe());
        getLogger().info(ChatColor.LIGHT_PURPLE + "Custom Armor is Loaded!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabling Armor");
    }

    // HELMET
    public ShapedRecipe getHelmetRecipe() {
        ItemStack item = new ItemStack(Material.NETHERITE_HELMET);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Enderium Helmet");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
        meta.addEnchant(Enchantment.THORNS, 4, true);
        meta.addEnchant(Enchantment.OXYGEN, 4, true);
        meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.isUnbreakable();
        final List<String> lore = new ArrayList<String>();
        lore.add("");
        lore.add(ChatColor.GREEN + "Best Enchantments");
        lore.add(ChatColor.GOLD + "Part of Enderium Set");
        meta.setLore((List) lore);

        item.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(this, "enderium_helmet");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("ABC", "IHD", "GFE");

        recipe.setIngredient('H', Material.NETHERITE_HELMET);
        recipe.setIngredient('A', Material.DRAGON_BREATH);
        recipe.setIngredient('B', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('C', Material.END_CRYSTAL);
        recipe.setIngredient('D', Material.ENCHANTING_TABLE);
        recipe.setIngredient('E', Material.ELYTRA);
        recipe.setIngredient('F', Material.NETHER_STAR);
        recipe.setIngredient('G', Material.ENCHANTED_GOLDEN_APPLE);
        recipe.setIngredient('I', Material.HEART_OF_THE_SEA);

        return recipe;
    }
    // Chestplate
    public ShapedRecipe getChestplateRecipe() {
        ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Enderium Chestplate");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
        meta.addEnchant(Enchantment.THORNS, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.isUnbreakable();
        final List<String> lore = new ArrayList<String>();
        lore.add("");
        lore.add(ChatColor.GREEN + "Best Enchantments");
        lore.add(ChatColor.GOLD + "Part of Enderium Set");
        meta.setLore((List) lore);

        item.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(this, "enderium_chestplate");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("ABC", "IHD", "GFE");

        recipe.setIngredient('H', Material.NETHERITE_CHESTPLATE);
        recipe.setIngredient('A', Material.DRAGON_BREATH);
        recipe.setIngredient('B', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('C', Material.END_CRYSTAL);
        recipe.setIngredient('D', Material.ENCHANTING_TABLE);
        recipe.setIngredient('E', Material.ELYTRA);
        recipe.setIngredient('F', Material.NETHER_STAR);
        recipe.setIngredient('G', Material.ENCHANTED_GOLDEN_APPLE);
        recipe.setIngredient('I', Material.HEART_OF_THE_SEA);

        return recipe;
    }
    // LEGGINS
    public ShapedRecipe getLegginsRecipe() {
        ItemStack item = new ItemStack(Material.NETHERITE_LEGGINGS);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Enderium Leggings");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
        meta.addEnchant(Enchantment.THORNS, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.isUnbreakable();
        final List<String> lore = new ArrayList<String>();
        lore.add("");
        lore.add(ChatColor.GREEN + "Best Enchantments");
        lore.add(ChatColor.GOLD + "Part of Enderium Set");
        meta.setLore((List) lore);

        item.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(this, "enderium_leggings");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("ABC", "IHD", "GFE");

        recipe.setIngredient('H', Material.NETHERITE_LEGGINGS);
        recipe.setIngredient('A', Material.DRAGON_BREATH);
        recipe.setIngredient('B', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('C', Material.END_CRYSTAL);
        recipe.setIngredient('D', Material.ENCHANTING_TABLE);
        recipe.setIngredient('E', Material.ELYTRA);
        recipe.setIngredient('F', Material.NETHER_STAR);
        recipe.setIngredient('G', Material.ENCHANTED_GOLDEN_APPLE);
        recipe.setIngredient('I', Material.HEART_OF_THE_SEA);

        return recipe;
    }
    // Boots
    public ShapedRecipe getBootsRecipe() {
        ItemStack item = new ItemStack(Material.NETHERITE_BOOTS);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Enderium Boots");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
        meta.addEnchant(Enchantment.THORNS, 4, true);
        meta.addEnchant(Enchantment.SOUL_SPEED, 3, true);
        meta.addEnchant(Enchantment.DEPTH_STRIDER, 3, true);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.isUnbreakable();
        final List<String> lore = new ArrayList<String>();
        lore.add("");
        lore.add(ChatColor.GREEN + "Best Enchantments");
        lore.add(ChatColor.GOLD + "Part of Enderium Set");
        meta.setLore((List) lore);

        item.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(this, "enderium_boots");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("ABC", "IHD", "GFE");


        recipe.setIngredient('H', Material.NETHERITE_BOOTS);
        recipe.setIngredient('A', Material.DRAGON_BREATH);
        recipe.setIngredient('B', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('C', Material.END_CRYSTAL);
        recipe.setIngredient('D', Material.ENCHANTING_TABLE);
        recipe.setIngredient('E', Material.ELYTRA);
        recipe.setIngredient('F', Material.NETHER_STAR);
        recipe.setIngredient('G', Material.ENCHANTED_GOLDEN_APPLE);
        recipe.setIngredient('I', Material.HEART_OF_THE_SEA);

        return recipe;
    }
    // SWORD
    public ShapedRecipe getSwordRecipe() {
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Enderium Sword");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 5, true);
        meta.addEnchant(Enchantment.KNOCKBACK, 1, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 4, true);
        meta.addEnchant(Enchantment.SWEEPING_EDGE, 4, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.isUnbreakable();
        final List<String> lore = new ArrayList<String>();
        lore.add("");
        lore.add(ChatColor.GREEN + "Best Enchantments");
        lore.add(ChatColor.GOLD + "Part of Enderium Set");
        meta.setLore((List) lore);

        item.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(this, "enderium_sword");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("ABC", "IHD", "GFE");

        recipe.setIngredient('H', Material.NETHERITE_SWORD);
        recipe.setIngredient('A', Material.DRAGON_BREATH);
        recipe.setIngredient('B', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('C', Material.END_CRYSTAL);
        recipe.setIngredient('D', Material.ENCHANTING_TABLE);
        recipe.setIngredient('E', Material.ELYTRA);
        recipe.setIngredient('F', Material.NETHER_STAR);
        recipe.setIngredient('G', Material.ENCHANTED_GOLDEN_APPLE);
        recipe.setIngredient('I', Material.HEART_OF_THE_SEA);

        return recipe;
    }
    // PICKAXE
    public ShapedRecipe getPickaxeRecipe() {
        ItemStack item = new ItemStack(Material.NETHERITE_PICKAXE);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Enderium Pickaxe");
        meta.addEnchant(Enchantment.DIG_SPEED, 9, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.isUnbreakable();
        final List<String> lore = new ArrayList<String>();
        lore.add("");
        lore.add(ChatColor.GREEN + "Best Enchantments");
        lore.add(ChatColor.GOLD + "Part of Enderium Set");
        meta.setLore((List) lore);

        item.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(this, "enderium_pickaxe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("ABC", "IHD", "GFE");

        recipe.setIngredient('H', Material.NETHERITE_PICKAXE);
        recipe.setIngredient('A', Material.DRAGON_BREATH);
        recipe.setIngredient('B', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('C', Material.END_CRYSTAL);
        recipe.setIngredient('D', Material.ENCHANTING_TABLE);
        recipe.setIngredient('E', Material.ELYTRA);
        recipe.setIngredient('F', Material.NETHER_STAR);
        recipe.setIngredient('G', Material.ENCHANTED_GOLDEN_APPLE);
        recipe.setIngredient('I', Material.HEART_OF_THE_SEA);

        return recipe;
    }
    // AXE
    public ShapedRecipe getAxeRecipe() {
        ItemStack item = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Enderium Axe");
        meta.addEnchant(Enchantment.DIG_SPEED, 9, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.isUnbreakable();
        final List<String> lore = new ArrayList<String>();
        lore.add("");
        lore.add(ChatColor.GREEN + "Best Enchantments");
        lore.add(ChatColor.GOLD + "Part of Enderium Set");
        meta.setLore((List) lore);

        item.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(this, "enderium_axe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("ABC", "IHD", "GFE");

        recipe.setIngredient('H', Material.NETHERITE_AXE);
        recipe.setIngredient('A', Material.DRAGON_BREATH);
        recipe.setIngredient('B', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('C', Material.END_CRYSTAL);
        recipe.setIngredient('D', Material.ENCHANTING_TABLE);
        recipe.setIngredient('E', Material.ELYTRA);
        recipe.setIngredient('F', Material.NETHER_STAR);
        recipe.setIngredient('G', Material.ENCHANTED_GOLDEN_APPLE);
        recipe.setIngredient('I', Material.HEART_OF_THE_SEA);

        return recipe;
    }
    // SHOVEL
    public ShapedRecipe getShovelRecipe() {
        ItemStack item = new ItemStack(Material.NETHERITE_SHOVEL);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Enderium Shovel");
        meta.addEnchant(Enchantment.DIG_SPEED, 9, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.isUnbreakable();
        final List<String> lore = new ArrayList<String>();
        lore.add("");
        lore.add(ChatColor.GREEN + "Best Enchantments");
        lore.add(ChatColor.GOLD + "Part of Enderium Set");
        meta.setLore((List) lore);

        item.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(this, "enderium_shovel");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("ABC", "IHD", "GFE");

        recipe.setIngredient('H', Material.NETHERITE_SHOVEL);
        recipe.setIngredient('A', Material.DRAGON_BREATH);
        recipe.setIngredient('B', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('C', Material.END_CRYSTAL);
        recipe.setIngredient('D', Material.ENCHANTING_TABLE);
        recipe.setIngredient('E', Material.ELYTRA);
        recipe.setIngredient('F', Material.NETHER_STAR);
        recipe.setIngredient('G', Material.ENCHANTED_GOLDEN_APPLE);
        recipe.setIngredient('I', Material.HEART_OF_THE_SEA);

        return recipe;
    }
    // HOE
    public ShapedRecipe getHoeRecipe() {
        ItemStack item = new ItemStack(Material.NETHERITE_HOE);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Enderium Hoe");
        meta.addEnchant(Enchantment.DIG_SPEED, 9, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.isUnbreakable();
        final List<String> lore = new ArrayList<String>();
        lore.add("");
        lore.add(ChatColor.GREEN + "Best Enchantments");
        lore.add(ChatColor.GOLD + "Part of Enderium Set");
        meta.setLore((List) lore);

        item.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(this, "enderium_hoe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("ABC", "IHD", "GFE");

        recipe.setIngredient('H', Material.NETHERITE_HOE);
        recipe.setIngredient('A', Material.DRAGON_BREATH);
        recipe.setIngredient('B', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('C', Material.END_CRYSTAL);
        recipe.setIngredient('D', Material.ENCHANTING_TABLE);
        recipe.setIngredient('E', Material.ELYTRA);
        recipe.setIngredient('F', Material.NETHER_STAR);
        recipe.setIngredient('G', Material.ENCHANTED_GOLDEN_APPLE);
        recipe.setIngredient('I', Material.HEART_OF_THE_SEA);

        return recipe;
    }
}
