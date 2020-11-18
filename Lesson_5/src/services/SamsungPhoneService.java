package services;

import interfaces.IPhone;
import model.SamsungPhone;
import model.Technique;

public class SamsungPhoneService implements IPhone {
    @Override
    public void sendMessage(String text, String phoneNumber) {
       if(text!=null && phoneNumber.matches("374(.*)") && phoneNumber.length() == 11 ){
           System.out.println("Message Send");
       }
       else{
           System.out.println("Inavlid number");
       }
    }

    @Override
    public void call(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("374(.*)") && phoneNumber.length() == 11) {
            System.out.println(" Calling  to " + phoneNumber);
        }
        else{
            System.out.println("Invalid Number!");
        }
    }

    @Override
    public boolean downloadApp(String appName) {
        if(appName!=null){
            System.out.println("Downloading from PlayMarket");
            return true;
        }
        System.out.println("Failed");
        return false;
    }


    @Override
    public void discountForPrice( Technique model) {
        if (model.getPrice() < 150000 && model.getYear() < 2019)
            System.out.println("New price is :" + model.getPrice() * 0.6);
        else
            System.out.println("Price is " + model.getPrice());
    }

    @Override
    public void internetConnection(String password) {
        if(password.length()<6)
            System.out.println("Connection failed");
        else
            System.out.println("Succes");
    }
}
