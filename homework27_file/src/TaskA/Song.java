package TaskA;

public class Song {
    private String name;
    private String singer;
    private String text;
    private String genre;

    public Song(String name, String singer, String text, String genre) {
        this.name = name;
        this.singer = singer;
        this.text = text;
        this.genre = genre;
    }

    @Override
   public String toString(){
     String message = getName() + "\n" + getSinger() + "\n" + getText() + "\n" + getGenre();
     return message;
    }
    public Song(String just_give_me_a_reason, String pink, String s) {
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
