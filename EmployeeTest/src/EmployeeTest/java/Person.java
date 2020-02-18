package EmployeeTest.java;

public class Person {
    public Person(String firstName, String lastName, int age, int socialSec, String address, String gender, float weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.socialSec = socialSec;
        this.address = address;
        this.gender = gender;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String firstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String lastName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int age;

    public int getSocialSec() {
        return socialSec;
    }

    public void setSocialSec(int socialSec) {
        this.socialSec = socialSec;
    }

    int socialSec;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    String address;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    String gender;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    float weight;

    public void introduce(){
        System.out.println(firstName + " " + lastName + " " + age + " " + socialSec + " " + address + " " + gender + " " + weight);
    }

    public String toString(){
        return firstName + " " + lastName + " " + address + " " + gender ;
    }
}
