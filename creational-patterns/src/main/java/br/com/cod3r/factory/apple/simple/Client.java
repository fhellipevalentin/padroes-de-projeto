package br.com.cod3r.factory.apple.simple;

import br.com.cod3r.factory.apple.simple.factory.IPhoneSimpleFactory;

public class Client {

	public static void main(String[] args) {		
		System.out.println("### Ordering an iPhone 11");
		System.out.println(IPhoneSimpleFactory.orderIPhone("11", "standard"));
		
		System.out.println("### Ordering an iPhone XSMax");
		System.out.println(IPhoneSimpleFactory.orderIPhone("X", "highEnd"));
	}

}
