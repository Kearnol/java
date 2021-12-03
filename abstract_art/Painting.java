import java.util.ArrayList;
public class Painting extends Art{
    String painttype;

    public Painting(String type){
        this.painttype = type;
        addArt(this);
    }

    @Override 
    public void viewArt(){
        System.out.println(this.museum);
    };
}