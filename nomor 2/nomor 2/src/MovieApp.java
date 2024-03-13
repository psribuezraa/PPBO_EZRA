import java.util.ArrayList;

public class MovieApp {
    ArrayList<Movie> film_list = new ArrayList<Movie>();
    ArrayList<Booking> booking_list = new ArrayList<Booking>();

    MovieApp(){

    }
    void tambah_film(Movie film){
        film_list.add(film);
    }
    void movie_today(){
        System.out.println("Film Hari Ini:");
        for(Movie e:film_list){
            System.out.printf("%d mins ~ %s - %s (%d Seats)\n",e.duration,e.judul_film,e.genre,e.kursi_kosong);
        }
    }
    void cari_film(String title){
        for(Movie e:film_list){
            if(e.judul_film==title){
                System.out.printf("Film %s tersedia %d kursi\n",e.judul_film,e.kursi_kosong);
                return;
            }
        }
        System.out.printf("Film %s tidak tersedia\n",title);
    }
    void book_film(Movie film,int seats){
        for(Movie e:film_list){
            if(e.judul_film==film.judul_film){
                if(e.kursi_kosong>=seats){
                    e.kursi_kosong -= seats;
                    Booking baru = new Booking(film,seats,generateId());
                    booking_list.add(baru);
                    System.out.println("\nPesanan berhasil");
                    System.out.printf("Judul : %s\n",baru.film.judul_film);
                    System.out.printf("Jumlah : %d\n",baru.ticket);
                    System.out.printf("Booking ID : %d\n",baru.id);
                    return;
                }
            }
        }
        System.out.printf("\nPesanan %s gagal\n\n",film.judul_film);
    }
    int generateId(){
        // return String.format("00%d",daftarBooking.size()+1);
        return booking_list.size()+1;
    }
    void displayBooking(){
        for(Booking e:booking_list){
            System.out.printf("Pesanan %d\n",e.id);
            System.out.printf("Film %s\n",e.film.judul_film);
            System.out.printf("Jumlah %d kursi\n",e.ticket);
        }

    }
    void cari_booking(int idBook){
        for(Booking e:booking_list){
            if(e.id==idBook){
                System.out.printf("\nPesanan %d\n",e.id);
                System.out.printf("Film : %s\n",e.film.judul_film);
                System.out.printf("Jumlah : %d kursi\n",e.ticket);
                return;
            }
        }
        System.out.printf("\nFilm tersebut tidak ditemukan\n",idBook);
    }
}