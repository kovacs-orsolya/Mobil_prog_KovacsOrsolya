package com.example.hf7;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private String info;
    private int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Animal(String name, int image, String info) {
        this.name = name;
        this.info = info;
        this.image = image;
    }
    public static List<Animal> getAnimals() {
        List<Animal> contacts = new ArrayList<>();
        contacts.add(new Animal("Octopus", R.drawable.octopus3, "8 tentacled monster"));
        contacts.add(new Animal("Pig", R.drawable.disznyo, "Delicious in rolls"));
        contacts.add(new Animal("Sheep", R.drawable.sheep, "Nice in a stew"));
        contacts.add(new Animal("Rabbit", R.drawable.rabbit, "Great for jumpers"));
        contacts.add(new Animal("Snake", R.drawable.horse, "Scary"));
        contacts.add(new Animal("Spider", R.drawable.dog, "Scary"));
        contacts.add(new Animal("Spider", R.drawable.giraffe, "Scary"));
        contacts.add(new Animal("Spider", R.drawable.lion, "Scary"));
        contacts.add(new Animal("Spider", R.drawable.cat, "Scary"));
        return contacts;
    }
}
