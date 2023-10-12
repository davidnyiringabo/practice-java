package rca.learn.co;

public class Employee extends Person{
    private final String institution;
    private final long salary;
    private final String position;

    public Employee(String institution, String position, long salary, String firstName, String lastName, int age){
//        this.age = age;
//        this.firstName = firstName;
//        this.lastName = lastName;
        super(age, firstName, lastName);
        this.institution = institution;
        this.salary = salary;
        this.position = position;
    }
    public Employee(){
        this.institution = "Vista innovations co.";
        this.salary = 232000000;
        this.position = "CEO & Founder";
    }

    @Override
    public String toString() {
        return "Employee{ \n" +
                "  institution:'" + institution + '\'' +
                ",\n  salary:" + salary +
                ",\n  position:'" + position + '\'' + "\n" +
                '}';
    }


    public static void main(String[] args){
        Employee e = new Employee("Vista innovations co.", "Coordinate manager", 2300000, "Gakundo","Hope", 19);
        System.out.println(e);
        e.getMyProfile();
    }
}
