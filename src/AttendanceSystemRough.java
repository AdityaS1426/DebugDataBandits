//WILL ADD MORE FEATURES NEXT WEEK
 
import java.util.Scanner;

public class AttendanceSystemRough
{
    public static void main(String args[])
    {
        int attendance[] = new int[5];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<5; i++) { 
           System.out.print("Enter Attendance for Day"+(i+1)+":");
           attendance[i] = scanner.nextInt();
           total += attendance[i];
           //If present, enter in 1, If absent enter in 0
            }
          scanner.close();
       
if(total == 5){
          System.out.println("You have perfect attendance!");
        }
        else if(total < 5){
          System.out.println("You have missed 1 or more days. Please call the attendance office to excuse your absence.");
        }
        else if(total <= 2){
          System.out.println("You have 3 or more unexcused absences. You must attend Saturday school to make up for these absences.");
        }
        } 
}
