public class Main {
    public static void main(String[] args) {
        Movie Comedy = new Movie("Shiva Baby",78,"PG","Rian Johnson");

        Movie Horror = new Movie("A Nightmare on Elm Street",90,"PG-13","Wes Craven");

        // Movie Objects Information
        Comedy.setTitle(" ");
        Comedy.setDirector("Emma Seligman");
        Comedy.setMovieLengthInMinutes(-58);
        System.out.println("\nMovie Objects Information");
        System.out.println(Comedy.getTitle() + "\t" + Comedy.getMovieLengthInMinutes() + "\t" + Comedy.rating + "\t" + Comedy.getDirector());

        // Instagram reels
        Reel reel1 = new Reel(1,3600,15, 6,"Song1.mp3");
        Reel reel2 = new Reel(2,5300,40, 12,"Song2.mp3");

        // Instagram Reels Objects Information
        System.out.println();
        reel1.setUserId(-5);
        reel1.setNumberOfLikes(-78);

        reel2.setNumberOfShares(-24);
        reel2.setLengthInSeconds(2365);

        System.out.println("\nInstagram Reels Objects Information");
        System.out.println(reel1.getUserId()+"\t"+reel1.getNumberOfLikes()+"\t"+reel1.getLengthInSeconds() + "\t"+ reel2.getBackgroundSong());
        System.out.println(reel2.getUserId()+"\t"+reel2.getNumberOfLikes()+"\t"+reel2.getLengthInSeconds()+"\t"+reel2.getBackgroundSong());
    }
}
