public class Booking {
    private int id;
    private Customer customer;
    private Trip trip;

    public Booking(int id, Customer customer, Trip trip){
        this.id = id;
        this.customer = customer;
        this.trip = trip;
    }

    public int getId(){
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Trip getTrip() {
        return trip;
    }
}
