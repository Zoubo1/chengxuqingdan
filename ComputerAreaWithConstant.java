package chengcuqingdan;

public class ComputerAreaWithConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final double PI=3.14159;//Declar a constant
//creat a scanner object
Scanner  input = new Scanner(System.in);
//prompt the user to  enter a radius
System.out.print("Enter a number for  radius:");
double radius =input.nextDouble();
//Computer area 
double area = radius*radius*PI;
//Display result
System.out.println("The area for the cicle of radius"+radius+"is"+area);

	}

}
