
public class Main {

	static double g_swe = 9.82;
	static double G = 6.6740831 * 1E-11;
	static double R = 8.314462175;
	static double p_0 = 101.3E3;
	static double c = 2.99792458;
	
	
	public static void main(String[] args) {
		/*TODO auto generated method stub*/
		
		System.out.println("Hur mycket vager 60 dm^3 jarn?"); 
		/*60 dm^3 is 0,06 m^3*/
		System.out.println(volumeToMass3(SolidTable.IRON,0.06)+"kg");
		
		System.out.println("ur langt hinner Tomas om han loper med medelhastigheten 2.7 m/s i 50 minuter?");
		/*50 minutes is 3000 seconds*/
		System.out.println(svtDistance(2.7,3000)+"meter");
		
		System.out.println("Hur mycket energi kravs for att varma upp 4 liter vatten fran rumstemperatur (22 grader) till kokpunkten?");
		/*4 liters water is 4 kg and the difference in temperature is 100 - 22 = 78 degrees*/
		System.out.println(heat2(FluidTable.WATER, 4, 78)+"J");
		
		System.out.println("Hur stort ar det totala trycket 75 meter under havsytan?");
		System.out.println(fluidPressure(FluidTable.WATER,75));
		
		System.out.println("Tomas som ar 180cm lang kastar upp en boll med massan 250 gram i luften sa den far starthastigheten 60 km/h. Hur hogt kommer bollen?");
		/*Transform: 60 km/h = 16.67 m/s and 180 cm = 1.8 m*/
		System.out.println(velocityToHeight(16.67) + 1.8 + "meter");
		
		System.out.println("En bil med massan 735kg accelererar med konstant acceleration fran 0-100 pa 4.8 sekunder. Hur stor effekt har bilens motor uppnatt?");
		/*100 km/h  / 3.6 = 27.78 m/s*/
		/*acceleration = 27.78 / 4.8 = 5.79 m^2*/
		/*Force = m*a = 735 * 5.79 = 4 353,4 N*/
		/*Distance = 27.78 * 4.8 = 133,3 m*/
		/*Work = Force * Distance = 580500 Nm*/
		System.out.println(Power(580500, 4.8)+"w");

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
	 * @param time A variable for time in seconds.
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
	
	/**
	 * A method that calculates time using distance and speed.
	 * @param distance A variable for the distance in meters.
	 * @param velocity A variable for the speed in m/s.
	 * @return returns the time in seconds.
	 */
	
	public static double svtTime(double distance, double velocity) {
		return (distance / velocity);
	}
	
	/**
	 * A method that calculates work using force and distance.
	 * @param force A variable for the force in Newton.
	 * @param distance A variable for the distance in meters.
	 * @return returns work in Newton meters (Nm).
	 */
	
	public static double Work(double force, double distance) {
		return (force * distance);
	}
	
	/**
	 * A method that calculates effect using work and time.
	 * @param work A variable for work in Nm.
	 * @param time A variable for time in seconds.
	 * @return Returns effect in Watts (W).
	 */
	
	public static double Power(double work, double time) {
		return (work / time);
	}
	
	/**
	 * A method that calculates the amount of energy that required to heat a material till a specified number of degrees.
	 * @param solid A variable for the material.
	 * @param mass A variable for mass in kg.
	 * @param deltaT A variable for the difference in temperature.
	 * @return returns the amount of energy that required in joules (J).
	 */
	
	public static double heat(SolidTable solid, double mass, double deltaT) {
		return (solid.heatCapacity * mass * deltaT);
	}
	
	/**
	 * A method that calculates the amount of energy that required to heat a certain mass of liquid till a specified number of degrees.
	 * @param fluid variable for the fluid.
	 * @param mass A variable for mass in kg.
	 * @param deltaT A variable for the difference in temperature.
	 * @return returns the amount of energy that required in J.
	 */
	
	public static double heat2(FluidTable fluid, double mass, double deltaT) {
		return (fluid.heatCapacity * mass * deltaT);
	}
	
	/**
	 * A method that calculates the amount of energy that required to heat a certain mass of gas till a specified number of degrees.
	 * @param gas A variable for gas.
	 * @param mass A variable for mass in kg.
	 * @param deltaT A variable for the difference in temperature.
	 * @return returns the amount of energy that required in J.
	 */
	
	public static double heat3(GasTable gas, double mass, double deltaT) {
		return (gas.heatCapacity * mass * deltaT);
	}
	
	/**
	 * A method that calculates how high an object is going upwards at a certain speed.
	 * @param velocity A variable for the speed in m/s.
	 * @return returns the height in meters.
	 */
	
	public static double velocityToHeight(double velocity) {
		return (Math.pow (velocity, 2) / ( 2 * g_swe));
	}





	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}