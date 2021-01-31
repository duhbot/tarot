package org.duh102.duhbot.tarot;

import java.util.*;

import org.pircbotx.hooks.*;
import org.pircbotx.hooks.events.*;

import org.duh102.duhbot.functions.*;

public class TarotPluginAdapter extends ListenerAdapter implements ListeningPlugin
{
  String string;
  public TarotPluginAdapter()
  {
    string = "Hello world!";
  }

  static String message;
  public void onMessage(MessageEvent event)
  {
    message = event.getMessage();
    if(message.startsWith("!template"))
    {
      event.respond(string);
    }
  }

  public Map<String,String> getHelpFunctions()
  {
    Map<String,String> helpFunctions = new HashMap<String,String>();
    helpFunctions.put("!template", String.format("Responds with %s", string));
    return helpFunctions;
  }

  public String getPluginName()
  {
    return "Plugin Template";
  }

  public ListenerAdapter getAdapter()
  {
    return this;
  }
}
