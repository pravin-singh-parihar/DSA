package oops;
class A{
    public void m1(){
        System.out.println("Pravin");
    }public void m2(){
        System.out.println("Hemant");
    }
}
class B extends A{
    public void m1(){
        System.out.println("Rushikesh");
    }

}

public class InhartanceDemo {
    public static void main(String[] args) {
        B b=new B();
        b.m1();
        b.m2();


    }
}
