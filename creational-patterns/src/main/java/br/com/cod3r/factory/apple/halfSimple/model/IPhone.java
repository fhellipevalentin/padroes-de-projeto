package br.com.cod3r.factory.apple.halfSimple.model;

public abstract class IPhone {
	
	public void assemble() {
		System.out.println("Assembling all the hardwares");
	}
	public void certificates() {
		System.out.println("Testing all the certificates");
	}
	public void pack() {
		System.out.println("Packing the device");
	}
	public abstract void getHardware();
}
