import java.util.*;
public class Usingfortofindodd{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        for(i=1;i<=n;i+=2)
        {
            System.out.println(i);
        }
    }
}