package Homework_2;

public class MuhendislikHesapMakinesi implements IMuhendislikHesapMakinesi,ICalculator,IBasitHesapMakinesi {
	
	BasitHesapMakinesi basit1=new BasitHesapMakinesi();
	
	private double a;
	private double b;
	private double result;
	public MuhendislikHesapMakinesi() {
	
		this.a = a;
		this.b = b;
		this.result= result;
	}
	@Override
	public double kok_alma(double a) {
		
		return Math.sqrt(a);
	}

	@Override
	public double us_alma(double a,double b) {
		
		
				return Math.pow(a, b);
		
	}
	
	@Override
	public void displayResult(double result) {
		
	}
	@Override
	public double Toplama(double a, double b) {
		
		return basit1.Toplama(a, b);
	}
	@Override
	public double Cikarma(double a, double b) {
		return basit1.Cikarma(a, b);
		
		
	}
	@Override
	public double Carpma(double a, double b) {
		return basit1.Carpma(a, b);
		
		
	}
	@Override
	public double Bolme(double a, double b) {
		return basit1.Bolme(a, b);
		
	}
	
}
