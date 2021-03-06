package yxmingy.yupi;

import cn.nukkit.plugin.PluginBase;

public class Utils extends PluginBase{
	public static int buildId(String data){
	  int i,progress = 1,id = 0,length = data.length();
	  char[] cdatas = data.toCharArray();
	  for(i=0;i<length;i++){
	    id += ((int)(cdatas[i]))*progress;
	    progress *= 10;
	  }
	  return id;
	}
	public void onEnable() {
		getLogger().notice("YUPI is Enabled! Author: xMing.");
		getServer().getPluginManager().registerEvents(new HandlerManager(), this);
	}
	public void onDisable() {
		getLogger().warning("YUPI is Turned Off!");
	}
}
