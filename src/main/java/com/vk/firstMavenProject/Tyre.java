package com.vk.firstMavenProject;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	/*public Tyre(String brand, String forVehicle) {
		super();
		this.brand = brand;
		this.forVehicle = forVehicle;
	}*/
	private String brand;
	private String forVehicle;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getForVehicle() {
		return forVehicle;
	}
	public void setForVehicle(String forVehicle) {
		this.forVehicle = forVehicle;
	}
	@Override
	public String toString() {
		return "Tyre [brand=" + brand + ", forVehicle=" + forVehicle + "]";
	}
}
