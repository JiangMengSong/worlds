package xyz.juehen.worlds.register;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import xyz.juehen.worlds.Worlds;
import xyz.juehen.worlds.proxy.ClientProxy;
import xyz.juehen.worlds.register.block.metal.CopperOre;
import xyz.juehen.worlds.register.item.metal.CopperIngot;

/**
 * 注册类
 */
public class WorldsReg {
    public static Block COPPER_ORE;
    public static Item COPPER_INGOT;

    public WorldsReg(){
        COPPER_ORE = new CopperOre();
        COPPER_INGOT = new CopperIngot();
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
