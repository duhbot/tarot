package org.duh102.duhbot.tarot;

import java.util.*;

import org.duh102.duhbot.tarot.action.Action;
import org.pircbotx.Colors;
import org.pircbotx.hooks.*;
import org.pircbotx.hooks.events.*;

import org.duh102.duhbot.functions.*;

public class TarotPluginAdapter extends ListenerAdapter implements ListeningPlugin
{
  Action action;
  public TarotPluginAdapter()
  {
    action = new Action();
  }

  static String message;
  public void onMessage(MessageEvent event)
  {
    message = Colors.removeFormattingAndColors(event.getMessage());
    if(action.shouldAnswer(message)) {
      try {
        event.respond(action.performAction(message));
      } catch(Exception e) {
        event.respond("Something happened while retrieving your answer :(");
        e.printStackTrace();
      }
    }
  }

  public Map<String,String> getHelpFunctions()
  {
    return action.getHelp();
  }

  public String getPluginName()
  {
    return "Tarot";
  }

  public ListenerAdapter getAdapter()
  {
    return this;
  }
}
