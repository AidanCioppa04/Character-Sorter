import java.util.HashSet;
import java.util.List;

public class Rateable {
    final String name;
    //image???//
    static HashSet<String> tags= new HashSet<>();

    public Rateable(String name){
        this.name=name;
    }

    //adds a tag to the objects tag list//
    //0 - error
    //1 - tag added successfully
    //2 - object already had the tag
    //3 - 
    private static void addTag(String tag){
        tags.add(tag);
    }
    public static String getName(){
        return this.name;
    }
}
