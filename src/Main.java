public class Main {

    public static void main(String[] args) {

        int sum=0;
        //start the for loop to count from 1 till 99
        for (int counter = 0; counter <=99 ; counter++ ){
            //if the number is divisible by two is even so the NOT gate will got the opposite which means odd numbers
            if(!(counter % 2 == 0)){
                sum += counter; //add counter which is an odd number to sum, and add again and so on...
            }




        }
        System.out.println("The sum of the all odds between 1 and 99 is: "+sum);
    }
}
