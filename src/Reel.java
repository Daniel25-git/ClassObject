public class Reel {
    long userId;
    int lengthInSeconds;
    int numberOfLikes;
    int numberOfShares;
    String backgroundSong;

    public Reel(long userId, int lengthInSeconds, int numberOfLikes, int numberOfShares, String backgroundSong) {
        this.userId = userId;
        this.lengthInSeconds = lengthInSeconds;
        this.numberOfLikes = numberOfLikes;
        this.numberOfShares = numberOfShares;
        this.backgroundSong = backgroundSong;
    }

    public void setUserId(long userId) {
        if(userId <= 0){
            System.out.println("Invalid user ID");
        }
        else{
            this.userId = userId;
            System.out.println("User ID set to " + userId);
        }
    }

    public void setLengthInSeconds(int lengthInSeconds) {
        if(lengthInSeconds <= 0){
            System.out.println("Invalid length in seconds");
        }
        else{
            this.lengthInSeconds = lengthInSeconds;
            System.out.println("Length in seconds set to " + lengthInSeconds);
        }
    }

    public void setNumberOfLikes(int numberOfLikes) {
        if(numberOfLikes <= 0){
            System.out.println("Invalid number of likes");
        }
        else{
            this.numberOfLikes = numberOfLikes;
            System.out.println("Number of likes set to " + numberOfLikes);
        }
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public void setBackgroundSong(String backgroundSong) {
        if(backgroundSong == null){
            System.out.println("Invalid background song");
        }
        else{
            this.backgroundSong = backgroundSong;
            System.out.println("Background song set to " + backgroundSong);
        }
    }

    public long getUserId() {
        return userId;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public String getBackgroundSong() {
        return backgroundSong;
    }
}


