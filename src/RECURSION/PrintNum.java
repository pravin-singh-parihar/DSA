package RECURSION;

public class PrintNum {
    public static void main(String[] args) {
        printN(5);
        System.out.println("-----------------");
        printNum(5);
        System.out.println("------------------");
        printOdd(5);
    }
    public static void printN(int n){
        if (n==0)return;
        System.out.println(n);// 5 4 3 2 1
        printN(n-1);
    }
    public static void printNum(int n1){
        if (n1==0)return;
        printNum(n1-1);
        System.out.println(n1);// 1 2 3 4 5
    }
    public static void printOdd(int n){
        if (n%2==0)return;
        System.out.println(n);
        printOdd(n-2);

    }

}


