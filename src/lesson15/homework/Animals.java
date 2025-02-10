package lesson15.homework;

import java.util.LinkedList;

public class Animals {
    LinkedList<String> animals;

    public Animals() {
        this.animals = new LinkedList<>();
    }

    public void addAnimal(String name) {
        animals.addFirst(name);
    }

    public void deleteAnimal() {
        animals.removeLast();
    }

    public void printAnimal() {
        for(String el: animals){
            System.out.print(el + " ");
        }
    }
}
