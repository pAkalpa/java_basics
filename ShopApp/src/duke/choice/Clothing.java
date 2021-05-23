/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

/**
 *
 * @author Pasindu
 */
public class Clothing {
	private String description;
	private double price;
	private String size = "M";	

	private final double MIN_PRICE = 10.0;
	private final double MIN_TAX = .2;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price + price * MIN_TAX;
	}

	public void setPrice(double price) {
		this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
