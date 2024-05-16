package Array;

public class FreqauncyOfElement
{
    public static void main(String[] args)
    {
        int[] arr={10,1,2,4,2,10};
        int[] res= new int [11];
        for (int i = 0; i <res.length ; i++)
        {
            res[arr[i]]=res[arr[i]]+1;
        }
        for (int i = 0; i < res.length; i++)
        {
            System.out.println(res[i]);
        }
    }
}


