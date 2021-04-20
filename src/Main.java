public class Main {

    public static void main(String[] args) {

        int sum=0;//start the SUM variable
        //start the for loop to count from 1 till 99, instead of start the for-loop with 1 and add 2 for each loop
        //I'm checking the odds through an IF statement and NOT gate:
        for (int counter = 0; counter <=99 ; counter++ ){
            //if the number is divisible by two is even so the NOT gate will got the opposite which means all the odd numbers
            if(!(counter % 2 == 0)){
                sum += counter; //add the counter which is an odd number to sum, and add again and so on...
            }
        }
        System.out.println("The sum of the all odds between 1 and 99 is: "+sum);
    }
}
