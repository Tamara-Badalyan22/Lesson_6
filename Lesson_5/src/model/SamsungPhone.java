package model;

public class SamsungPhone extends SmartPhone{
    private boolean TouchId;
    private boolean Pencil;

    public boolean isTouchId() {
        return TouchId;
    }

    public void setTouchId(boolean touchId) {
        this.TouchId = touchId;
    }

    public boolean isPencil() {
        return Pencil;
    }

    public void setPencil(boolean pencil) {
        this.Pencil = pencil;
    }


    public SamsungPhone(String model, String country, double price, int year, boolean TouchId, boolean Pencil) {
        super(model, country, price, year);
        this.TouchId = TouchId;
        this.Pencil = Pencil;
    }

    public SamsungPhone(String model, String country, double price, int year, double screenSize, int ram, boolean isSingleSim, boolean isNFC, boolean TouchId, boolean Pencil) {
        super(model, country, price, year, screenSize, ram, isSingleSim, isNFC);
        this.TouchId = TouchId;
        this.Pencil = Pencil;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("TouchId - " + isTouchId());
        System.out.println("Pencil - " + isPencil());
    }
}
