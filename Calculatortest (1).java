import java.util.Scanner;
interface Calculator
{
double add(double a,double b);
double sub(double a,double b);
double mul(double a,double b);
double div(double a,double b);
}
class arithmetic implements Calculator
{
public double add(double a,double b)
{
return a+b;
}
public double sub(double a,double b)
{
return a-b;
}
public double mul(double a,double b)
{
return a*b;
}
public double div(double a,double b)
{
if (b!=0)
return a/b;
else
{ 
System.out.println("Error");
return 0;
}
}
}
class Calculatortest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter First number:");
double num1=sc.nextDouble();
System.out.println("Enter Second number:");
double num2=sc.nextDouble();
arithmetic obj=new arithmetic();
System.out.println("Addition:"+obj.add(num1,num2));
System.out.println("Subraction:"+obj.sub(num1,num2));
System.out.println("Multiplication:"+obj.mul(num1,num2));
System.out.println("Division:"+obj.div(num1,num2));
sc.close();
}
}
