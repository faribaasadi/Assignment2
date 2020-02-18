package AnimalTest.java;

class Cat extends Animals implements Domesticated , Domesticated2 {


    Cat(String typeOfanimal, String name, int age, String gender, String enviroment) {
        super(typeOfanimal, name, age, gender, enviroment);
    }

    @Override
    public void move() {
        System.out.print("Cat move 5 m/r");
    }

    @Override
    public void sound() {
        System.out.println("Meow");

    }

    @Override
    public void eat() {
        System.out.println("Cats eat Mouse");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep alot");

    }
    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public void greetHuman() {
        System.out.println("Cat greet human\n");
    }

    @Override
    public void walk() {
        System.out.println("Cat walk");

    }

    @Override
    public void scratch() {
        System.out.print("Cat scratch");
    }
}
