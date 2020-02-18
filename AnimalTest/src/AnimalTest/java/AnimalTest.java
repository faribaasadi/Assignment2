package AnimalTest.java;

public class AnimalTest {

    public static void main(String[] args) {
        Animals dog = new Dog("Mamals", "Stella" ,9 , "Female" , "Home" );
        Animals cat = new Cat("Mamals", "Nano" ,4 , "Male" , "Home" );
        Animals racoon = new Racoon("Mamals", "Jingo" ,3 , "Male" , "Forest" );
        Animals whale = new Whale("Mamals", "Ann" ,6 , "Male" , "Ocean" );

        System.out.println("Dog inforomatin is: " + dog);
        ((Dog) dog).walk(); System.out.print(", "); dog.eat();System.out.print(", "); ((Dog) dog).bark();

        System.out.println("Cat information is: " + cat);
        ((Cat) cat).scratch(); System.out.print(", "); cat.move();System.out.print(", "); ((Cat) cat).greetHuman();

        System.out.println("Racoon information is: " + racoon);
        racoon.sleep(); System.out.print(", "); racoon.sound();System.out.print(", "); racoon.eat();

        System.out.println("Whale inforomation is: " + whale );
        whale.sleep(); System.out.print(", "); ((Whale) whale).swim(); System.out.print(", "); whale.move();
    }
}
