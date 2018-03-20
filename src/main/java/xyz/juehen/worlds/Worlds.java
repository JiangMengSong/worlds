package xyz.juehen.worlds;

import xyz.juehen.worlds.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Worlds.MODID, name = Worlds.NAME, version = Worlds.VERSION)
public class Worlds
{
    public static final String MODID = "worlds";
    public static final String NAME = "Worlds";
    public static final String VERSION = "1.0.0";

    public static Logger logger;

    @Instance(MODID)
    public static Worlds instance;

    @SidedProxy(clientSide = "xyz.juehen.worlds.proxy.ClientProxy",
            serverSide = "xyz.juehen.worlds.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
}
