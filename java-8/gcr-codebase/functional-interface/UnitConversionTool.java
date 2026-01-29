

interface Conversion{
	static double kmToMiles(double km) {
		return km*0.61;
	}
	static double kgToLbs(double kg) {
		return kg*2.204;
	}
}
public class UnitConversionTool {
	public static void main(String[] args) {
		System.out.println(Conversion.kgToLbs(15));
		System.out.println(Conversion.kmToMiles(15));
	}
}
