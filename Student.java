/**
 * Static Keyword demo
 */


package oopsdemo4;

public class Student {

    private int rollNumber;
    private String name;
    private static String college="AOT"; //static variable


    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    //Static method
    public static void collegeChange()
    {
        college="Wipro";
    }



    //instance method
    public void display(){

        System.out.println(this.rollNumber+" "+this.name+" "+college);
    }

}
