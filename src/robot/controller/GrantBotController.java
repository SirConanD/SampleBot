package robot.controller;

import lejos.nxt.Button;
import robot.model.GrantBot;

public class GrantBotController 
{
    private GrantBot myBot;
    
    public GrantBotController()
    {
    	myBot = new GrantBot();
    }
    
    
    public void start()
    {
    	myBot.drawShape(1, 1);
    	Button.waitForAnyPress();
    }
}
