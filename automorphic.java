import java.util.*;
import java.lang.Math;

class Automorph
{
    int counter = 0;
    void check_automorph(int number)
    {
        int squared_num = number*number;
        int lastDigitAfterSquaring;
        System.out.println("\n\t Square of "+number+"  is "+squared_num);
        int temporary;
        temporary = number;
        while(number>0)
        {
            counter++;
            number = number/10;
        }
        number = temporary;
        lastDigitAfterSquaring = (int) (squared_num %(Math.pow(10,counter)));
        show_automorph(number , lastDigitAfterSquaring);        
    }
    void show_automorph (int number , int lastDigitAfterSquaring)
    {
        if(number == lastDigitAfterSquaring)

        {
            System.out.println("\n\t Have fun with your automorphic number ::");
            System.out.print( "\n\t Original Number ::   "+number + "\t Last "+counter+"  digits of the squared value  "+lastDigitAfterSquaring);
        }
        else
        System.out.print("\n\t"+number+" is not an automorphic number ::\n");
    }
}
class Main
{
    public static void main(String Intesab[])
    {
        int value;
        Automorph obj = new Automorph();
        Scanner sk = new Scanner(System.in);
        System.out.println("\n\t Enter the number to be checked whether it is automorphic or not ::\n ");
        value = sk.nextInt();
        System.out.println("\n\t Number entered is :: "+value);
        obj.check_automorph(value);
    }
}