import java.util.Scanner;
class Fibonacci 
{
public static void main(String args[])
{
int n,a=0,b=1,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number of Terms:");
n=sc.nextInt();
System.out.println("Fibonacci Series:");
for (int i=1;i<=n;i++)
{
System.out.println(a+"");
c=a+b;
a=b;
b=c;
}
}
}