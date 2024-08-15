package oopsdemo4;

class Count
{
    private static int cnt; // static variable
    private int a; //Instance variable

    Count()
    {
        cnt++;
        this.a=100;
    }

    //Define Static Method -
    public static void display(){
        System.out.println("The No. of Objects Created displayed using Static method: "+cnt);
        // a=a+10; //can use only static variables
    }

    //Define instance Methods
    public void print(){
        System.out.println("Instance Method Variable : "+a);
    }
}


public class StaticDemo {

    public static void main(String[] args)
    {
        Count c1=new Count();
        Count c2=new Count();
        Count c3=new Count();

        c3.print();//Invokes Instance method using object name

        Count.display();//Invokes static method using class name

    }
}
