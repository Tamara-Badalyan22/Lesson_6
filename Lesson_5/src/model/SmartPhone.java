package model;

public class SmartPhone extends Technique {
    private double screenSize;
    private int ram;
    private boolean isSingleSim;
    private boolean isNFC;

    public SmartPhone() {

    }

    public SmartPhone(String model, String country, double price, int year) {
        super(model, country, price, year);
    }

    public SmartPhone(String model, String country, double price, int year, double screenSize, int ram, boolean isSingleSim, boolean isNFC) {
        super(model, country, price, year);
        setScreenSize(screenSize);
        setRam(ram);
        setNFC(isNFC);
        setSingleSim(isSingleSim);
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        if (screenSize > 0)
            this.screenSize = screenSize;
        else
            System.out.println("Invalid value");
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram > 0)
            this.ram = ram;
        else
            System.out.println("Invalid value");
    }

    public boolean isSingleSim() {
        return isSingleSim;
    }

    public void setSingleSim(boolean singleSim) {
        isSingleSim = singleSim;
    }

    public boolean isNFC() {
        return isNFC;
    }

    public void setNFC(boolean NFC) {
        isNFC = NFC;
    }

    @Override
    public void discount() {
        if (getYear() < 2016 && isSingleSim() && !isNFC())
            System.out.println("New price is : " + getPrice() * 0.7);
        else
            System.out.println("No discount");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("ScreenSize - "+getScreenSize());
        System.out.println("RAM - "+getRam());
        System.out.println("SingleSim - "+isSingleSim());
        System.out.println("NFC - "+isNFC());

    }
}
