package fr.aop.tp2;


public class Client {

	private String name;
	private String address;

	public Client(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public void printClient() {
		System.out.println("Client :" + name + ", " + address);
	}			

}

