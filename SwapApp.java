import java.util.*; //step1
public class SwapApp
{
    public static void main(String x[])
	{
	   Scanner xyz = new Scanner(System.in);//step2
	   System.out.println("Enter two values");
	   int a=xyz.nextInt();
	   int b=xyz.nextInt();
	   System.out.println("Before swapping\n");
	   System.out.printf("A=%d\tB=%d\n",a,b);
	   a=a^b;
	   b=a^b;
	   a=a^b;
	   System.out.println("After swapping\n");
	   System.out.printf("A=%d\tB=%d\n",a,b);
	
	}
}