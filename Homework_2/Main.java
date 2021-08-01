package Homework_2;


import java.util.Scanner;

import com.sun.net.httpserver.Authenticator.Result;



public class Main {

	public static void main(String[] args) {
		
		BasitHesapMakinesi basit = new BasitHesapMakinesi();
		MuhendislikHesapMakinesi muhendislik= new MuhendislikHesapMakinesi();
		UKStyleCalculator uk1= new UKStyleCalculator();
		TurkishStyleCalculator tr1=new TurkishStyleCalculator();
		Scanner scanner = new Scanner(System.in);
		
		double result=0;
		
		while(true) {String islem ="\n1-UKStyle Calculator\n"+
        		"2-TRStyle Calculator\n"+
        		"3-Exit \n";
		System.out.println(islem);
		System.out.print("\nLütfen Bir Hesap Makinesi Stili Seçiniz: ");
		int language =scanner.nextInt();
			
			if(language==3) {
				System.out.println("Çýkýþ yapýlýyor....");
				
				break ;
			}
			else if (language==1) {
				System.out.println("****Ýngiltere Tipi Hesap Makinesine Hoþgeldiniz****");
				
				while(true) {
					
					String islem1 ="\n1-Basit Hesap Makinesi,2-Muhendislik Hesap Makinesi ,3-Çýkýþ \n";
					System.out.println(islem1);
					System.out.print("\nLütfen Bir Hesap Makinesi Seçiniz: ");
					int secenek=scanner.nextInt();
						
					
					
					if(secenek==3) {// Seçenek :Çýkýþ ise....
						System.out.println("Programdan Çýkýlýyor...");
						  
						 break;
					}
					else if (secenek==1) {// Seçenek :Basit Hesap Makinesi ise....
						
						System.out.println("**Basit Hesap Makinasýný Seçtiniz**\n");
					
					
					
					
					while(true) {   
					
					String islem2="\n1-Toplama Ýslemi,2-Çýkarma Ýþlemi,3-Çarpma Ýslemi,4-Bölme Ýslemi,5-Çýkýþ\n ";
				
							     
					System.out.println(islem2);
				

					System.out.print("\nLütfen Bir Ýþlem Seçiniz: ");
					 int secim=scanner.nextInt();
					 
					 if(secim==5) {
						 
						 System.out.println("Programdan Çýkýlýyor...");
						  
						 break;
						 
					 }
					 else if (secim==1) {
						  
						  System.out.println("**Toplama Ýþlemini Seçtiniz**\n");
						 
						  
						  System.out.print("1.Sayýyý Giriniz: ");
						  double a=scanner.nextDouble();
						  System.out.print("2.Sayýyý Giriniz: ");
						  double b=scanner.nextDouble();
						  
						  scanner.nextLine();
						result=  basit.Toplama(a, b);
						uk1.displayResult(result);
						
						 
						  
											}
					  else if (secim==2) {
						  System.out.println("**Çýkarma Ýþlemini Seçtiniz**\n");
						 
						  
						  System.out.print("1.Sayýyý Giriniz: ");
						  double a=scanner.nextDouble();
						  System.out.print("2.Sayýyý Giriniz: ");
						  double b=scanner.nextDouble();
						  
						  scanner.nextLine();
						  
						  result=  basit.Cikarma(a, b);
							uk1.displayResult(result);
						  
					}
					  else if (secim==3) {
						  
						  System.out.println("**Çarpma Ýþlemini Seçtiniz**\n");
						  
						  
						  System.out.print("1.Sayýyý Giriniz: ");
						  double a=scanner.nextDouble();
						  System.out.print("2.Sayýyý Giriniz: ");
						  double b=scanner.nextDouble();
						  
						  scanner.nextLine();
						  
						  result=  basit.Carpma(a, b);
						  uk1.displayResult(result);
						  
					}
					  else if (secim==4) {
						  System.out.println("**Bölme Ýþlemini Seçtiniz**\n");
						  
						  
						  System.out.print("1.Sayýyý Giriniz: ");
						  double a=scanner.nextDouble();
						  System.out.print("2.Sayýyý Giriniz: ");
						  double b=scanner.nextDouble();
						  
						  scanner.nextLine();
						 
						  result=  basit.Bolme(a, b);
						  uk1.displayResult(result);
						 
					}
					  else {
						System.out.println("\n!!!Geçersiz Bir Ýþlem Seçtiniz.!!!\n"+"\tLütfen Bekleyiniz.");
						
						
						System.out.println(islem);
					}
				
				}
			}
					else if (secenek==2) { 			// secenek :Muhendislik hesap Makinesi  ise....
						
						System.out.println("**Muhendislik Hesap Makinasýný Seçtiniz**\n");
						
						while(true) {               
							String islem3="\n1-Toplama Ýslemi,2-Çýkarma Ýþlemi,3-Çarpma Ýslemi,4-Bölme Ýslemi,5-Karekök Alma Ýþlemi\n"+
											"6-Üs Alma Ýþlemi,7-Çýkýþ\n";

							System.out.println(islem3);
						
						
							System.out.print("\nLütfen Bir Ýþlem Seçiniz: ");
							int secim=scanner.nextInt();
							
						    if(secim==7) {
								 
								 System.out.println("Programdan Çýkýlýyor...");
								 break;
								 
							 }
							 else if (secim==1) {
								  
								  System.out.println("**Toplama Ýþlemini Seçtiniz**\n");
								 
								  
								  System.out.print("1.Sayýyý Giriniz: ");
								  double a=scanner.nextDouble();
								  System.out.print("2.Sayýyý Giriniz: ");
								  double b=scanner.nextDouble();
								  
								  scanner.nextLine();
								  
								  result= muhendislik.Toplama(a, b);
								  uk1.displayResult(result);

							}
							  else if (secim==2) {
								  System.out.println("**Çýkarma Ýþlemini Seçtiniz**\n");
								 
								  
								  System.out.print("1.Sayýyý Giriniz: ");
								  double a=scanner.nextDouble();
								  System.out.print("2.Sayýyý Giriniz: ");
								  double b=scanner.nextDouble();
								  
								  scanner.nextLine();
								  
								  result= muhendislik.Cikarma(a, b);
								  uk1.displayResult(result);
								  
							}
							  else if (secim==3) {
								  
								  System.out.println("**Çarpma Ýþlemini Seçtiniz**\n");
								  
								  
								  System.out.print("1.Sayýyý Giriniz: ");
								  double a=scanner.nextDouble();
								  System.out.print("2.Sayýyý Giriniz: ");
								  double b=scanner.nextDouble();
								  
								  scanner.nextLine();
								  
								  result= muhendislik.Carpma(a, b);
								  uk1.displayResult(result);
								  
							}
							  else if (secim==4) {
								  System.out.println("**Bölme Ýþlemini Seçtiniz**\n");
								  
								  
								  System.out.print("1.Sayýyý Giriniz: ");
								  double a=scanner.nextDouble();
								  System.out.print("2.Sayýyý Giriniz: ");
								  double b=scanner.nextDouble();
								  
								  scanner.nextLine();
								  
								  result= muhendislik.Bolme(a, b);
								  uk1.displayResult(result);
								 
							}
							  else if (secim==5) {
								  
								  System.out.println("**Karekök Alma Ýþlemini Seçtiniz**\n");
								  
								  System.out.print("Bi Sayý Giriniz: ");
								  double a=scanner.nextDouble();  
								  
								  scanner.nextLine();
								  
								  result= muhendislik.kok_alma(a);
								  uk1.displayResult(result);
								
							}
							  else if(secim==6) {
								  
								  System.out.println("**Üs Alma Ýþlemini Seçtiniz**\n");
								  
								  System.out.print("Bir Sayý Giriniz: ");
								  double a=scanner.nextDouble(); 
								  System.out.print("üs ifadesini yazýnýz: ");
								  double b=scanner.nextDouble(); 
								  
								  scanner.nextLine();
								  
								  result= muhendislik.us_alma(a, b);
								  uk1.displayResult(result);

								  
							  }
							  else {
								System.out.println("\n!!!Geçersiz Bir Ýþlem Seçtiniz.!!!\n"+"\tLütfen Bekleyiniz.");
								
								
								
								System.out.println(islem);
							}
						
						}
						
					  }
					
				    }
   }
			
			else if (language==2) {
				System.out.println("****Türkiye Tipi Hesap Makinesine Hoþgeldiniz****");
				
while(true) {
					
					String islem1 ="\n1-Basit Hesap Makinesi\n"+
							        "2-Muhendislik Hesap Makinesi\n"+
							        "3-Çýkýþ \n";
					System.out.println(islem1);
					System.out.print("\nLütfen Bir Hesap Makinesi Seçiniz: ");
					int secenek=scanner.nextInt();
						
					
					
					if(secenek==3) {// Seçenek :Çýkýþ ise....
						System.out.println("Programdan Çýkýlýyor...");
						  
						 break;
					}
					else if (secenek==1) {// Seçenek :Basit Hesap Makinesi ise....
						
						System.out.println("**Basit Hesap Makinasýný Seçtiniz**\n");
					
					
					
					
					while(true) {   
					
					String islem2="\n1-Toplama Ýslemi,2-Çýkarma Ýþlemi,3-Çarpma Ýslemi,4-Bölme Ýslemi,5-Çýkýþ\n ";
					System.out.println(islem2);
				

					System.out.print("\nLütfen Bir Ýþlem Seçiniz: ");
					 int secim=scanner.nextInt();
					 
					 if(secim==5) {
						 
						 System.out.println("Programdan Çýkýlýyor...");
						  
						 break;
						 
					 }
					 else if (secim==1) {
						  
						  System.out.println("**Toplama Ýþlemini Seçtiniz**\n");
						 
						  
						  System.out.print("1.Sayýyý Giriniz: ");
						  double a=scanner.nextDouble();
						  System.out.print("2.Sayýyý Giriniz: ");
						  double b=scanner.nextDouble();
						  
						  scanner.nextLine();
						 
						  
						  result= basit.Toplama(a, b);
						  tr1.displayResult(result);
					}
					  else if (secim==2) {
						  System.out.println("**Çýkarma Ýþlemini Seçtiniz**\n");
						 
						  
						  System.out.print("1.Sayýyý Giriniz: ");
						  double a=scanner.nextDouble();
						  System.out.print("2.Sayýyý Giriniz: ");
						  double b=scanner.nextDouble();
						  
						  scanner.nextLine();
						  
						  result= basit.Cikarma(a, b);
						  tr1.displayResult(result);
						  
					}
					  else if (secim==3) {
						  
						  System.out.println("**Çarpma Ýþlemini Seçtiniz**\n");
						  
						  
						  System.out.print("1.Sayýyý Giriniz: ");
						  double a=scanner.nextDouble();
						  System.out.print("2.Sayýyý Giriniz: ");
						  double b=scanner.nextDouble();
						  
						  scanner.nextLine();
						  
						  result= basit.Carpma(a, b);
						  tr1.displayResult(result);
						  
					}
					  else if (secim==4) {
						  System.out.println("**Bölme Ýþlemini Seçtiniz**\n");
						  
						  
						  System.out.print("1.Sayýyý Giriniz: ");
						  double a=scanner.nextDouble();
						  System.out.print("2.Sayýyý Giriniz: ");
						  double b=scanner.nextDouble();
						  
						  scanner.nextLine();
						 
						  result= basit.Bolme(a, b);
						  tr1.displayResult(result);
						 
					}
					  else {
						System.out.println("\n!!!Geçersiz Bir Ýþlem Seçtiniz.!!!\n"+"\tLütfen Bekleyiniz.");
						
						
						System.out.println(islem);
					}
				
				}
			}
					else if (secenek==2) { 			// secenek :Muhendislik hesap Makinesi  ise....
						
						System.out.println("**Muhendislik Hesap Makinasýný Seçtiniz**\n");
						
						while(true) {               
							String islem3="\n1-Toplama Ýslemi,2-Çýkarma Ýþlemi,3-Çarpma Ýslemi,4-Bölme Ýslemi,5-Karekök Alma Ýþlemi\n"+
											"6-Üs Alma Ýþlemi,7-Çýkýþ\n";
							
							System.out.println(islem3);
						
						
							System.out.print("\nLütfen Bir Ýþlem Seçiniz: ");
							int secim=scanner.nextInt();
							
						    if(secim==7) {
								 
								 System.out.println("Programdan Çýkýlýyor...");
								 break;
								 
							 }
							 else if (secim==1) {
								  
								  System.out.println("**Toplama Ýþlemini Seçtiniz**\n");
								 
								  
								  System.out.print("1.Sayýyý Giriniz: ");
								  double a=scanner.nextDouble();
								  System.out.print("2.Sayýyý Giriniz: ");
								  double b=scanner.nextDouble();
								  
								  scanner.nextLine();
								  
								  result= muhendislik.Toplama(a, b);
								  tr1.displayResult(result);

							}
							  else if (secim==2) {
								  System.out.println("**Çýkarma Ýþlemini Seçtiniz**\n");
								 
								  
								  System.out.print("1.Sayýyý Giriniz: ");
								  double a=scanner.nextDouble();
								  System.out.print("2.Sayýyý Giriniz: ");
								  double b=scanner.nextDouble();
								  
								  scanner.nextLine();
								  
								  result= muhendislik.Cikarma(a, b);
								  tr1.displayResult(result);
								  
							}
							  else if (secim==3) {
								  
								  System.out.println("**Çarpma Ýþlemini Seçtiniz**\n");
								  
								  
								  System.out.print("1.Sayýyý Giriniz: ");
								  double a=scanner.nextDouble();
								  System.out.print("2.Sayýyý Giriniz: ");
								  double b=scanner.nextDouble();
								  
								  scanner.nextLine();
								  
								  result= muhendislik.Carpma(a, b);
								  tr1.displayResult(result);
								  
							}
							  else if (secim==4) {
								  System.out.println("**Bölme Ýþlemini Seçtiniz**\n");
								  
								  
								  System.out.print("1.Sayýyý Giriniz: ");
								  double a=scanner.nextDouble();
								  System.out.print("2.Sayýyý Giriniz: ");
								  double b=scanner.nextDouble();
								  
								  scanner.nextLine();
								  
								  result= muhendislik.Bolme(a, b);
								  tr1.displayResult(result);
								 
							}
							  else if (secim==5) {
								  
								  System.out.println("**Karekök Alma Ýþlemini Seçtiniz**\n");
								  
								  System.out.print("Bi Sayý Giriniz: ");
								  double a=scanner.nextDouble();  
								  
								  scanner.nextLine();
								  
								  result= muhendislik.kok_alma(a);
								  tr1.displayResult(result);
								
							}
							  else if(secim==6) {
								  
								  System.out.println("**Üs Alma Ýþlemini Seçtiniz**\n");
								  
								  System.out.print("Bir Sayý Giriniz: ");
								  double a=scanner.nextDouble(); 
								  System.out.print("üs ifadesini yazýnýz: ");
								  double b=scanner.nextDouble(); 
								  
								  scanner.nextLine();
								  
								  result= muhendislik.us_alma(a, b);
								  tr1.displayResult(result);

								  
							  }
							  else {
								System.out.println("\n!!!Geçersiz Bir Ýþlem Seçtiniz.!!!\n"+"\tLütfen Bekleyiniz.");
								
								
								
								System.out.println(islem);
							}
						
						}
						
					  }
					
				    }
		
			}
			
			else {
				System.out.println("Geçersiz bir iþlem Seçtiniz...");
			}
			
			
			
		}

	}

}
