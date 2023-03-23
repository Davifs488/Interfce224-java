package entities;

import java.time.LocalDateTime;

import model.entities.Invoice;

public class CarRental {

	private LocalDateTime start;
	private LocalDateTime finish;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental() {
		
	}

	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {		
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
		
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFisish() {
		return finish;
	}

	public void setFisish(LocalDateTime fisish) {
		this.finish = fisish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
    
	
}
