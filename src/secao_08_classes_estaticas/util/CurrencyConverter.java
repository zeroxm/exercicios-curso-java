package secao_08_classes_estaticas.util;

public class CurrencyConverter {
	
	public static final float IOF = 6f/100f;
	
	public static float getToBePaid(float price, float amount) {
		float toBePaid = price * amount;
		toBePaid += toBePaid * CurrencyConverter.IOF;
		return toBePaid;
	}

}
