package Assessment;

public class Album extends TestAlbum{

    private String name;
    private Song[] tracks;
    private String producer;
    private int releaseYear;

    public Album(String name, Song[] tracks, String producer, int releaseYear)
        {
            setName(name);
            setTracks(tracks);
            setProducer(producer);
            setReleaseYear(releaseYear);
        }

        public void setName(String name) {
        this.name = name;
        }

        public void setTracks(Song[] tracks) {
        this.tracks = tracks;
        }

        public void setProducer(String producer) {
        this.producer = producer;
        }

        public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
        }

        public String getName() {
        return name;
        }

        public Song[] getTracks() {
        return tracks;
        }

        public String getProducer() {
        return producer;
        }

        public int getReleaseYear() {
        return releaseYear;
        }

        public String toString() {
        return "Name: " + getName() + "\n\nTracks: " + getTracks() + "\n\nProducer: " + getProducer() + "\n\nRelease Year: " + getReleaseYear();
        }

     public getNumberOfTracks() {

         return ;
     }

     public getPlayingTime() {
        return;
     }

     public PlayTrack() {
         return ;
     }

     public shuffle() {
        return Math.random(Song[]);
     }
}
