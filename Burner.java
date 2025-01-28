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


	public Temperature getMyTemperature() {
        return myTemperature;
    }

    public void plusButton() { // Increases the setting
        switch (mySetting) {
            case OFF:
                mySetting = Setting.LOW;
                break;
            case LOW:
                mySetting = Setting.MEDIUM;
                break;
            case MEDIUM:
                mySetting = Setting.HIGH;
                break;
            case HIGH:
                break;
        }
        timer = TIME_DURATION; // Resets timer
    }
	
	

}