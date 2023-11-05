package Lab5;

public class CD implements ToBeStored{
    private String artist;
    private String title;
    private int publishingYear;
    private double weight = 0.1; // CDs weigh 0.1 kg

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return artist + ": " + title + " (" + publishingYear + ")";
    }
}
