//package practice;
//
//public class SelectionStructure {
//
//	public static void main(String[] args) {
//		
//		int a = 10;
//		int b = 10;
//		int c = 10;
//		
//		if ((a==b)&&(a==c));
//		System.out.println("Numbers are equal.");
//
//	}
//
//}
public class PrinterApp {

    public static void main(String[] args) {
        String creator = "Viktor";
        int num1 = 150;
        int num2 = 30;
        int multiplication = num1 * num2;
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int division = num1/num2;
        System.out.println("Printer App");
        System.out.println("This app is made by: " + creator);
        System.out.println("The value of number 1 is: " + num1);
        System.out.println("The value of number 2 is: " + num2);
        System.out.println("The sum of numbers " + num1 + " and " + num2 + " is: " + addition);
        System.out.println("The difference between numbers " + num1 + " and " + num2 + " is: " + subtraction);
        System.out.println("The product of factors " + num1 + " and " + num2 + " is: " + multiplication );
        System.out.println("The quotient of numbers " + num1 + " and " + num2 + " is: " + division);


    }

}