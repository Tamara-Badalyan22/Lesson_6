package interfaces;

import model.SamsungPhone;

public interface IPhone extends ITechnique {
    void sendMessage(String text,String phoneNumber);
    void call(String phoneNumber);
    boolean downloadApp(String appName);

}
