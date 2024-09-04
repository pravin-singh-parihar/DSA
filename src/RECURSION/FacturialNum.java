package RECURSION;

public class FacturialNum {
    public static void main(String[] args) {
      int res =  facturial(5);
        System.out.println(res);
    }
    public static int facturial(int n){
        if (n==0 || n==1){
        return 1;
        }
       return n* facturial(n-1);

    }
}
