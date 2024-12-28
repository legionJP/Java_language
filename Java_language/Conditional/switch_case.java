package Conditional;

import java.util.Scanner;

public class switch_case {
    public static void main(String a[])
    {  
        //int n =8;
        Scanner scanner = new Scanner(System.in);
        //int n = 4;
        System.out.print("Enter a Day Num : ");
        int n = scanner.nextInt();
        
        switch (n) {
            case 1:
                System.out.println("Day1- Mon");
                break;

            case 2:
                System.out.println("Day2- Tue");
                break;

            case 3:
                System.out.println("Day3- Mon");
                break;

            case 4:
                System.out.println("Day4- Wed");
                break;

            case 5:
                System.out.println("Day5- Fri");
                break;

            case 6:
                System.out.println("Day6- Sat");
                break;

            case 7:
                System.out.println("Day7- Sun");
                break;        
        default:
                System.out.println("Enter the valid Day ");

        }
       
    }
    
}
