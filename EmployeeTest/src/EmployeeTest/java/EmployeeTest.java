package EmployeeTest.java;
/*
Fariba Asadi
Homework2 , Excersice3
2/2O20
CS151
 */

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee("Joe" , "Smith" , 54 ,  203563 , "123 Andrews Ave" , "male" ,
                210f , "56546" , "contractor" , "2/5/2020" , 60 , 0.0 );

        Employee employee2 = new Employee("Joe" , "Smith" , 54 ,  203563 , "123 Andrews Ave" , "male" ,
                210f , "56546" , "full time" , "2/5/2020" , 0 , 110.0 );

        System.out.printf("%.2f", employee2.calculatePay());
    }
}

