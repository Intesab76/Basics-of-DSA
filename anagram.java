import java.util.*;
class Ana
{
    String anagram(String s1 , String s2)
    {
        int len1 = s1.length();
        int len2 = s1.length();
        if(len1 != len2)
            return "No comparison of two different sized strings";
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i=0; i<len1 || i<len2 ;i++)
        {
            if(ch1[i] != ch2[i]){
                return " Given two strings are not anagram";
            }
        }
        return "\n\t They are anagrams ::";
    }
}
class Main 
{
    public static void main(String INtooo[])
    {
        Ana obj = new Ana();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t Enter two strings ::\n\t ");
        String a ,b;
        a = sc.next();
        b = sc.next();
        System.out.println("\n\t Two strings are ::  "+a+"   "+b);
       String call = obj.anagram(a.toLowerCase() , b.toLowerCase());
       System.out.println(call);
    }
}