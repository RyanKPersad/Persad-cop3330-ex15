package Password_Validation;
import java.util.Scanner;
/**
 *  UCF COP3330 Summer 2021 Assignment 15 Solution
 *  Copyright 2021 Ryan Persad
 */

public class App 
{
    static  Scanner myObj = new Scanner(System.in);

    public static void main( String[] args )
    {
        String Password = "TigerKing/2950";
        String input;

        System.out.println( "What is the Password?" );
        input = myObj.nextLine();

        if (input.equals(Password)){
            System.out.println( "Welcome!" );

        }else {

            System.out.println( "I don't know you." );
        }


    }
}
