package com.company.aula02.produtodigital;

import java.time.LocalDate;

public class Ticket extends DigitalProduct{

    LocalDate date;
    String ownership;
    private int ownershipChanges;
    String address;
    String company;
    String eventInfo;
    String identification;


    @Override
    public String getPublisherInfo() {
        return company + eventInfo;
    }

    @Override
    public boolean getProductIsValid() {
        LocalDate now = LocalDate.now();
        boolean isBefore = now.isBefore(date);
        return isBefore && identification.equals(ownership);
    }

    public Ticket(LocalDate date, String ownership, String address, String company, String eventInfo, String identification) {
        this.date = date;
        this.ownership = ownership;
        this.address = address;
        this.company = company;
        this.eventInfo = eventInfo;
        this.identification = identification;
        this.ownershipChanges = 0;
    }

    public void changeOwnership(String ownership){
        if(ownershipChanges <2) {
            this.ownership = ownership;
            ownershipChanges++;
        } else{
            System.out.println("You can't change a ticket's ownership over twice");
        }
    }
}
