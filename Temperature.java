import java.util.*;
public class Temperature
{
    
    public static void main(String args[])
    {
        
        System.out.println("1.Fahrenheit to Celsius");
        System.out.println("2.Celsius to Fahrenheit");
        System.out.println("3.Kelvin to Celsius");
        System.out.println("4.Kelvin to Fahrenheit");
        System.out.println("5.Celsius to Kelvin ");
        System.out.println("6.Fahrenheit to Kelvin");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the value to convert");
        
        
       if(n<0 || n>7)
       {
           System.out.println("INVALID");
       }
        
        int k=sc.nextInt();
           if(n==1)
           {
               System.out.println("Fahrenheit ---> Celsius");
               
               System.out.println(Math.abs((k-32)/1.8));
            }
            if(n==2)
           {
               System.out.println("Celsius ---> Fahrenheit");
               System.out.println(Math.abs((k*1.8)+32));
            }
            if(n==3)
           {
               System.out.println("Kelvin ---> Celsius");
               System.out.println(Math.abs(k-273));
            }
            if(n==4)
           {
               System.out.println("Kelvin ---> Fahrenheit");
               System.out.println(Math.abs((k*1.8)-459.67));
            }
            if(n==5)
           {
               System.out.println("Celsius ---> Kelvin");
               
               System.out.println(Math.abs(k+273));
            }
            if(n==6)
           {
               System.out.println("Fahrenheit ---> Kelvin");
               System.out.println(Math.abs((k+ 459.67)*5/9));
            }
           
       
    }
}
