package xyz.juehen.worlds.register.block.metal;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import xyz.juehen.worlds.register.WorldsReg;

/**
 * 铜矿石
 */
public class CopperOre extends Block {

    public CopperOre() {
        super(Material.ROCK);
        this.setSoundType(SoundType.STONE);//表示方块踩上去的声音
        this.setHardness(50.0f);//表示方块硬度 黑曜石的硬度为50
        this.setHarvestLevel("pickaxe", 2);// pickaxe表示镐子（axe表示斧子 shovel表示铲子） 2表示铁镐以上才能挖掘（3-钻石 1-石 0-木/金）
        this.setUnlocalizedName("copper_ore");
        this.setRegistryName("copper_ore");
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        WorldsReg.worldsReg(this,new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
}
