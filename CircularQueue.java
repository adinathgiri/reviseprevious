import java.util.*;
public class CircularQueue
{   public static void main(String x[])
	{   Scanner xyz  = new Scanner(System.in);
	     int q[]=new int[5];
		 int size=0;
		 int rear=-1,front=0;
		do{
		   System.out.println("\n1:INSERT");
		   System.out.println("2:DELETE");
		   System.out.println("3:DISPLAY");
		   System.out.println("enter your choice");
		   int choice=xyz.nextInt();
		   switch(choice)
		   {
		       case 1:
			   if(size==q.length)
			   { System.out.println("Queue is full");
			   }
			   else{
			   System.out.println("Enter value from keyboard");
			   int value=xyz.nextInt();
			      rear=(rear+1)%(q.length);
				  q[rear]=value;
				  size++;
				System.out.println("Data Inserted in Queue ");
			   }
			   break;
			   case 2:
			   if(size==0)
			   { System.out.println("Queue is empty");
			   }
			   else{
			      int value=q[front];
				  front=(front+1)%q.length;
				  size--;
				  System.out.println("Deleled value is  "+value);
			   }
			   break;
			   case 3:
			   if(size==0)
			   { System.out.println("Queue is empty");
			   }
			   else{
			     int index=front;
			
				 for(int i=0; i<size; i++)
				 {
					 System.out.printf("%d\t",q[index]);
					 index=(index)%(rear);
					 index++;
				 }
			   }
			   break;
			   case 4:
			   System.exit(0);
			   break;
			   default:
			   System.out.println("Wrong choice");
		   }
		}while(true);
	}
}