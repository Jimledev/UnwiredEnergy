package fr.unwired.nrj;

import fr.unwired.nrj.init.BlocksMod;
import fr.unwired.nrj.init.ItemsMod;
import fr.unwired.nrj.init.RecipesMod;
import fr.unwired.nrj.proxy.ServerProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.MINECRAFT_VERSION)
public class UnwiredMod {

	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY , modId = References.MODID)
	public static ServerProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		BlocksMod.init();
		ItemsMod.init();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.register();
		RecipesMod.init();
	}
	
	@EventHandler
	public void init(FMLPostInitializationEvent event) {
		
	}
	
	
	
}
