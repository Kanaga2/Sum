# Sum
import java.io.*;
import java.util.*;
public class Sum
{
public static void main(String args[])
{
int sum=0,i=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers");
int n=sc.nextInt();
do
{
sum=sum+i;
i+=1;
}while(i<=n)
{
System.out.println("sum");
}
}
}

