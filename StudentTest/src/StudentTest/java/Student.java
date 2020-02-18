package StudentTest.java;

public class Student {

    public Student(String firstName, String lastName, int age, float gpa, String major, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
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

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    float gpa;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    String major;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    String department;

    public class Course {

        public void printSchedule() {

            if (major.equals("Computer Science")) {
                System.out.println("Mon-Wen: 7.30-9  T-Th: 12-2");

            } else if (major.equals("Computer Engeeniring")) {

                System.out.println("Friday: 2-4  Mon-Wen: 3-5");
            } else
                System.out.println("Unavailabe");
        }
    }
}

