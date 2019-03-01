package Ejercicios_Planteados;

import java.util.Scanner;

/**
 *
 * @author german
 * 
 */

public class AveriguaDiaDeLaSemanaNacimiento {
   
    public static void main(String[] args) {
      
   Scanner scan = new Scanner(System.in); 
 
    int DD = 32, MM = 13, YYYY = -1, NYYYY, NMM, IDAY, day, flag = 0;
    
    String month[] = {"January","February","March","April","May","June","July",
                      "August","September","October","November","December"};
 
    
    System.out.printf("Ingresa el dia: ");
    
    DD = scan.nextInt();
    
    System.out.printf("el mes: ");
    MM = scan.nextInt(); 
    
    System.out.println("el año: ");
    YYYY = scan.nextInt();    
     
    if(DD == 32 && MM == 13 && YYYY == -1)
        {
            System.out.println("Please enter your birthday in this ");
            System.out.println("format(including spaces): ");
            System.out.println("DD MM YYYY              ");
            System.out.println("22 01 1997              ");         
        }
    
    if(DD <= 0)
    {
        //Error Message: User has given invalid input for "Days" & "Months" fields
        if(MM <= 0)
        {             
             System.out.println("We don't have negative or null days and months. ");
             System.out.println("                 Try again!                    ");
             
        }
        
        //Error Message: User has given invalid input for "Days" field
        System.out.println("We don't have negative or null days.");
        System.out.println("Try again!              ");
         
    }
    
    if(MM <= 0)
    {
        //Error Message: User has given invalid input for "Months" field
        System.out.println("We don't have negative or null months.");
        System.out.println("               Try again!               ");        
    }
    
    if(DD > 31 || MM > 12 || YYYY <= 0)
    {
        if(DD > 31 && MM > 12)
        {
            //Error Message: User has given invalid input for "Days", "Months" & "Years" fields
            if(YYYY <= 0)
            {
                System.out.println("We have 12 months, the days of a month are up to 31");
                System.out.println("and a year should be a positive number.");
                System.out.println("Try again!");
            }
            //Error Message: User has given invalid input for "Days" & "Months" fields
            else
            {
               System.out.println("We have 12 months and  ");
                System.out.println("the days of a month are up to 31.");
                System.out.println("Try again! ");
            }
                
        }
        else if(DD > 31 && MM <= 12)
        {
            //Error Message: User has given invalid input for "Days" & "Years" fields
            if(YYYY <= 0)
            {
                System.out.println("The days of a month are up to 31 and ");
                System.out.println("a year should be a positive number.");
                System.out.println("Try again!");
            }
            //Error Message: User has given invalid input for "Days" field
            else
            {
                System.out.println("The days of a month are up to 31.");
                System.out.println("Try again!");
            }
                
        }
        else if(DD <= 31 && MM > 12)
        {
            //Error Message: User has given invalid input for "Months" & "Years" fields
            if(YYYY <= 0)
            {
                System.out.println("We have 12 months and        " );
                System.out.println("a year should be a positive number. " );
                System.out.println("Try again!              " );
            }
            //Error Message: User has given invalid input for "Months" field
            else
            {
                System.out.println("We have 12 months. " );
                System.out.println("Try again!     " );
            }
                
        }
        //Error Message: User has given invalid input for "Years" field
        else if(DD <= 31 && MM <= 12 && YYYY <= 0)
        {
            System.out.println(" A year should be a positive number. " );
            System.out.println("             Try again!              " );
        }         
    }
    
    switch(MM)
    {
        case 2:
            
            if((YYYY % 400) == 0 || ((YYYY % 4) == 0 && (YYYY % 100) != 0))
            {
                //Error Message: User has requested an invalid day for the month "February"
                //                and the requested "Year" is a leap year.
                if(DD > 29)
                {
                    System.out.println("  The year " + YYYY + " is a leap year. " );
                    System.out.println(" So, February has up to 29 days.          " );
                    System.out.println("           Try again!                     " );                     
                }
            }
            else
            {
                //Error Message: User has requested an invalid day for the month "February"
                //              and the requested "Year" is not a leap year.
                if(DD > 28)
                {
                    System.out.println(" The year " + YYYY + " isn't a leap year. " );
                    System.out.println(" So, February has up to 28 days.            " );
                    System.out.println("           Try again!                       " );
                    
                }
            }
            break;
            
        case 4:
            //Error Message: User has requested an invalid day for the month "April"
            if(DD > 30)
            {
                System.out.println(" April has up to 30 days. " );
                System.out.println("        Try again!        " );
                
            }
            break;
              
        case 6:
            //Error Message: User has requested an invalid day for the month "June"
            if(DD > 30)
            {
                System.out.println(" June has up to 30 days. " );
                System.out.println("       Try again!        " );
                
            }
            break;
        
        case 9:
            //Error Message: User has requested an invalid day for the month "September"
            if(DD > 30)
            {
                System.out.println(" September has up to 30 days. " );
                System.out.println("          Try again!          " );
                 
            }
            break;
            
        case 11:
            //Error Message: User has requested an invalid day for the month "November"
            if(DD > 30)
            {
                System.out.println(" November has up to 30 days. " );
                System.out.println("         Try again!          " );
                
            }
            break;
    }
    
    if(MM <= 2)
    {
        NYYYY = YYYY - 1;
        NMM = 0;
    }
    else
    {
        NYYYY = YYYY;
        NMM = (4 * MM + 23) / 10;
    }
    
    //Calculating the day
    IDAY = 365 * YYYY + DD + 31 * (MM - 1) - NMM + (NYYYY / 4) - ((3 * ((NYYYY / 100) + 1) / 4));
    
    day = IDAY % 7;
    
    //This 'flag' is used for displaying the right ending after the numbers 
    if(DD != 11 && DD != 12 && DD != 13)
        flag = DD % 10;
    
    switch(day)
    {
        case 0:
            System.out.println(" You were born on Saturday, ");
            break;
            
        case 1:
            System.out.println(" You were born on Sunday, ");
            break;
            
        case 2:
            System.out.println(" You were born on Monday, ");
            break;
            
        case 3:
            System.out.println(" You were born on Tuesday, ");
            break;
            
        case 4:
            System.out.println(" You were born on Wednesday, ");
            break;
            
        case 5:
            System.out.println(" You were born on Thursday, ");
            break;
            
        case 6:
            System.out.println(" You were born on Friday, ");
            break;
    }
    
    if(flag == 1){
         System.out.println( DD + "st of ");
    }
    else if(flag == 2){
         System.out.println( DD + "nd of ");
    }
    else if(flag == 3){
         System.out.println( DD + "rd of ");
    }
    else{
         System.out.println( DD + "th of ");
    }
    
    System.out.println(month[MM-1] + " of " + YYYY + "!" );
    
    System.out.println("\n       And if you liked it,        " );
    System.out.println(" don't forget to give a (+1) like!   " );
    System.out.println("            Thank you!               " );
   
    }
}