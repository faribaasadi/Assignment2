package AnimalTest.java;

class Whale extends Animals {

    Whale(String typeOfanimal, String name, int age, String gender, String enviroment) {
        super(typeOfanimal, name, age, gender, enviroment);
    }

    @Override
    public void move() {
        System.out.println("Whale move Slow");
    }

    @Override
    public void sound() {
        System.out.println("clicks, whistles, and pulsed calls.");
    }

    @Override
    public void eat() {
        System.out.println("Whale eat food caught on the baleen");

    }
    @Override
    public void sleep() {
        System.out.print("Wahle sleep while swimming slowly next to another animal");

    }

    @Override
    public String toString(){
        return super.toString();
    }

    public void swim(){
        System.out.print("Whales are swimming");
    }
}

