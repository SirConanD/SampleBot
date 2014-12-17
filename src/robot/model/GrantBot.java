package robot.model;

import lejos.nxt.*;

public class GrantBot 
{
    
	private UltrasonicSensor mySonar;
	private TouchSensor rightTouch;
	private TouchSensor leftTouch;
	private SoundSensor microphone;
	
	public GrantBot()
	{
		mySonar = new UltrasonicSensor(SensorPort.S1);
		rightTouch = new TouchSensor(SensorPort.S2);
		leftTouch = new TouchSensor(SensorPort.S3);
		microphone = new SoundSensor(SensorPort.S4);
	}
	
	/**
	 * 
	 */
	public void danceRobotDance()
	{
		
	}
	
	public void hasHaphephobia()
	{
		
		while (rightTouch.isPressed())
		{
			Motor.A.rotate(angle);
		}
	}
	
	/**
	 * 
	 */
	public void driveAroundRoom()
	{
	
		mySonar.getDistance();
		
	}
	
	/**
	 * 
	 * @param vertexCount
	 * @param length
	 */
	public void drawShape(int vertexCount, int length)
	{
		int angle = calculateAngle(vertexCount);
		
		for(int drawCount = 0; drawCount < vertexCount; drawCount++)
		{
			try 
			{
				Motor.A.forward();
				Motor.B.forward();
				Thread.sleep(length* 1000);
				Motor.A.stop();
				Motor.B.stop();
				Motor.A.rotate(-angle);
				Motor.B.rotate(angle);
			} 
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}
	}
	
	/**
	 * 
	 * @param vertexCount
	 * @return
	 */
	private int calculateAngle(int vertexCount)
	{
		int currentAngle = 0;
		
		if(vertexCount !=0)
		{
			currentAngle = 360/vertexCount;
		}
		
		return currentAngle;
	}
}
