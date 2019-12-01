
public enum FluidTable {

	H20(0.998, 4.19, 0, 100, 2260), 
	WATER(0.998, 4.19, 0, 100, 2260),
	H2SO4(1.84, 1.38, 10, 336, 511),
	Br /*bromine*/ (3119, 0.226, -7.25, 58.78),
	Hg /*Quicksilver*/ (13579.04, 0.140, -38.862, 356.66),
	;

	double density;
	double heatCapacity;
	double meltPoint;
	double boilPoint;
	double steamEntalpy;
	
	/**
	 * Another Table for fluid BUT without steamEntalpy (se * 1E3), because I could not calculate it!
	 * @param d
	 * @param hc
	 * @param sp
	 * @param bp
	 */
	
	FluidTable(double d, double hc, double sp, double bp) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		boilPoint = bp;
	}
	
	FluidTable(double d, double hc, double sp, double bp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		boilPoint = bp;
		steamEntalpy = se * 1E3;
	}

}