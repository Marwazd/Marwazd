
public enum SolidTable {

	ICE(0.92, 2.2, 0, 334),
	IRON(7.87, 0.45, 1538, 276),
	Mg /*Magnesium*/ (1.738, 1023, 923),
	Li /*Lithium*/ (0.534, 3482, 453.65),
	Na /*Sodium*/ (0.968, 1230, 370.944),
	;

	double density;
	double heatCapacity;
	double meltPoint;
	double meltEntalpy;
	
	/**
	 * Another table for solid BUT without meltEntalpy (se * 1E3), because I could not calculate it!
	 * @param d
	 * @param hc
	 * @param sp
	 */
	
	SolidTable(double d, double hc, double sp) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
	}
	
	SolidTable(double d, double hc, double sp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		meltEntalpy = se * 1E3;
	}

	
}