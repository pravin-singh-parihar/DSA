package RECURSION;

public class Power {
    public static void main(String[] args) {
      int res=  power(8);
        System.out.print(res);
    }
    public static int power(int n){
        if (n==0)
            return 1;
         return  2*power(n-1);


    }
}
