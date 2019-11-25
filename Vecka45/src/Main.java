
public class Main {

	static double g_swe = 9.82;
	static double G = 6.6740831 * 10 * Math.exp(-11);
	static double R = 8.314462175;
	static int p_0 = 1000;
	static int c = 299792458;
	
	
	public static void main(String[] args) {

		System.out.print (fahrenheitToCelsius(50));
		System.out.print (kelvinToCelsius(0));
		System.out.print (fluidPressure(FluidTable.H2SO4, 5));
		System.out.print (pressureUnderWater (5));
		System.out.print (kineticEnergy (2,2));
		System.out.print (potentialEnergi (2,5));
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		double Celsius = (fahrenheit-32)* 5 / 9;
		return Celsius;
	}
	
	public static double kelvinToCelsius(double kelvin) {
		double Celsius = kelvin - 273.15;
		return Celsius;
	}
	
	public static double fluidPressure(FluidTable fluid, double deep) {
		double pressure = fluid.density * g_swe * deep;
		return pressure;
	}
	
	public static double pressureUnderWater(double deep) {
		double pressure = FluidTable.WATER.density * g_swe * deep;
		return pressure;
	}
	
	public static double kineticEnergy(double mass, double velocity) {
		double kineticEnergy = (mass * velocity / 2);
		return kineticEnergy;
	}
	
	public static double potentialEnergi(double mass, double height) {
		double potentialEnergi = (mass * g_swe * height);
		return potentialEnergi;
	}
	
	
	
	
}