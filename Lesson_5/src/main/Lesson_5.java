package main;

import model.IPhone;
import model.SamsungPhone;
import services.IPhoneService;
import services.SamsungPhoneService;

import java.util.Calendar;
import java.util.Scanner;

public class Lesson_5 {

    public static void main(String[] args) {
        String model = "IPhone 12 Pro";
        String country = "USA";
        int year = 2020;
        int price = 1000;
        IPhone phone = new IPhone(model, country, price, year);
        phone.setTouchId(true);
        phone.setFaceId(true);
        phone.setBatteryCharger(false);
        System.out.println("----------" + phone.getModel() + "-----------");
        phone.printInfo();
        System.out.println("-------------------------------------");

        SamsungPhone phone1=new SamsungPhone("Samsung Galaxy A5","USA",300,2018,false,false);
        System.out.println("----------" + phone1.getModel() + "-----------");
        phone1.printInfo();
        System.out.println("-------------------------------------");

        IPhoneService service=new IPhoneService();
        service.discountForPrice(phone);
        service.downloadApp("Instagram");
        service.sendMessage("Hello!","37455999999");

        System.out.println("---------------------------------------");
        SamsungPhoneService service1=new SamsungPhoneService();
        service1.discountForPrice(phone1);
        service.sendMessage("Hey!","37454534534534538453");
        service.internetConnection("qwerty");

    }
}
