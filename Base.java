abstract class Sunstar{
abstract void printInfo();
}
class Employee extends Sunstar{
void printInfo(){
String name="Shrika";
int age =20;
float Salary=222.2F;

System.out.println(name);
System.out.println(age);
System.out.println(Salary);
}
}
class Base{
public static void main(String[]args){
Sunstar s= new Employee();
s.printInfo();
}
}