public class Movie {
    String title;
    int  movieLengthInMinutes;
    String rating;
    String director;

    public Movie(String title, int movieLengthInMinutes, String rating, String director) {
        this.title = title;
        this.movieLengthInMinutes = movieLengthInMinutes;
        this.rating = rating;
        this.director = director;
    }

    // Setter methods
    public void setTitle(String title) {
        if(title == " "){
            System.out.println("Title cannot be empty");
        }
        else {
            this.title = title;
            System.out.println("Title updated to " + this.title);
        }
    }

    public void setMovieLengthInMinutes(int movieLengthInMinutes) {
        if(movieLengthInMinutes <= 0){
            System.out.println("MovieLengthInMinutes cannot be negative or Zero");
        }
        else {
            this.movieLengthInMinutes = movieLengthInMinutes;
            System.out.println("MovieLengthInMinutes updated to " + movieLengthInMinutes);
        }
    }

    public void setRating(String rating) {
        if(rating == " "){
            System.out.println("Rating cannot be empty");
        }
        else {
            this.rating = rating;
            System.out.println("Rating updated to: " + rating);
        }
    }

    public void setDirector(String director) {
        if(director == " "){
            System.out.println("Director cannot be empty");
        }
        else {
            this.director = director;
            System.out.println("Director updated to: " + director);
        }
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public int getMovieLengthInMinutes() {
        return movieLengthInMinutes;
    }

    public String getRating() {
        return rating;
    }

    public String getDirector() {
        return director;
    }
}
