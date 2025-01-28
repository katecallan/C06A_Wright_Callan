
public class Burner {
    public enum Temperature {
        BLAZING("VERY HOT! DON'T TOUCH"),
        HOT("CAREFUL"),
        WARM("warm"),
        COLD("cooool");
        
        private String description;
        
        Temperature(String description) {
            this.description = description;
        }
        
        public String toString() {
            return description;
        }
    }
    
    public static final int TIME_DURATION = 2;
    private Temperature myTemperature;
    private Setting mySetting;
    private int timer;
    
    public Burner() {
        myTemperature = Temperature.COLD;
        mySetting = Setting.OFF;
        timer = 0;
    }
    
    public Temperature getMyTemperature() {
        return myTemperature;
    }
    
    public void plusButton() {
        switch (mySetting) {
            case OFF -> mySetting = Setting.LOW;
            case LOW -> mySetting = Setting.MEDIUM;
            case MEDIUM -> mySetting = Setting.HIGH;
            case HIGH -> {} // No change
        }
        timer = TIME_DURATION;
    }
    
    public void minusButton() {
        switch (mySetting) {
            case HIGH -> mySetting = Setting.MEDIUM;
            case MEDIUM -> mySetting = Setting.LOW;
            case LOW -> mySetting = Setting.OFF;
            case OFF -> {} // No change
        }
        timer = TIME_DURATION;
    }
    
    public void updateTemperature() {
        if (timer > 0) {
            timer--;
        }
        
        if (timer == 0) {
            switch (mySetting) {
                case HIGH -> myTemperature = Temperature.BLAZING;
                case MEDIUM -> myTemperature = Temperature.HOT;
                case LOW -> myTemperature = Temperature.WARM;
                case OFF -> myTemperature = Temperature.COLD;
            }
        }
    }
    
    public void display() {
        System.out.println(mySetting.toString() + "....." + myTemperature.toString());
    }
}