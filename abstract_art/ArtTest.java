import java.util.ArrayList;

public class ArtTest{

    public static void main(String[] args){
        ArrayList<Art> museum= new ArrayList<Art>();
        Painting p1 = new Painting("oil");
        Painting p2 = new Painting("water");
        Painting p3 = new Painting("acylic");
        Sculpture s1 = new Sculpture("stone");
        Sculpture s2 = new Sculpture("clay");

        System.out.println(p1.painttype);
        System.out.println(p2);
        System.out.println(s1);
        System.out.println(s2.material);

        p1.viewArt();
    }
}