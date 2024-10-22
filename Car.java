class Vehicle{
protected String brand= "Ford";
public void honk(){
System.out.println("Tuut,tuut");
}
}
class Car extends Vehicle{
private String modelName="Mustang";
public static void main(String[]args){
Car myFastcar= new Car();
myFastcar.honk();
System.out.println(myFastcar.brand+" "+myFastcar.modelName);
}
}