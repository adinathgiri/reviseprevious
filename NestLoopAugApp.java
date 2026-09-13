public class NestLoopAugApp
{
    public static void main(String x[])throws Exception
	{
	    for(int i=1; i<=5; i++, System.out.printf("\n"))
		    for(int j=1; j<=5; System.out.print((j==1 || i==5 )?"*":" "),j++);
	}
}
 
