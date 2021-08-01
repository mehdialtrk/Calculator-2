package Homework_2;

import java.text.NumberFormat;
import java.util.Locale;

public class TurkishStyleCalculator extends MuhendislikHesapMakinesi {
	MuhendislikHesapMakinesi tr1= new MuhendislikHesapMakinesi();
	@Override
	public double kok_alma(double a) {
		
		return 0;
	}

	@Override
	public double us_alma(double a, double b) {
		return 0;
	}

	@Override
	public double Toplama(double a, double b) {
		
		return 0;
	}

	@Override
	public double Cikarma(double a, double b) {
		return 0;
	}

	@Override
	public double Carpma(double a, double b) {
		return 0;
	}

	@Override
	public double Bolme(double a, double b) {
		return 0;
	}

	@Override
	public void displayResult(double result) {
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		System.out.println( "Sonuc(TR): "+nf.format(result));
		
	}

}
