public class Burner{

	public enum Temperature { // Enum for temperature levels
		BLAZING, HOT, WARM, COLD;
	}

	public static final int TIME_DURATION = 2; // Constants and instance variables
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;

	public Burner() { // Constructor
		this.myTemperature = Temperature.COLD;
		this.mySetting = Setting.OFF;
		this.timer = 0;
	}



}