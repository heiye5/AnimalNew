package com.animal;

/**
 * 抽象类
 * 模拟动物类的叫声
 */
public abstract class Animal {
    String animalName;
    String animalSound;

    public Animal(String animalName, String animalSound) {
        this.animalName = animalName;
        this.animalSound = animalSound;
    }

    public abstract void animalSoundPrint();
}
