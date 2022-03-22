package com.mod_author.mod_id
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

@Suppress("UNUSED")
object ModName: ModInitializer {
    private const val MOD_ID = "TestModThigamore"
    private val FABRIC_ITEM = Item(FabricItemSettings().group(ItemGroup.MISC))
    override fun onInitialize() {
        println("Example mod has been initialized.")
        Registry.register(Registry.ITEM, Identifier("test_mod", "fabric_item"), FABRIC_ITEM)}
}