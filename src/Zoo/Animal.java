package Zoo;

import java.time.LocalDate;

abstract class Animal {
    private final String tradName; // "vanlig" navn på dyret
    private final String latName;  // latinsk artsnavn
    private final String latFamily;  // artsfamilie
    private final LocalDate arrivalDate;  // dato ankommet dyrehagen
    private String address; // innhegning, bur, akvarium el.l. (unikt innad i dyrehagen)

    /* Enkel konstruktør, ingen datakontroll */
    public Animal(String tradName, String latName, String latFamily, LocalDate arrivalDate, String address) {
        this.tradName = tradName;
        this.latName = latName;
        this.latFamily = latFamily;
        this.arrivalDate = arrivalDate;
        this.address = address;
    }

    public String getTradName(){
        return tradName;
    }

    public String getLatName() {
        return latName;
    }

    public String getLatFamily() {
        return latFamily;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String newAddress){
        address = newAddress;
    }

    public String toString() {
        return "Norsk navn: " + tradName + "\nLatinsk navn og familie: " + latName + ", " + latFamily + "\nAdresse: "+ address;
    }
}