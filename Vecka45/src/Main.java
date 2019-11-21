
public class Main {

	static double g_swe = 9.82;
	static double G = 6.6740831 * 10 * Math.exp(-11);
	static double R = 8.314462175;
	static int p_0 = 1000;
	static int c = 299792458;
	
	
	public static void main(String[] args) {

		System.out.print (fahrenheitToCelsius(50));
		System.out.print (kelvinToCelsius(0));
		System.out.print (fluidPressure(FluidTable.H2S04, 5));
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
}