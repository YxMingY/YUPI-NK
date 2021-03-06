package yxmingy.yupi;

import cn.nukkit.Player;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public abstract class GarishHandlerBase extends HandlerBase{

  abstract void handle(String[] data, Player player);

  /**
   * Coverting JSON data which is from server to String[]
   */
  public void handle(String data,Player player) {
    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();
    Object[] pdata = gson.fromJson(data, new TypeToken<Object[]>() {
    }.getType());
    if (null == pdata) {
      pdata = new Object[1];
      pdata[0] = "";
    }
    String[] sdata = new String[pdata.length];
    int i = 0;
    for (Object o : pdata) {
      sdata[i] = String.valueOf(o);
      i++;
    }
    handle(sdata, player);
  }
}
