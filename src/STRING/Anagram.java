package STRING;

public class Anagram {
    public static void main(String[] args) {
        String s="Anagram";
String t="nagram";
boolean res=isAnagram(s,t);
        System.out.println(res);
    }
        public static boolean isAnagram(String s, String t) {
        char [] ch=new char[s.length()];
        char [] ch2=new char[t.length()];
            for(int i=0;i<s.length();i++){
                ch[i]=s.charAt(i);}
            for (int i = 0; i < t.length(); i++) {
                ch2[i]=t.charAt(i);
            }

            for(int i=1;i<t.length();i++){
                if(ch[i]!=ch2[i]){
                    return false;

                }
            }
    return true;
    }
}
