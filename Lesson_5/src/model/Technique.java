package model;

public class Technique {
    private String model;
    private String country;
    private int year;
    private double price;

    public Technique(){

    }
    public Technique(String model, String country, double price, int year) {
        setModel(model);
        setCountry(country);
        setPrice(price);
        setYear(year);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && model.length() != 0)
            this.model = model;
        else
            System.out.println("Model field can't be empty");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && country.length() != 0)
            this.country = country;
        else
            System.out.println("Country field can't be empty");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            System.out.println("Price can't be negative");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 2000)
            this.year = year;
        else
            System.out.println("Invalid year");
    }

    public void discount() {
        if (year < 2015)
            System.out.println("New price is :" + (price * 0.9));
        else
            System.out.println("No discount");
    }

   public void printInfo(){
       System.out.println("Model - "+getModel());
       System.out.println("Country - "+getCountry());
       System.out.println("Price - "+getPrice());
       System.out.println("Year - "+getYear());
   }
}
