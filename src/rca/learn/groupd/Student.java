package rca.learn.groupd;

/**
 * This is a
 */
public class Student {
    private String firstname;
    private String lastname;
    private String country;
    private int age;
    public String getCredentials() {
        return "{" +
                "}";
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Student(){ };
    public Student(int age, String fName, String lastname, String country){
        this.age = age;
        this.firstname = fName;
        this.lastname = lastname;
        this.country = country;
    }

    public static void main(String[] args){
        Student student = new Student(12,"David", "NYIRINGABO", "Rwanda");
        System.out.println(student.age + student.toString());
    }
}
