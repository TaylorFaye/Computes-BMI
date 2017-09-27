import java.util.Scanner;
import java.text.DecimalFormat;

public class ComputeBMI{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter weight: ");
double weight= input.nextDouble();

System.out.print("Enter height: ");
double height= input.nextDouble();

final double KILO_PER_POUND = 0.45359237;
final double METER_PER_IN = 0.0254;

double weightInKilo = weight * KILO_PER_POUND;
double heightInMeters = height * METER_PER_IN;
DecimalFormat numberFormat = new DecimalFormat("#.0");
double bmi = weightInKilo / (heightInMeters*heightInMeters);

System.out.println("BMI is " +numberFormat.format(bmi));
if(bmi < 18.5)
System.out.println("underweight");

else if(bmi <25)
System.out.println("normal");

else if(bmi<30)
System.out.println("overweight");
else
System.out.println("Damn");
}
}