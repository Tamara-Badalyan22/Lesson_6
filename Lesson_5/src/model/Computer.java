package model;

public class Computer extends Technique {
    private int ram;
    private int processorSpeed;
    private String processorName;
    private String operatingSystem;

    public Computer(){

    }
    public Computer(String model, String country, double price, int year) {
        super(model, country, price, year);
    }

    public Computer(String model, String country, double price, int year, int ram, int processorSpeed, String processorName, String operatingSystem) {
        super(model, country, price, year);
        setRam(ram);
        setProcessorSpeed(processorSpeed);
        setProcessorName(processorName);
        setOperatingSystem(operatingSystem);
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

    public int getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(int processorSpeed) {
        if (processorSpeed > 0)
            this.processorSpeed = processorSpeed;
        else
            System.out.println("Invalid value");
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        if (processorName != null && processorName.length() != 0)
            this.processorName = processorName;
        else
            System.out.println("Invalid value");
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        if (operatingSystem != null && operatingSystem.length() != 0)
            this.operatingSystem = operatingSystem;
        else
            System.out.println("Invalid value");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("RAM - "+getRam());
        System.out.println("processorSpeed - "+getProcessorSpeed());
        System.out.println("processorName - "+getProcessorName());
        System.out.println("operatingSystem - "+getOperatingSystem());
    }
}
