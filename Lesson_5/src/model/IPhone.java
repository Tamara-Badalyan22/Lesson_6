package model;

public class IPhone extends SmartPhone {

    private boolean FaceId;
    private boolean TouchId;
    private boolean BatteryCharger;


    public IPhone(String model, String country, double price, int year) {
        super(model, country, price, year);
    }

    public IPhone(String model, String country, double price, double screenSize, int ram, boolean isSingleSim, boolean isNFC, int year) {
        super(model, country, price, year, screenSize, ram, isSingleSim, isNFC);
    }

    public IPhone(String model, String country, double price, int year, double screenSize, int ram, boolean isSingleSim, boolean isNFC, boolean FaceId, boolean TouchId, boolean BatteryCharger) {
        super(model, country, price, year, screenSize, ram, isSingleSim, isNFC);
        setFaceId(FaceId);
        setTouchId(TouchId);
        setBatteryCharger(BatteryCharger);
    }

    public boolean isFaceId() {
        return FaceId;
    }

    public void setFaceId(boolean faceId) {
        this.FaceId = faceId;
    }

    public boolean isTouchId() {
        return TouchId;
    }

    public void setTouchId(boolean touchId) {
        TouchId = touchId;
    }

    public boolean isBatteryCharger() {
        return BatteryCharger;
    }

    public void setBatteryCharger(boolean batteryCharger) {
        this.BatteryCharger = batteryCharger;
    }

    @Override
    public void discount() {
        if (getYear() < 2017 && !isFaceId())
            System.out.println("New price is :" + getPrice() * 0.6);
        else
            System.out.println("No discount");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("FaceId - " + isFaceId());
        System.out.println("TouchId - " + isTouchId());
        System.out.println("BatteryCharger - " + isBatteryCharger());
    }
}
