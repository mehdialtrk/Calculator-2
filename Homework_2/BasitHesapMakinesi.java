package Homework_2;

   

public class BasitHesapMakinesi implements IBasitHesapMakinesi,ICalculator {
	private double a;
   	private double b;
   	private double result;
   	
	

	public BasitHesapMakinesi() {
		this.a = a;
		this.b = b;
		this.result=result;
	}

	@Override
	public double Toplama(double a, double b) {
		double sonuc;
		
		sonuc= a+b;
		
		return sonuc;
		
	}

	@Override
	public double Cikarma(double a, double b) {
		double sonuc;
		
		sonuc= a-b;
		
		return sonuc;
	}

	@Override
	public double Carpma(double a, double b) {
		
		double sonuc;
		
		sonuc= a*b;
		
		return sonuc;
	}

	@Override
	public double Bolme(double a, double b) {
		double sonuc;
		if(!(b==0)) {
		sonuc= a/b;
		}
		
		else {
			System.out.println("\nSonuc: Tanýmsýzdýr(O'a Bölme iþlemi gerçekleþtiremezsiniz) ....");
		}
		return  0;
	}

	@Override
	public void displayResult(double result) {
		
		
	}

}
