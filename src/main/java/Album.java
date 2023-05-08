import java.io.Serializable;
public class Album implements Serializable {
    private int id;
    private String artist;
    private String recordTitle;
    private int released;
    private double sales;
    private String genre;

    public Album() {

    }

    public Album(int id, String artist, String recordTitle, int released, double sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.recordTitle = recordTitle;
        this.released = released;
        this.sales = sales;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRecordTitle() {
        return recordTitle;
    }

    public void setRecordTitle(String recordTitle) {
        this.recordTitle = recordTitle;
    }

    public int getReleased() {
        return released;
    }

    public void setReleased(int released) {
        this.released = released;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Album{ id=" + id +
                ", artist=" + artist +
                ", record title=" + recordTitle +
                ", release int=" + released +
                ", sales=" + sales +
                ", genre=" + genre +
                "}";
    }
}
