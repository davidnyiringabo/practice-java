package rca.learn.co;

public class Person {
     public int age;
     protected String firstName;
     protected String lastName;

     public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int age, String firstName, String lastName){
         this.age = age;
         this.firstName = firstName;
         this.lastName = lastName;
    }

    public Person(){};

     public void getMyProfile(){
         System.out.println("My name is " + this.firstName + " " + this.lastName + ". I am " + this.age + " years old.");
     }

}