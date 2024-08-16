package car_decription;

public class carDecription {

     public static void decriptionCar() 
{
	String carType="SUV";		
	String carModel = "Mercedes-Benz GLA 250";
	int productionYear=2020;
	int numberOfAirBag=7;
	
   System.out.println("This car is "  +carType + " model " +carModel + ".");
   System.out.println("Production Year :  " +productionYear);

   if(numberOfAirBag >= 7)
{
	System.out.println("It's in good condition.");
}
else if(numberOfAirBag>=4)
{
	System.out.println("It's in bad condition.");
}
else
{
	System.out.println("It is damaged car.");
}
}
     public static void main(String[] args) {
 		System.out.println("All about my car -");
 		decriptionCar();
 		System.out.println("Ready to buy!");
 }
}
