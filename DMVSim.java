import java.util.Random;

public class DMVSim
{
    public static void main(String [] args)
    {
        System.out.println("Welcome to the DMV!");
 
        Random random = new Random();
        int number = random.nextInt(201);
        System.out.println("Here is your number: " + number);
        System.out.println("Please wait in line.");
       
        for(int count = number; count < 200; count++)
        {
            System.out.println(count + 1);
        }
        for(int count = 1; count <= number; count++)
        {
            System.out.println(count);
        }
       
        System.out.println("You have the wrong paper work.");
    }
}