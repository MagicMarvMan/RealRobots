package infchem.realrobots.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemInputPort4 extends Item {

    public ItemInputPort4(String string) {
    	super();
            maxStackSize = 1;
           
            setUnlocalizedName(string);
            setCreativeTab(CreativeTabs.tabRedstone);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon( "realrobots:leonardoinputport4");
    }
}
