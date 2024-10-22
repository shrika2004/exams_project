public class ArithmeticFunctions {
    public static void main(String[] args) {
        double a = 16.0;
	double b = 8.0;
	double c = -1.0;
	double square_root;
	double cube_root;
	double absolute;

      
        square_root = Math.sqrt(a);
        System.out.println("Square root of 16 is: " + square_root);

        
        cube_root = Math.cbrt(b);
        System.out.println("Cube root of 8 is: " + cube_root);

        
        absolute = Math.abs(c);
        System.out.println("Absolute value of -1 is: " + absolute);
    }
}
