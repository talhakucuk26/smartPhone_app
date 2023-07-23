package org.example;

import java.awt.dnd.DragSourceMotionListener;

class Product {
    int id;
    String name;
    double price;
}

class Phone extends Product {
    int storage;
    int ram;
    int camera;

    public Phone() {
    }

    public Phone(int id, String name, double price, int storage, int ram, int camera) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }
}

public class PhonePrice {

    public static void main(String[] args) {
        Phone[] phoneArray = new Phone[5];
        phoneArray[0] = new Phone(1, "Phone 1", 2000.0, 32, 8, 36);
        phoneArray[1] = new Phone(2, "Phone 2", 4000.0, 64, 8, 42);
        phoneArray[2] = new Phone(3, "Phone 3", 3500.0, 32, 8, 42);
        phoneArray[3] = new Phone(4, "Phone 4", 8000.0, 128, 12, 48);
        phoneArray[4] = new Phone(5, "Phone 5", 12000.0, 128, 12, 56);

        double pricePhones = calculatePrice(phoneArray);
        System.out.println("Toplam Fiyat: " + pricePhones);

    }

    public static double calculatePrice(Phone[] phoneArray) {
        double toplam = 0;
        for (Phone phone : phoneArray) {
            toplam += phone.price;
        }
        return toplam;
    }
}

