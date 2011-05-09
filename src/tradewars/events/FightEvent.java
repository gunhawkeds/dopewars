/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tradewars.events;

import tradewars.Fight;
import tradewars.Game;
import tradewars.Message;

/**
 *
 * @author rob
 */
public class FightEvent extends Event {
  final static int CHANCE = 8;

  public FightEvent(Game game){
    super(game);
  }
  
  @Override
  public boolean inEvent() {
    return hit(CHANCE);
  }

  @Override
  public Message handleEvent(boolean yes) {
    Fight f = game.startFight();
    return new Message(String.format("%s just picked a fight with you. What do you want to do?", f.getNpc()));
  }

  @Override
  public boolean requiresInput() {
    return false;
  }
}