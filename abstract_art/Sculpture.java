import java.util.ArrayList;
public class Sculpture extends Art{
    String material;

    public Sculpture(String material){
        this.material = material;
        addArt(this);
    }

    @Override 
    public void viewArt(){
        System.out.println(this.museum);
    };
}