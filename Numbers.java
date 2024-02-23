import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		Double num1=input.nextDouble();
		Double num2=input.nextDouble();
		Double num3=input.nextDouble();
		double sum= (num1+num2+num3);
		double mult=(num1*num2*num3);
		double avr=((num1+num2+num3)/3);
		double pow=Math.pow(num1, num2);
		System.out.println("Sum= "+sum);
		System.out.println("mult= "+mult);
		System.out.println("Avr= "+avr);
		System.out.println("Pow= "+pow);

		

	}

}
