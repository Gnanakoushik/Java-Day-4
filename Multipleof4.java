import java.util.*;
public class Multipleof4{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            if((n&3)==0)
            {
                System.out.println("Multiple of 4");
            }
            else
            {
                System.out.println("Not a multiple of 4");
            }

            
            
        }
    }
}