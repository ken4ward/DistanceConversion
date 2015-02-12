
package distanceconversion;

import java.io.*;

public class DistanceConversion {

    public static Double myStatic= 1.609;
    public static void main(String[] args) throws IOException 
    {
        //This commented line of code helps a user to pass in only 3 arguments from the command line. 
        //What you really expected is vague to me. 
        /*int argumentParam = 0;
        for(int i = 0; i<args.length; i++)
        {
            if(args.length == 3)
            {
                //This line of code accepts the first argument. you can set more to accept the other 2 arguments.
                argumentParam = Integer.parseInt(args[0]);
            }
        }*/
        convertToKilometer(); 
        convertToMetre();
    }
    
    public static void convertToKilometer() throws IOException
    {
        System.out.println("Please input a value in miles:....");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputStream = reader.readLine();
        Double miles = Double.parseDouble(inputStream);
        Double kilometer = myStatic * miles;
        System.out.println("The value of" +" " +inputStream +"miles" +" " +"in Kilometre is" +" " +kilometer);      
    }
    
    public static void convertToMetre() throws IOException
    {
        System.out.println("Please input a value in kilomter:....");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputStream = reader.readLine();
        Double kilometer = Double.parseDouble(inputStream);
        Double miles = kilometer / myStatic;
        System.out.println("The value of" +" " +inputStream +"kilometers" +" " +"in mile is" +" " +miles);    
    }
}
