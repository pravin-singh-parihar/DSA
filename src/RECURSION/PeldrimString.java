package RECURSION;

public class PeldrimString {


    public static void main(String[] args) {
        String name="aba";
        System.out.println( paledram(name,0,name.length()-1));
    }
    public static  boolean paledram (String string,int i,int j){

        if (i<=j)
if (string.charAt(i)!=string.charAt(j)) {
    return false;
}else {
    return true;
}
return paledram(string, i+1, j-1);
    }
}
