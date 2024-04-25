import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TravelAgent {
    private List<Trip> trips;
    private Map<String, Trip> bookings; // Key: email customer, Value: trip yang dipesan

    public TravelAgent() {
        trips = new ArrayList<>();
        bookings = new HashMap<>();
    }

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public void showAvailableTrip() {
        System.out.println("Terdapat " + countAvailableTrips() + " trip yang masih tersedia :");
        for (Trip trip : trips) {
            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
            System.out.println("Destinasi : " + trip.getDestination() +
                    " -- Keberangkatan : " + sdf.format(trip.getDepartureDate()) +
                    " -- Harga: " + trip.getPrice() +
                    " -- Quantity : " + trip.getQuantity() +
                    " -- Jenis : " + trip.getTripType());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
    }

    private int countAvailableTrips() {
        int count = 0;
        for (Trip trip : trips) {
            if (trip.getQuantity() > 0) {
                count++;
            }
        }
        return count;
    }

    public void bookTrip(Customer customer, Trip trip) {
        if (bookings.containsKey(customer.getEmail())) {
            System.out.println("Pemesanan gagal, pengguna telah memiliki pesanan pada trip yang sama.");
            return;
        }

        if (trip.getQuantity() <= 0) {
            System.out.println("Pemesanan gagal, perjalanan ke " + trip.getDestination() + " telah habis terjual.");
            return;
        }

        trip.decreaseQuantity();
        String bookingID = generateBookingID(trip);
        bookings.put(customer.getEmail(), trip);
        System.out.println("Pemesanan berhasil dilakukan dengan booking id " + bookingID);
    }

    private String generateBookingID(Trip trip) {
        return String.format("00%s%02d%s%d", trip.getDestination().substring(0, 2),
                trip.getPrice(), trip.getTripType().toString().charAt(0), trip.getQuantity());
    }

    public void cancelBooking(String email, Trip trip) {
        if (!bookings.containsKey(email)) {
            System.out.println("Pesanan tidak ditemukan.");
            return;
        }

        if (trip.getQuantity() >= 2) {
            System.out.println("Pembatalan gagal, hanya satu tiket yang telah dipesan.");
            return;
        }

        trip.increaseQuantity();
        bookings.remove(email);
        System.out.println("Pesanan dengan id booking " + generateBookingID(trip) + " berhasil dibatalkan");
    }
}
//
//    // OPSIONAL METHOD
//
//    public void getBookingsByCustomerEmail(String email) {
//        if (!bookings.containsKey(email)) {
//            System.out.println("Tidak ditemukan pesanan untuk email " + email);
//            return;
//        }
//
//        Trip trip = bookings.get(email);
//        System.out.println("Booking ID: " + generateBookingID(trip) +
//                ", Destinasi: " + trip.getDestination());
//    }
//
//    public void getAvailableTripsByType(TripType tripType) {
//        int count = 0;
//        System.out.println("Ditemukan trip untuk jenis " + tripType.toString());
//        for (Trip trip : trips) {
//            if (trip.getTripType() == tripType && trip.getQuantity() > 0) {
//                count++;
//                SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
//                System.out.println("Destinasi : " + trip.getDestination() +
//                        " -- Keberangkatan : " + sdf.format(trip.getDepartureDate()) +
//                        " -- Harga: " + trip.getPrice() +
//                        " -- Quantity : " + trip.getQuantity() +
//                        " -- Jenis : " + trip.getTripType());
//            }
//        }
//        if (count == 0) {
//            System.out.println("Tidak ditemukan trip untuk jenis " + tripType.toString());
//        }
//    }
//
//    public void getAvailableTripsByDate(String date) {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
//        try {
//            Date searchDate = sdf.parse(date);
//            int count = 0;
//            System.out.println("Ditemukan trip untuk keberangkatan tanggal " + sdf.format(searchDate));
//            for (Trip trip : trips) {
//                if (trip.getDepartureDate().equals(searchDate) && trip.getQuantity() > 0) {
//                    count++;
//                    SimpleDateFormat sdf2 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
//                    System.out.println("Destinasi : " + trip.getDestination() +
//                            " -- Keberangkatan : " + sdf2.format(trip.getDepartureDate()) +
//                            " -- Harga: " + trip.getPrice() +
//                            " -- Quantity : " + trip.getQuantity() +
//                            " -- Jenis : " + trip.getTripType());
//                }
//            }
//            if (count == 0) {
//                System.out.println("Tidak ditemukan trip untuk keberangkatan tanggal " + sdf.format(searchDate));
//            }
//        } catch (ParseException e) {
//            System.out.println("Format tanggal salah, gunakan format dd-MMM-yyyy, contoh: 01-MAY-2024");
//        }
//    }
//}