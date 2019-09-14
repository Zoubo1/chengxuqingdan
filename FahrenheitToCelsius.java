package zou;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new scanner (System.in);
System.out.print("Enter a degree in Fahrenheit:");
double Fahrenheit = input.nextDouble();
//convert fathrenheit to celsius
double celsius = (5.0/9)*(Fahrenheit-32);
System.out.println("Fahrenheit"+Fahrenheit+"is"+celsius+"in Celsius");
	}

}
