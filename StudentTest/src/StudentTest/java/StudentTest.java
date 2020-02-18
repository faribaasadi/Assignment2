package StudentTest.java;/*
Fariba Asadi
Homework2, Excersice1
2/2020
CS151
 */

public class StudentTest {

    public static void main(String[] args) {
        Student outer = new Student("John" , "Smith" , 20 , 3.6f , "Computer Science", "Computer");
        Student.Course inner = outer.new Course();
        System.out.println("The schedule is : ");
        inner.printSchedule();
    }
}

