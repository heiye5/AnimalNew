package com.animal;

/**
 * 继承Animal抽象类
 * 重写抽象类中的抽象方法
 */
public class Cat extends Animal{

    public Cat(String animalName, String animalSound) {
        super(animalName, animalSound);
    }

    @Override
    public void animalSoundPrint() {
        System.out.println(animalName + "的叫声：" + animalSound);
    }
}
