package infchem.realrobots.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRightMotorCounterclockwise extends Item {

	public ItemRightMotorCounterclockwise(String string) {
		super();
		maxStackSize = 1;
		setUnlocalizedName(string);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("realrobots:wedorightmotorcounterclockwise");
	}
}
