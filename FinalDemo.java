/**
 *
 * Final Variable- Variable content cannot be modified
 * Final method - A final method cannot be overridden
 * Final class - Cannot extend a Final class
 */


package oopsdemo4;

class Demo{

    final void display(){
        System.out.println("Final Method in Base class");
    }
}

class MyDemo extends Demo{

    //Final methods cannot be overridden
    /*void display(){
        System.out.println("Final Method Overridden in Child class");
    }*/
}

final class Test{
    void display(){
        System.out.println("Method in Final class");
    }
}

    /*class MyTest extends Test{
        @Override
        void display() {
            super.display();
        }
    }*/

public class FinalDemo {
    public static void main(String[] args) {
        final int AGE = 20;

        //AGE = 23;
    }
}
