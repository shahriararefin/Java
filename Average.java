//Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class Average {
    
    public static void avg(int a, int b, int c){

        int sum= a+b+c;
        double average= (double)sum/3;
        System.out.println("Average is: "+average);
    
    }


    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z =sc.nextInt();

        avg(x,y,z);
    }

}
