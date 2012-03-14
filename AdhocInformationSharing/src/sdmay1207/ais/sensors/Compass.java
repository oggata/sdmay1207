package sdmay1207.ais.sensors;

import sdmay1207.ais.sensors.SensorInterface.SensorType;

public abstract class Compass extends Sensor
{

	public Compass() 
	{
		super(SensorType.Compass);
	}
	
	public abstract CompassReading getReading();

	public class CompassReading
	{
		private float reading;
		
		public CompassReading(float reading)
		{
			this.reading = reading;
		}
		
		public float getReading(){
			return reading;
		}
	}
}
