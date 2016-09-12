package Lab;

import java.util.Scanner;

/**
 * Created by castro on 9/9/16.
 */
public class Lab {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int userNumber = scanner.nextInt();

        int summing=0;

        for (int i =1 ;i<=userNumber;i++){

            summing += i;


        }
        System.out.println( summing);



    }

}
