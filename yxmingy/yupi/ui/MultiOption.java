package yxmingy.yupi.ui;

import java.util.*;
import java.util.ArrayList;


public class MultiOption extends UIBase{

  /*Map button
  [
    "text"=>(String)
    "image"=>
    [
      type=>{path/url}
      data=>(String)
    ]
  ]
  */
  private ArrayList<Map<String, Object>> buttons = new ArrayList<>();;
  
  public MultiOption(String title)
  {
    super("form",title);
    data.put("content","");
    data.put("buttons",buttons);
  }
  public void setContent(String text)
  {
    data.put("content",text);
  }
  public void addButton(String text)
  {
    Map<String,Object> button = new LinkedHashMap<>();
    button.put("text",text);
    buttons.add(button);
  }
  public void addButton(String text,boolean image_local,String image_data)
  {
    Map<String,Object> button = new LinkedHashMap<>(),
                       image = new LinkedHashMap<>();
    image.put("type",image_local ? "path" : "url");
    image.put("data",image_data);
    button.put("text",text);
    button.put("image",image);
    buttons.add(button);
  }
}
