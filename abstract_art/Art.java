import java.util.ArrayList;

public abstract class Art{
    protected String title;
    protected String author;
    protected String description;
    public static ArrayList<Art> museum = new ArrayList<Art>();

    public abstract void viewArt();

    public void addArt(Art art){
        museum.add(art);
    }
}