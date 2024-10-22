class BCAstudents
{
int rollno;
String name;
String phonenumber;
int fees;
public static void main (String[]args)
{
	BCA s1=new BCA();
	BCA s2=new BCA();
	BCA s3=new BCA();
	BCA s4=new BCA();
	BCA s5=new BCA();
	s1.rollno=101;
	s2.rollno=102;
	s3.rollno=103;
	s4.rollno=104;
	s5.rollno=105;
	s1.name="Adam";
	s2.name="Jack";
	s3.name="Joey";
	s4.name="Simon";
	s5.name="Ethan";
	s1.phonenumber="6305341472";
s2.phonenumber="8096768654";
	s3.phonenumber="9160089077";
	s4.phonenumber="8096456874";
	s5.phonenumber="9160345677";
	
System.out.println(s1.rollno+"	"+s1.name+"	"+s1.phonenumber+"	");
	System.out.println(s2.rollno+"	"+s2.name+"	"+s2.phonenumber+"	");
	System.out.println(s3.rollno+"	"+s3.name+"	"+s3.phonenumber+"	");
	System.out.println(s4.rollno+"	"+s4.name+"	"+s4.phonenumber+"	");
	System.out.println(s5.rollno+"	"+s5.name+"	"+s5.phonenumber+"	");

}
}
