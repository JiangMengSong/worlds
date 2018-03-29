package xyz.juehen.worlds.register;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import xyz.juehen.worlds.Worlds;
import xyz.juehen.worlds.proxy.ClientProxy;
import xyz.juehen.worlds.register.block.mechanical.part.Wire_Copper;
import xyz.juehen.worlds.register.block.metal.Ore_Copper;
import xyz.juehen.worlds.register.item.metal.Hammer;
import xyz.juehen.worlds.register.item.metal.Ingot_Copper;

/**
 * 注册类
 */
public class WorldsReg {
    public static Block ORE_COPPER;
    public static Item INGOT_COPPER;
    public static Block WIRE_COPPER;
    public static Item HAMMER;

    public WorldsReg(){
        ORE_COPPER = new Ore_Copper();
        INGOT_COPPER = new Ingot_Copper();
        WIRE_COPPER = new Wire_Copper();
        HAMMER = new Hammer();
    }

    public static void worldsReg(Block block, Item item){
        ForgeRegistries.ITEMS.register(item);
        if(null != block){
            ForgeRegistries.BLOCKS.register(block);
            item = Item.getItemFromBlock(block);
        }
        if (Worlds.proxy instanceof ClientProxy)
            ModelLoader.setCustomModelResourceLocation(item, 0,
                    new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
