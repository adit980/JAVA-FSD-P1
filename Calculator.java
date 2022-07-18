package trials;

import java.util.Scanner;
public class Calculator
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
            Scanner in = new Scanner(System.in);
            double a,b,r;
            int f=0;
            String c,m;
            // c is for operator input and m is for yes or no input to continue
           do
           {
        	
           
            System.out.println("ENTER TWO NUMBERS TO PERFORM OPERATION");
            System.out.println("ENTER First Number");
            a= in.nextDouble();
            System.out.println("ENTER Second Number");
            b= in.nextDouble();
            System.out.println ("ENTER THE CHOICE OF OPERATION\n");
            System.out.println ("ENTER + FOR ADDITION\nENTER - FOR SUBSTRACTION\nENTER * FOR MULTIPICATION\nENTER / FOR DIVISION");
            
            c = in.next();
           
            switch(c)
            {
            case "+":
            {
            	r=a+b;
            	System.out.println ("SUM OF "+a+" AND "+b+" is "+r);
            	break;
            }
            case "-":
            {
            	r= a-b;
            	System.out.println ("DIFFERENCE BETWEEN "+a+" AND "+b+" is "+r);
            	break;
            }
            case "*":
            {
            	r=a*b;
            	System.out.println ("PRODUCT OF "+a+" AND "+b+" is "+r);
            	break;
            }
            case "/":
            {
            	r= a/b;
            	System.out.println (a+" DIVIDED BY "+b+" RESULTS is "+ r);
            	break;
            }
            default :
                System.out.println ("WRONG OPERATION");
          }//switch case end
            //if user wants to continue with operations for that --this part:
            System.out.println("\nDo you want to continue with more operations\nEnter y for YES  or  n for NO");
            do
            	//this do while will continue till user input y or n...any wrong input will ask for a re input
            {
            	m=in.next();
            	//to take y or n ignoring case..we have string variable m
            	/*if checks for the entered value in m is y or n...if true then we get out
            	 * of this as f=1 executes and break is given thus out of do while
            	 * or else we run into loop of entering y or n again as f=0 is assigned 
            	 * for the loop to continue.
            	 */
            	if(m.equalsIgnoreCase("y") || m.equalsIgnoreCase("n"))
            	{
            		//counter to signal do-while to terminate as valid input y or n is entered.
            		f=1;
            		break;
            	}
            	else
            	{
            			// counter to continue till right input is given
            			f=0;
            			/* this majorly helps when y or n is entered
            			 * for the first time and if user enters anything else then other time 
            			 * provided y was entered..this initialization helps out .
            			 */
            			System.out.println("WRONG INPUT\nTRY AGAIN TO ENTER");
            	}
            		
            }//internal do-while ends
            while(f!=1);
            
           }//do while end
           
            while(m.equalsIgnoreCase("y"));
           //if y is entered then again the operation will contine or we will be out.
            System.out.println("Thank you !");
            }

}
