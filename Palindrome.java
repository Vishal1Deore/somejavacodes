public class Palindrome{
public static void main(String[]args){
int num1 = 121;
int orignalcopy = num1;
int num2 = 0;
while(num1>0)
{
int rem=num1%10;
num1 = num1/10;
num2 = num2*10+rem;
}
if(orignalcopy==num2){
System.out.println("Pelindrome");
}
else
System.out.println("no");

}
}