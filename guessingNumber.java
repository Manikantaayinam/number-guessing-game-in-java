import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc= new Scanner(System.in);
        int randomNumber = random.nextInt(101); // generates random number between 0 and 100
        
     
        int p=5;
           while(true)
            {
                 int guessingNumber=sc.nextInt();
                 if(randomNumber==guessingNumber)
                 {
                     System.out.print("congrats you got "+p+" points");
                     break;
                 } 
                 else if(guessingNumber>randomNumber)
                 {
                     if(p==1)
                     {
                     System.out.print("you lost");
                     break;
                     }
                     System.out.print("Hoo Too High! Enter Some Lower Number");
                     p--;
                 }
                 else
                 {
                     if(p==1)
                    {
                     System.out.print("you lost");
                     break;
                    }
                     System.out.print("Hoo Too Low! Enter Some Higher Number");
                     p--;
                 }
                 
        }
        
    }
}