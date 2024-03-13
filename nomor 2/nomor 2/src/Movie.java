public class Movie {
    String judul_film;
    int kursi_kosong;
    String genre;
    int duration;

    Movie(String title,String genre,int duration,int seats){
        this.judul_film=title;
        this.kursi_kosong=seats;
        this.genre=genre;
        this.duration=duration;
    }
}