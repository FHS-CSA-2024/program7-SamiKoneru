package src.main.java;
import java.lang.Math;
import java.util.Scanner;
//Your code here

public class Program7{
    final double klevinConvert = 1.0/20;
    final double stanleyConvert = 1.0/240;


    public static void main(String[] args){
        //Make you own test code here
        Program7 tester = new Program7();
        
        
        double myTestVal = 0.0;
        
        System.out.println("Enter schrute-bucks: ");
        Scanner mySchrute = new Scanner(System.in);
        int schruteValue = mySchrute.nextInt();
        System.out.println("Enter klevins: ");
        Scanner myKlevins = new Scanner(System.in);
        int klevinsValue = myKlevins.nextInt();
        System.out.println("Enter stanley-nickels: ");
        Scanner myStanley = new Scanner(System.in);
        int stanleyValue = myStanley.nextInt();
        
        
        myTestVal = tester.convertMoney(schruteValue,klevinsValue,stanleyValue);
        
        System.out.println("Decimal schrute-bucks: " + myTestVal);
        
        
    }
    
    
    
    public double convertMoney(int schruteBucks, int klevins, int stanleyNickels){
        double klevinsDecimal = klevins * klevinConvert;
        double stanleyDecimal = stanleyNickels * stanleyConvert;
        return Math.round((schruteBucks + klevinsDecimal + stanleyDecimal) * 100.0) / 100.0;
    }
    
    
}

/*
Console Output:

Enter schrute-bucks: 
7
Enter klevins: 
17
Enter stanley-nickels: 
9
Decimal schrute-bucks: 7.89
*/
