package oops;

// -------------------- Interfaces --------------------

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

interface GPS {
    void navigate();
}

// -------------------- Parent Class --------------------

class ElectronicDevice {

    public void powerOn() {
        System.out.println("Device Powered ON");
    }

    public void powerOff() {
        System.out.println("Device Powered OFF");
    }
}

// -------------------- Child Class --------------------

class Mobile extends ElectronicDevice {

    public void call() {
        System.out.println("Calling...");
    }
}

// -------------------- Grandchild Class --------------------

class SmartPhone extends Mobile implements Camera, MusicPlayer, GPS {
    @Override
    public void takePhoto() {
        System.out.println("Photo Captured");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music");
    }

    @Override
    public void navigate() {
        System.out.println("Opening Google Maps");
    }

    public void browseInternet() {
        System.out.println("Browsing Internet");
    }
}

// -------------------- Main Class --------------------

public class InterfaceDemo {
    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone();

        // Methods from ElectronicDevice
        phone.powerOn();
        
        // Methods from Mobile
        phone.call();

        // Methods from Interfaces
        phone.takePhoto();
        phone.playMusic();
        phone.navigate();

        // Own Method
        phone.browseInternet();

        phone.powerOff();
    }
}