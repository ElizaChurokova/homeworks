package TaskB;

public class SongB {
    private String name;
    private String singer;
    private String text;
    private String genre;

    public SongB(String name, String singer, String text, String genre) {
        this.name = name;
        this.singer = singer;
        this.text = text;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
