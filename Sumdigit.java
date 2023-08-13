//Sum of digit of the numbers.
public class Sumdigit{
public static void main(String[]args){
int num=4545;
int sum=0;
while(num>0){
int rem=num%10;
sum = rem+sum;
num = num/10;
}
System.out.println(sum);
}
}