package AnimalTest.java;
import java.sql.SQLOutput;

class Dog extends Animals implements Domesticated {


    Dog(String typeOfanimal, String name, int age, String gender, String enviroment) {
        super(typeOfanimal, name, age, gender, enviroment);
    }

    @Override
    public void move() {
        System.out.println("Dogs move 40m/r");
    }

    @Override
    public void sound() {
        System.out.println("Dog sound is : Hap Hap");

    }

    @Override

    public void eat() {
        System.out.print("Dogs eat Rice");

    }
    @Override
    public void sleep() {
        System.out.println(" Dog sleep during the night");

    }


    public void greetHuman() {
        System.out.println(" Greet Human!");
    }
    public void walk() {
        System.out.print("Dog can walk");

    }
    public void bark(){
        System.out.println("Dog are barking\n");
    }
    public String toString(){
        return super.toString();
    }
}

