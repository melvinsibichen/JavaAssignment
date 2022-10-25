import java.util.Scanner;
public class VovelConstant
{
    public static void main(String []args)
    {
        boolean isVowel=false;
        Scanner s=new Scanner (System.in);
        System.out.print("\n Enter Character: ");
        char ch=s.next().charAt(0);
        switch(ch) 
    {
    
case 'A':
case 'E':
case 'I':
case 'O':
case 'U': 
case 'a':
case 'e':
case 'i':
case 'o':
case 'u': isVowel=true;

}
if(isVowel==true)
{
    System.out.println("Its a vowel");
}
else
{
    if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
    System.out.println(" is a Constant");
    else
    System.out.println("is an alphabet");

}

}
}
