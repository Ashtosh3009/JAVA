import java.util.*;
class Cat{
    boolean hasfur;   //states
    string color,breed;
    int legs,eyes;
    public void walk()//this is a public method
    {
        System.out.println("cat is walking");
    }
    public void eat()
    {
        System.out.println("cat is sleeping");
    }
    public void discription()
    {
        System.out.println("my cat has "+legs+"legs and "+eyes+" eyes");
    }
    
}
class Dog{
    String breed,name;
    public void jump(){
        System.out.println("my dog "+name+" jumped.");
    }
    public void discription(){
        System.out.println("my dog's name is "+name);
    }
     
}

public class firstclass {
    public static void main(String[] args)
    {
        // Cat cat1=new Cat(); //making a object of class cat
        // cat1.legs=4;
        // cat1.eyes=2;//putting values in variables
        // cat1.walk();//function calling
        // Cat cat2=new Cat();
        // cat2.legs=4;
        // cat2.eyes=2;
        // cat2.eat();//function calling
        // cat1.discription();//function calling 
        // cat2.discription();
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        dog1.name="shero";
        dog2.name="bob";
        dog1.jump();
        dog1.discription();
        dog2.jump();
        dog2.discription();
    }
}
