 import java.util.Scanner;

public class GradingSystemRough
{
    public static void main(String args[])
    {
        int marks[] = new int[4];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<4; i++) { 
           System.out.print("Enter Score of Test"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        avg = total/4;
        System.out.print("The student's average grade is:");
        if(avg>=90)
        {
            System.out.print("A");
        }
        else if(avg>=80 && avg<90)
        {
           System.out.print("B");
        } 
        else if(avg>=70 && avg<80)
        {
            System.out.print("C");
        }
        else if(avg>=60 && avg<70)
        {
            System.out.print("D");
        }
        else {
          System.out.print("F");
        }
    
    } 
}
