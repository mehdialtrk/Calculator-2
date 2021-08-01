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
		System.out.print("\nL�tfen Bir Hesap Makinesi Stili Se�iniz: ");
		int language =scanner.nextInt();
			
			if(language==3) {
				System.out.println("��k�� yap�l�yor....");
				
				break ;
			}
			else if (language==1) {
				System.out.println("****�ngiltere Tipi Hesap Makinesine Ho�geldiniz****");
				
				while(true) {
					
					String islem1 ="\n1-Basit Hesap Makinesi,2-Muhendislik Hesap Makinesi ,3-��k�� \n";
					System.out.println(islem1);
					System.out.print("\nL�tfen Bir Hesap Makinesi Se�iniz: ");
					int secenek=scanner.nextInt();
						
					
					
					if(secenek==3) {// Se�enek :��k�� ise....
						System.out.println("Programdan ��k�l�yor...");
						  
						 break;
					}
					else if (secenek==1) {// Se�enek :Basit Hesap Makinesi ise....
						
						System.out.println("**Basit Hesap Makinas�n� Se�tiniz**\n");
					
					
					
					
					while(true) {   
					
					String islem2="\n1-Toplama �slemi,2-��karma ��lemi,3-�arpma �slemi,4-B�lme �slemi,5-��k��\n ";
				
							     
					System.out.println(islem2);
				

					System.out.print("\nL�tfen Bir ��lem Se�iniz: ");
					 int secim=scanner.nextInt();
					 
					 if(secim==5) {
						 
						 System.out.println("Programdan ��k�l�yor...");
						  
						 break;
						 
					 }
					 else if (secim==1) {
						  
						  System.out.println("**Toplama ��lemini Se�tiniz**\n");
						 
						  
						  System.out.print("1.Say�y� Giriniz: ");
						  double a=scanner.nextDouble();
						  System.out.print("2.Say�y� Giriniz: ");
						  double b=scanner.nextDouble();
						  
						  scanner.nextLine();
						result=  basit.Toplama(a, b);
						uk1.displayResult(result);
						
						 
						  
											}
					  else if (secim==2) {
						  System.out.println("**��karma ��lemini Se�tiniz**\n");
						 
						  
						  System.out.print("1.Say�y� Giriniz: ");
						  double a=scanner.nextDouble();
						  System.out.print("2.Say�y� Giriniz: ");
						  double b=scanner.nextDouble();
						  
						  scanner.nextLine();
						  
						  result=  basit.Cikarma(a, b);
							uk1.displayResult(result);
						  
					}
					  else if (secim==3) {
						  
						  System.out.println("**�arpma ��lemini Se�tiniz**\n");
						  
						  
						  System.out.print("1.Say�y� Giriniz: ");
						  double a=scanner.nextDouble();
						  System.out.print("2.Say�y� Giriniz: ");
						  double b=scanner.nextDouble();
						  
						  scanner.nextLine();
						  
						  result=  basit.Carpma(a, b);
						  uk1.displayResult(result);
						  
					}
					  else if (secim==4) {
						  System.out.println("**B�lme ��lemini Se�tiniz**\n");
						  
						  
						  System.out.print("1.Say�y� Giriniz: ");
						  double a=scanner.nextDouble();
						  System.out.print("2.Say�y� Giriniz: ");
						  double b=scanner.nextDouble();
						  
						  scanner.nextLine();
						 
						  result=  basit.Bolme(a, b);
						  uk1.displayResult(result);
						 
					}
					  else {
						System.out.println("\n!!!Ge�ersiz Bir ��lem Se�tiniz.!!!\n"+"\tL�tfen Bekleyiniz.");
						
						
						System.out.println(islem);
					}
				
				}
			}
					else if (secenek==2) { 			// secenek :Muhendislik hesap Makinesi  ise....
						
						System.out.println("**Muhendislik Hesap Makinas�n� Se�tiniz**\n");
						
						while(true) {               
							String islem3="\n1-Toplama �slemi,2-��karma ��lemi,3-�arpma �slemi,4-B�lme �slemi,5-Karek�k Alma ��lemi\n"+
											"6-�s Alma ��lemi,7-��k��\n";

							System.out.println(islem3);
						
						
							System.out.print("\nL�tfen Bir ��lem Se�iniz: ");
							int secim=scanner.nextInt();
							
						    if(secim==7) {
								 
								 System.out.println("Programdan ��k�l�yor...");
								 break;
								 
							 }
							 else if (secim==1) {
								  
								  System.out.println("**Toplama ��lemini Se�tiniz**\n");
								 
								  
								  System.out.print("1.Say�y� Giriniz: ");
								  double a=scanner.nextDouble();
								  System.out.print("2.Say�y� Giriniz: ");
								  double b=scanner.nextDouble();
								  
								  scanner.nextLine();
								  
								  result= muhendislik.Toplama(a, b);
								  uk1.displayResult(result);

							}
							  else if (secim==2) {
								  System.out.println("**��karma ��lemini Se�tiniz**\n");
								 
								  
								  System.out.print("1.Say�y� Giriniz: ");
								  double a=scanner.nextDouble();
								  System.out.print("2.Say�y� Giriniz: ");
								  double b=scanner.nextDouble();
								  
								  scanner.nextLine();
								  
								  result= muhendislik.Cikarma(a, b);
								  uk1.displayResult(result);
								  
							}
							  else if (secim==3) {
								  
								  System.out.println("**�arpma ��lemini Se�tiniz**\n");
								  
								  
								  System.out.print("1.Say�y� Giriniz: ");
								  double a=scanner.nextDouble();
								  System.out.print("2.Say�y� Giriniz: ");
								  double b=scanner.nextDouble();
								  
								  scanner.nextLine();
								  
								  result= muhendislik.Carpma(a, b);
								  uk1.displayResult(result);
								  
							}
							  else if (secim==4) {
								  System.out.println("**B�lme ��lemini Se�tiniz**\n");
								  
								  
								  System.out.print("1.Say�y� Giriniz: ");
								  double a=scanner.nextDouble();
								  System.out.print("2.Say�y� Giriniz: ");
								  double b=scanner.nextDouble();
								  
								  scanner.nextLine();
								  
								  result= muhendislik.Bolme(a, b);
								  uk1.displayResult(result);
								 
							}
							  else if (secim==5) {
								  
								  System.out.println("**Karek�k Alma ��lemini Se�tiniz**\n");
								  
								  System.out.print("Bi Say� Giriniz: ");
								  double a=scanner.nextDouble();  
								  
								  scanner.nextLine();
								  
								  result= muhendislik.kok_alma(a);
								  uk1.displayResult(result);
								
							}
							  else if(secim==6) {
								  
								  System.out.println("**�s Alma ��lemini Se�tiniz**\n");
								  
								  System.out.print("Bir Say� Giriniz: ");
								  double a=scanner.nextDouble(); 
								  System.out.print("�s ifadesini yaz�n�z: ");
								  double b=scanner.nextDouble(); 
								  
								  scanner.nextLine();
								  
								  result= muhendislik.us_alma(a, b);
								  uk1.displayResult(result);

								  
							  }
							  else {
								System.out.println("\n!!!Ge�ersiz Bir ��lem Se�tiniz.!!!\n"+"\tL�tfen Bekleyiniz.");
								
								
								
								System.out.println(islem);
							}
						
						}
						
					  }
					
				    }
   }
			
			else if (language==2) {
				System.out.println("****T�rkiye Tipi Hesap Makinesine Ho�geldiniz****");
				
while(true) {
					
					String islem1 ="\n1-Basit Hesap Makinesi\n"+
							        "2-Muhendislik Hesap Makinesi\n"+
							        "3-��k�� \n";
					System.out.println(islem1);
					System.out.print("\nL�tfen Bir Hesap Makinesi Se�iniz: ");
					int secenek=scanner.nextInt();
						
					
					
					if(secenek==3) {// Se�enek :��k�� ise....
						System.out.println("Programdan ��k�l�yor...");
						  
						 break;
					}
					else if (secenek==1) {// Se�enek :Basit Hesap Makinesi ise....
						
						System.out.println("**Basit Hesap Makinas�n� Se�tiniz**\n");
					
					
					
					
					while(true) {   
					
					String islem2="\n1-Toplama �slemi,2-��karma ��lemi,3-�arpma �slemi,4-B�lme �slemi,5-��k��\n ";
					System.out.println(islem2);
				

					System.out.print("\nL�tfen Bir ��lem Se�iniz: ");
					 int secim=scanner.nextInt();
					 
					 if(secim==5) {
						 
						 System.out.println("Programdan ��k�l�yor...");
						  
						 break;
						 
					 }
					 else if (secim==1) {
						  
						  System.out.println("**Toplama ��lemini Se�tiniz**\n");
						 
						  
						  System.out.print("1.Say�y� Giriniz: ");
						  double a=scanner.nextDouble();
						  System.out.print("2.Say�y� Giriniz: ");
						  double b=scanner.nextDouble();
						  
						  scanner.nextLine();
						 
						  
						  result= basit.Toplama(a, b);
						  tr1.displayResult(result);
					}
					  else if (secim==2) {
						  System.out.println("**��karma ��lemini Se�tiniz**\n");
						 
						  
						  System.out.print("1.Say�y� Giriniz: ");
						  double a=scanner.nextDouble();
						  System.out.print("2.Say�y� Giriniz: ");
						  double b=scanner.nextDouble();
						  
						  scanner.nextLine();
						  
						  result= basit.Cikarma(a, b);
						  tr1.displayResult(result);
						  
					}
					  else if (secim==3) {
						  
						  System.out.println("**�arpma ��lemini Se�tiniz**\n");
						  
						  
						  System.out.print("1.Say�y� Giriniz: ");
						  double a=scanner.nextDouble();
						  System.out.print("2.Say�y� Giriniz: ");
						  double b=scanner.nextDouble();
						  
						  scanner.nextLine();
						  
						  result= basit.Carpma(a, b);
						  tr1.displayResult(result);
						  
					}
					  else if (secim==4) {
						  System.out.println("**B�lme ��lemini Se�tiniz**\n");
						  
						  
						  System.out.print("1.Say�y� Giriniz: ");
						  double a=scanner.nextDouble();
						  System.out.print("2.Say�y� Giriniz: ");
						  double b=scanner.nextDouble();
						  
						  scanner.nextLine();
						 
						  result= basit.Bolme(a, b);
						  tr1.displayResult(result);
						 
					}
					  else {
						System.out.println("\n!!!Ge�ersiz Bir ��lem Se�tiniz.!!!\n"+"\tL�tfen Bekleyiniz.");
						
						
						System.out.println(islem);
					}
				
				}
			}
					else if (secenek==2) { 			// secenek :Muhendislik hesap Makinesi  ise....
						
						System.out.println("**Muhendislik Hesap Makinas�n� Se�tiniz**\n");
						
						while(true) {               
							String islem3="\n1-Toplama �slemi,2-��karma ��lemi,3-�arpma �slemi,4-B�lme �slemi,5-Karek�k Alma ��lemi\n"+
											"6-�s Alma ��lemi,7-��k��\n";
							
							System.out.println(islem3);
						
						
							System.out.print("\nL�tfen Bir ��lem Se�iniz: ");
							int secim=scanner.nextInt();
							
						    if(secim==7) {
								 
								 System.out.println("Programdan ��k�l�yor...");
								 break;
								 
							 }
							 else if (secim==1) {
								  
								  System.out.println("**Toplama ��lemini Se�tiniz**\n");
								 
								  
								  System.out.print("1.Say�y� Giriniz: ");
								  double a=scanner.nextDouble();
								  System.out.print("2.Say�y� Giriniz: ");
								  double b=scanner.nextDouble();
								  
								  scanner.nextLine();
								  
								  result= muhendislik.Toplama(a, b);
								  tr1.displayResult(result);

							}
							  else if (secim==2) {
								  System.out.println("**��karma ��lemini Se�tiniz**\n");
								 
								  
								  System.out.print("1.Say�y� Giriniz: ");
								  double a=scanner.nextDouble();
								  System.out.print("2.Say�y� Giriniz: ");
								  double b=scanner.nextDouble();
								  
								  scanner.nextLine();
								  
								  result= muhendislik.Cikarma(a, b);
								  tr1.displayResult(result);
								  
							}
							  else if (secim==3) {
								  
								  System.out.println("**�arpma ��lemini Se�tiniz**\n");
								  
								  
								  System.out.print("1.Say�y� Giriniz: ");
								  double a=scanner.nextDouble();
								  System.out.print("2.Say�y� Giriniz: ");
								  double b=scanner.nextDouble();
								  
								  scanner.nextLine();
								  
								  result= muhendislik.Carpma(a, b);
								  tr1.displayResult(result);
								  
							}
							  else if (secim==4) {
								  System.out.println("**B�lme ��lemini Se�tiniz**\n");
								  
								  
								  System.out.print("1.Say�y� Giriniz: ");
								  double a=scanner.nextDouble();
								  System.out.print("2.Say�y� Giriniz: ");
								  double b=scanner.nextDouble();
								  
								  scanner.nextLine();
								  
								  result= muhendislik.Bolme(a, b);
								  tr1.displayResult(result);
								 
							}
							  else if (secim==5) {
								  
								  System.out.println("**Karek�k Alma ��lemini Se�tiniz**\n");
								  
								  System.out.print("Bi Say� Giriniz: ");
								  double a=scanner.nextDouble();  
								  
								  scanner.nextLine();
								  
								  result= muhendislik.kok_alma(a);
								  tr1.displayResult(result);
								
							}
							  else if(secim==6) {
								  
								  System.out.println("**�s Alma ��lemini Se�tiniz**\n");
								  
								  System.out.print("Bir Say� Giriniz: ");
								  double a=scanner.nextDouble(); 
								  System.out.print("�s ifadesini yaz�n�z: ");
								  double b=scanner.nextDouble(); 
								  
								  scanner.nextLine();
								  
								  result= muhendislik.us_alma(a, b);
								  tr1.displayResult(result);

								  
							  }
							  else {
								System.out.println("\n!!!Ge�ersiz Bir ��lem Se�tiniz.!!!\n"+"\tL�tfen Bekleyiniz.");
								
								
								
								System.out.println(islem);
							}
						
						}
						
					  }
					
				    }
		
			}
			
			else {
				System.out.println("Ge�ersiz bir i�lem Se�tiniz...");
			}
			
			
			
		}

	}

}
