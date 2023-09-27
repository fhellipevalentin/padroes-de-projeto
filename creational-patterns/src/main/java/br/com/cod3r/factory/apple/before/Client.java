package br.com.cod3r.factory.apple.before;

import br.com.cod3r.factory.apple.before.model.*;

public class Client {

	public IPhone orderIphone(String generation, String level) {
		IPhone device = null;
		if (generation.equals("X")) {
			if (level.equals("standard")) {
				device = new IPhoneX();
			} else if(level.equals("highEnd")) {
				device = new IPhoneXSMax();
			}
		} else if (generation.equals("11")){
			if (level.equals("standard")) {
				device = new IPhone11();
			} else if (level.equals("highEnd")) {
				device = new IPhone11Pro();
			}
		}
		if (device != null) {
			device.getHardware();
			device.assemble();
			device.certificates();
			device.pack();
		}

		return device;
	}

	
	public static void main(String[] args) {
		Client client = new Client();
		System.out.println("### Ordering an iPhone X");

		System.out.println(client.orderIphone("X", "standard"));
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");

		System.out.println(client.orderIphone("11", "highEnd"));
	}
}
