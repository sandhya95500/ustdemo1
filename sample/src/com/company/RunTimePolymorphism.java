package com.company;
class RunTimePolymorphism
{
    public void animalSound()
    {
        System.out.println("Dog barks as bowww");
    }
}
class Cat extends RunTimePolymorphism
{
    @Override
    public void animalSound()
    {
        System.out.println("Cat sounds as Mewwwww");
    }
    public static void main(String[] args)
    {
        RunTimePolymorphism r = new Cat();
        r.animalSound();
    }
}
