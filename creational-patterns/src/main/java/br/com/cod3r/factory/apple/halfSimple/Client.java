package br.com.cod3r.factory.apple.halfSimple;

import br.com.cod3r.factory.apple.halfSimple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneXFactory;

public class Client {

	public static void main(String[] args) {
		
		IPhoneXFactory iPhoneX = new IPhoneXFactory(); 
		IPhone11Factory iPhone11Pro = new IPhone11Factory();
		
		System.out.println("### Ordering an iPhone X");
		System.out.println(iPhoneX.orderIPhone("standard"));
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		System.out.println(iPhone11Pro.orderIPhone("highEnd"));

	}

}
