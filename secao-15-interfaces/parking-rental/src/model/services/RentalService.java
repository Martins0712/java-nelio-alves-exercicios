package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxService;

    public RentalService(TaxService taxService, Double pricePerHour, Double pricePerDay) {
        this.taxService = taxService;
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
    }

    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;

        double basicPayement;
        if (hours <= 12){
            basicPayement = pricePerHour * Math.ceil(hours);
        }else{
            basicPayement = pricePerDay * Math.ceil(hours / 24.0);
        }

        double tax = taxService.tax(basicPayement);

        carRental.setInvoice(new Invoice());
    }
}
