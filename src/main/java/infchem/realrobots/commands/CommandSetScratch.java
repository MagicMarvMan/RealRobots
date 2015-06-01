package infchem.realrobots.commands;

import infchem.realrobots.RealRobots;

import java.io.File;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.common.config.Property.Type;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class CommandSetScratch extends CommandBase{

	@Override
	public String getCommandName() {
		return "scratch";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "/scratch ip <IP> sets the IP OR /scratch active <true|false> activates or deactivates the communication";
	}

	@Override
	public void processCommand(ICommandSender icommandsender, String[] astring) {
		File newFile = new File(Loader.instance().getConfigDir(), "RealRobots.cfg");
		Configuration config = new Configuration(newFile);
		config.load();

		if (astring[0].equals("active") && !astring[1].isEmpty()) {
			Property refreshData = new Property("active",astring[1],Type.BOOLEAN);
			//refreshData.comment = "Set to true if you want to communicate with your Pi";
			config.setCategoryComment("scratch", "Change IP:Port and enable communication here...");
			config.getCategory("scratch").put("active", refreshData);   		
			config.save();
			RealRobots.scratchEnabled = astring[1].equals("true");
		}
		if (astring[0].equals("ip") && !astring[1].isEmpty()) {
			Property refreshData = new Property("IP",astring[1],Type.STRING);
			//refreshData.comment = "The IP of your Pi";
			config.getCategory("scratch").put("IP", refreshData);   		
			config.save();
			RealRobots.scratchIp = astring[1].toString();
		}
			
	}
}