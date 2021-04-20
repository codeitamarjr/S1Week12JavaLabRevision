public class Main {

    public static void main(String[] args) {

        int sumOdd=0, sumEven=0;//start the SUM variable with 0
        //start the for loop to count from 0 till 100 add 1 for each loop
        for (int counter = 0; counter <=100 ; counter++ ){

            //if the counter is NOT divisible by two is odd
            if(!(counter % 2 == 0)) sumOdd += counter; //if its odd Java will add this counter odd to sumOdd and so on...

            //if the counter is divisible by two is even
            if((counter % 2 == 0)) sumEven += counter; //if its even Java will add this counter even to sumEven and so on...
        }

        System.out.println("The sum of all Odd between 1 and 100 is: "+sumOdd);
        System.out.println("The sum of all even between 1 and 100 is: "+sumEven);
    }
}
