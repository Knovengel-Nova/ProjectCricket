package projectcricket;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Aryan
 * 
 * This class helps to get input and generate random number for other classes.
 */
public class Util {
    
    
    public static int getRandomNumber(int upperBound){
        Random rand = new Random();
        return rand.nextInt(upperBound+1);
    }
    
    public static int inputNum(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(msg+": ");
        return sc.nextInt();
    }
    
    public static String inputStr(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(msg+": ");
        return sc.next();
    }
}
