public class Main {

    public static void main(String[] args) {

        int sumOdd=0, sumEven=0;//start the SUM variable with 0
        //start the for loop to count from 0 till 100 add 1 for each loop
        for (int counter = 1; counter <=100 ; counter+=2 ) {
            if(!(counter % 2 == 0)) sumOdd += counter;
        }

        //bellow is more efficient
        for (int counter = 2; counter <=100 ; counter+=2 ) {
            sumEven += counter;
        }

        System.out.println("The sum of all Odd between 1 and 100 is: "+sumOdd);
        System.out.println("The sum of all even between 1 and 100 is: "+sumEven);
    }
}
