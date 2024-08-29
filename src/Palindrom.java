import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String sc=scanner.next();
        String org_str=sc;
        String rev="";
        int len=sc.length();
        for (int i =len-1 ; i >=0 ; i--) {
            rev=rev+sc.charAt(i);

        }
      if (org_str.equals(rev)){
          System.out.println("Is palindroom String ");
      }else {
          System.out.println("is not palindroom string");
      }

        }


        }


