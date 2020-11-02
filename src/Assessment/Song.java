package Assessment;

public class Song extends TestAlbum{

    private int trackID;
    private int trackNumber;
    private String title;
    private String artist;
    private String genre;
    private int duration;
    private int releaseYear;

    public Song (int trackID, int trackNumber, String title, String artist, String genre, int duration, int releaseYear)
        {
            setTrackID(trackID);
            setTrackNumber(trackNumber);
            setTitle(title);
            setArtist(artist);
            setGenre(genre);
            setDuration(duration);
            setReleaseYear(releaseYear);
        }

        public void setTrackID(int trackID){
           this.trackID = trackID;
        }

        public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
        }

        public void setTitle(String title) {
        this.title = title;
        }

        public void setArtist(String artist) {
        this.artist = artist;
        }

        public void setGenre(String genre) {
        this.genre = genre;
        }

        public void setDuration(int duration) {
        this.duration = duration;
        }

        public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
        }

        public int getTrackID() {
        return trackID;
        }

        public int getTrackNumber() {
        return trackNumber;
        }

        public String  getTitle() {
        return title;
        }

        public String getArtist() {
        return artist;
        }

        public String getGenre() {
        return genre;
        }

        public int getDuration() {
        return duration;
        }

        public int getReleaseYear() {
        return releaseYear;
        }

        public String toString() {
        return "TrackID: " + getTrackID() + "\n\nTrackNumber: " + getTrackNumber() + "\n\nTitle: " + getTitle() + "\n\nArtist: " + getArtist() + "\n\nGenre: " + getGenre() + "\n\nDuration: " + getDuration() + "\n\nRelease Year: " + getReleaseYear();
        }
}
