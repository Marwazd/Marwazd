
public class Main {

	static double g_swe = 9.82;
	static double G = 6.6740831 * 1E-11;
	static double R = 8.314462175;
	static double p_0 = 101.3E3;
	static double c = 2.99792458;
	
	
	public static void main(String[] args) {
		/*TODO auto generated method stub*/
	}
	
	/**
	 * A method that converts degrees fahrenheit to degrees celsius. 
	 * @param fahrenheit the value for fahrenheit.
	 * @return Returns the temperature in Celsius.
	 */
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		double Celsius = (fahrenheit-32)* 5 / 9;
		return Celsius;
	}
	
	/**
	 * A method that converts degrees Kelvin to degrees Celsius.
	 * @param kelvin the value for kelvin.
	 * @return Returns the temperature in Celsius.
	 */
	
	public static double kelvinToCelsius(double kelvin) {
		double Celsius = kelvin - 273.15;
		return Celsius;
	}
	
	/**
	 * A method that calculates the fluid pressure in a liquid at a certain depth.
	 * @param fluid The value of the density of a liquid.
	 * @param deep the value for the depth.
	 * @return returns the fluid pressure.
	 */
	 	
	public static double fluidPressure(FluidTable fluid, double deep) {
		double thePressure = 0;
		thePressure = fluid.density * g_swe * deep;
		return thePressure;
	}
	
	/**
	 * A method that calculates the liquid pressure in water at a certain depth.
	 * @param deep The depth you measure the pressure in.
	 * @return returns the fluid pressure under water.
	 */
	
	public static double pressureUnderWater(double deep) {
		double underWaterPressure = 0;
		underWaterPressure = FluidTable.WATER.density * g_swe * deep;
		return underWaterPressure;
	}
	
	/**
	 * A method that calculates kinetic energy using mass and velocity.
	 * @param mass The mass of an object in kg.
	 * @param velocity The speed of an object in m/s.
	 * @return Returns the kinetic energy kgm/s.
	 */
	
	public static double kineticEnergy(double mass, double velocity) {
		double kineticEnergy = 0;
		kineticEnergy = (velocity * mass) / 2;
		return kineticEnergy;
	}
	
	/**
	 * A method that calculates potential energy using mass and height.
	 * @param mass The mass of an object in kg.
	 * @param height The height at which the object is in relation to the zero point.
	 * @return Returns the potential energy of the object.
	 */
	
	public static double potentialEnergi(double mass, double height) {
		double potentialEnergi = 0;
		potentialEnergi = (mass * g_swe * height);
		return potentialEnergi;
	}
	
	/**
	 * A method that calculates how high velocity an object can have if the object releases from a certain height.
	 * @param height The height of the object is released from in meters.
	 * @return Returns the speed in m/s.
	 */
	
	public static double fallSpeed(double height) {
		double fallSpeed = 0;
		fallSpeed = Math.sqrt(2 * g_swe * height);
		return fallSpeed;
	}
	
	/**
	 * A method that calculates the difference between two given values.
	 * @param first The first value.
	 * @param last The second value.
	 * @return Returns the difference between the values.
	 */
	
	public static double delta(double first, double last) {
		double delta = 0;
		delta = last - first;
		return delta;
	}
	
	/**
	 * A method that converts a certain volume of liquid into a mass.
	 * @param fluid The fluid.
	 * @param volume The volume in m^3.
	 * @return Returns the mass of the liquid in kg.
	 */
	
	public static double volumeToMass(FluidTable fluid, double volume) {
		double fluidMass = 0;
		fluidMass = fluid.density * volume;
		return fluidMass;
	}
	
	/**
	 * A method that converts a certain volume of gas into a mass.
	 * @param gas The gas.
	 * @param volume The volume of gas in m^3.
	 * @return the mass of the gas in kg.
	 */
	
	public static double volumeToMass2(GasTable gas, double volume) {
		double gasMass = 0;
		gasMass = gas.density * volume;
		return gasMass;
	}
	
	/**
	 * A method that converts a certain volume of material into a mass.
	 * @param solid The solid material.
	 * @param volume The volume of the material in m^3.
	 * @return Returns the mass in kg.
	 */
	
	public static double volumeToMass3(SolidTable solid, double volume) {
		double solidMass = 0;
		solidMass = solid.density * volume;
		return solidMass;
	}
	
	/**
	 * A method that calculates the average speed using distance and time.
	 * @param distance A variable on the distance in meters.
	 * @param time A variable on time in seconds.
	 * @return Returns the average speed in m/s.
	 */
	
	public static double averageSpeed(double distance, double time) {
		return (distance / time);
	}
	
	/**
	 * A method that calculates distance using speed and time.
	 * @param velocity A variable for the speed in m/s.
	 * @param time A variable for the time in seconds.
	 * @return returns the distance in meters.
	 */
	
	public static double svtDistance(double velocity, double time) {
		return (velocity * time);
	}

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}