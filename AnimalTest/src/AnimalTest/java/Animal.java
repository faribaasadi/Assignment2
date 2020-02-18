package AnimalTest.java;

abstract class  Animals {
    private String typeOfanimal;
    private String name;
    private int age;
    private String gender;
    private String enviroment;

    Animals(String typeOfanimal, String name, int age, String gender, String enviroment) {
        this.typeOfanimal = typeOfanimal;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.enviroment = enviroment;
    }

    public String getTypeOfanimal() {
        return typeOfanimal;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEnviroment() {
        return enviroment;
    }

    public void setTypeOfanimal(String typeOfanimal) {
        this.typeOfanimal = typeOfanimal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEnviroment(String enviroment) {
        this.enviroment = enviroment;
    }
    public String toString(){
        return typeOfanimal + " " + name + " " + age +" " + gender + " " + enviroment ;
    }

    public abstract void move();
    public abstract void sound();
    public abstract void eat();
    public abstract void sleep();


}
