package io.helidon.examples.quickstart.se;


import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;

public final class Reservation {
    private String OrganizationCode;
    private String ItemNumber;
    private String SubinventoryCode;
    private int ReservationQuantity;

    /*
    public   Reservation (){
        this.OrganizationCode = "";
        this.ItemNumber = "";
        this.SubinventoryCode = "";
        this.ReservationQuantity = 0;
    }
    */

    private Reservation(String organizationCode, String itemNumber, String SubinventoryCode, int reservationQuantity) {
        this.OrganizationCode = organizationCode;
        this.ItemNumber = itemNumber;
        this.SubinventoryCode = SubinventoryCode;
        this.ReservationQuantity = reservationQuantity;

    }

    /*@JsonbCreator
    public static Reservation of(@JsonbProperty("organizationCode") String organizationCode,
                          @JsonbProperty("itemNumber") String itemNumber,
                          @JsonbProperty("SubinventoryCode") String subinventoryCode,
                          @JsonbProperty("reservationQuantity") int reservationQuantity){

        System.out.println("Org code "+organizationCode);
        System.out.println("Item Number "+itemNumber);
        System.out.println("Sub Inv "+subinventoryCode);
        System.out.println("Reserv Qty "+reservationQuantity);

        Reservation reservation = new Reservation(organizationCode,itemNumber,subinventoryCode,reservationQuantity);
        return reservation;
    }*/

    public static Reservation of(String organizationCode,
                                  String itemNumber,
                                  String subinventoryCode,
                                  int reservationQuantity){

        System.out.println("Org code "+organizationCode);
        System.out.println("Item Number "+itemNumber);
        System.out.println("Sub Inv "+subinventoryCode);
        System.out.println("Reserv Qty "+reservationQuantity);

        Reservation reservation = new Reservation(organizationCode,itemNumber,subinventoryCode,reservationQuantity);
        return reservation;
    }
    public String getOrganizationCode() {
        return OrganizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        OrganizationCode = organizationCode;
    }

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }

    public String getSubinventoryCode() {
        return SubinventoryCode;
    }

    public void setSubinventoryCode(String subinventoryCode) {
        SubinventoryCode = subinventoryCode;
    }

    public int getReservationQuantity() {
        return ReservationQuantity;
    }

    public void setReservationQuantity(int reservationQuantity) {
        ReservationQuantity = reservationQuantity;
    }
}
