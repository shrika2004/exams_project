public class Bitwiseop{
public static void main(String[]args){
int num1=30;
int num2=6;
int num3=0;
System.out.println("num1&num2=" +(num1&num2));
System.out.println("num1|num2=" +(num1|num2));
System.out.println("num1^num2=" +(num1^num2));
System.out.println("~num1=" +~num1);
num3=num1<<2;
System.out.println("num1<<2=" +num3);
num3=num1>>2;
System.out.println("num1>>1=" +num3);
num3=num1>>>num2;
System.out.println("num1>>>1=" +num3);
}
}