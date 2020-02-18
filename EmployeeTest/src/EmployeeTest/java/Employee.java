package EmployeeTest.java;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Employee extends Person{

    Scanner input = new Scanner(System.in);


    public Employee(String firstName, String lastName, int age, int socialSec, String address, String gender, float weight, String employeeId, String status, String startDate, double hourlyPay, double salary) {
        super(firstName, lastName, age, socialSec, address, gender, weight);
        this.employeeId = employeeId;
        this.status = status;
        this.startDate = startDate;
        this.hourlyPay = hourlyPay;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    String employeeId ;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    String status;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    String startDate;

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    double hourlyPay;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    double salary;

    int workHours;
    int workWeek;

    public void introduceEmpolee(){
        super.introduce();
        System.out.println(employeeId + " " + status + " " + startDate + " " + hourlyPay + " " + salary);
    }

    public double calculatePay(){
        if(status.equalsIgnoreCase("contractor") || status.equalsIgnoreCase("part time")){

            System.out.println("Enter the hours of the week you worked : ");
            workHours = input.nextInt();
            double pay = hourlyPay * workHours;
            System.out.println("Your pay is : ");
            return pay;

        }
        else
        {
            System.out.println("Enter number of weeks you worked : ");
            workWeek = input.nextInt();
            System.out.println("Your pay is : ");
            double pay = (salary/52) * workWeek ;
            return pay;

        }
    }
}

