import java.util.Scanner;

public class SumAndAverageN {
    public static void main(String[] args) {

        int sumNumber=0; //start the variable to count the sum
        System.out.println("Input a positive number N:");
        Scanner keyboard = new Scanner(System.in);
        int usersNumber = keyboard.nextInt();

        //Validation: if the usersNumber is less or equals to zero Java will ask the number again
        while(usersNumber<=0){
            System.out.println("Input a positive number N:");
            usersNumber = keyboard.nextInt();
        }

        //For loop to calculate the sum of all numbers from 0 until the usersNumber
        for(int counter=0; counter <=usersNumber; counter++){
            sumNumber+=counter;
        }

        System.out.println("The sum of the numbers from 1 to "+usersNumber+
                " is "+sumNumber+" and the average is "+((double)sumNumber/usersNumber));
    }
}
