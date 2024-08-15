package oopsdemo4;

public class StaticDemo2 {

    public static void main(String[] args)
    {
        Student s1=new Student(87,"Rajdip");
        Student s2=new Student(88,"Rajdeep");
        Student s3=new Student(89,"Prabaho");
        Student s4=new Student(90,"Pritam");


        System.out.println("************ Student Details ***************");
        s1.display();;
        s2.display();
        s3.display();
        s4.display();

        //Invoke static method for college change
        Student.collegeChange();

        System.out.println("****************After College Change ***************");
        s1.display();;
        s2.display();
        s3.display();
        s4.display();
    }
}
