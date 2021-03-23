import java.util.*;
class Optimized
{
    void sort(int Arr[])
    {
        int i,j, flag , temporary;
        for(i=0;i<Arr.length-1;i++)
        {
            flag = 0;
            for(j=0;j<Arr.length-1-i;j++)
            {
                if(Arr[j]>Arr[j+1])
                {
                    temporary = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temporary;
                    flag=1;
                }
            }
            if(flag == 0)
            break;
        }
        System.out.println("\n\t Sorted without undergoing any redundant passes in bubble sort ::\n\t");
        show(Arr);
    }
    void show(int Arr[])
    {
        int i ;
        System.out.println("\n\t Array after being sorted ::\n\t ");
        for(i=0;i<Arr.length;i++)
        {
            System.out.println("\n\t "+Arr[i]);
        }
    }
}
class Main
{
    public static void main(String Arg[])
    {
        Optimized obj = new Optimized();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t Enter the number of elements to be inserted :: \n");
        n = sc.nextInt();
        System.out.println("\n\t Number of elements are ::\t"+n);
        int Arr[] = new int[n];
        int i;
        System.out.println("\n\t Enter the elements ::\n");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i] = sc.nextInt();
        }
        System.out.println("\n\t Array elements are ::\n\t");
        for(i=0;i<Arr.length;i++)
        {
            System.out.println("\n\t "+Arr[i]);
        }
        obj.sort(Arr);
    }
}