package br.com.cod3r.factory.apple.after;

import br.com.cod3r.factory.apple.after.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.after.factory.IPhoneXFactory;

public class Client {
	
	public static void main(String[] args) {
		
		IPhoneXFactory iPhoneX = new IPhoneXFactory(); 
		IPhone11ProFactory iPhone11Pro = new IPhone11ProFactory();
		
		System.out.println("### Ordering an iPhone X");
		System.out.println(iPhoneX.orderIPhone());
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		System.out.println(iPhone11Pro.orderIPhone());
	}
}
