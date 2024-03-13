public class Main {
    public static void main(String[] args) {

                MovieApp app = new MovieApp();
                Movie kungfu_panda = new Movie("Kungfu Panda 4","Action",94,45);
                Movie dune_2 = new Movie("Dune Part 2","Action",166,45);
                app.tambah_film(kungfu_panda);
                app.tambah_film(dune_2);
                app.movie_today();
                app.cari_film("Kungfu Panda 4");
                app.cari_film("Dune Part 2");
                app.cari_film("Avengers");
                app.book_film(kungfu_panda,20);
                app.book_film(dune_2,50);
                app.movie_today();
                app.cari_booking(1);
                app.cari_booking(2);
            }
    }
