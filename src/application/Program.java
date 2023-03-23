package application;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	System.out.println("Entre com o dados do aluguel");
	System.out.println("Modelo do carro: ");
	String carModel = sc.nextLine();
	System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
	LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
	System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
	LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);
	
	
	CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
	
	System.out.print("Entre com o preço por hora:  ");
	double pricePerHour = sc.nextDouble();
	System.out.print("Entre com o preço por dia:  ");
	double princePerDay = sc.nextDouble();
	
	RentalService rentalService = new RentalService(pricePerHour, princePerDay, new BrazilTaxService());
	rentalService.processInvoice(cr);
	
	System.out.println("FATURA : ");
	System.out.printf("Pagamento basico = %.2f\n" , cr.getInvoice().getBasicPayment());
	System.out.printf("Imposto = %.2f\n" , cr.getInvoice().getTax());
	System.out.printf("Pagamento total = %.2f\n" , cr.getInvoice().getTotalPyment());
	sc.close();
		
	}

}
