import java.text.SimpleDateFormat;
import java.util.Date;

public class Trip {
    private String destination;
    private int price;
    private Date departureDate;
    private TripType tripType;
    private int quantity;

    public Trip(String destination, int price, String departureDate, TripType tripType, int quantity) {
        this.destination = destination;
        this.price = price;
        this.tripType = tripType;
        this.quantity = quantity;

        // Parsing tanggal
        try {
            this.departureDate = new SimpleDateFormat("dd-MMM-yyyy").parse(departureDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getDestination() {
        return destination;
    }

    public int getPrice() {
        return price;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public TripType getTripType() {
        return tripType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void decreaseQuantity() {
        quantity--;
    }

    public void increaseQuantity() {
        quantity++;
    }
}