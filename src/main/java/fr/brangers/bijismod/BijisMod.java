package fr.brangers.bijismod;

import fr.brangers.bijismod.register.RegisterBlocks;
import net.fabricmc.api.ModInitializer;

public class BijisMod implements ModInitializer {

	public static final String MODID = "bijismod";

	@Override
	public void onInitialize() {
		RegisterBlocks.registerBlock();
	}
}
