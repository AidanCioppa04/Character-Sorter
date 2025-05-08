import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Rateable {
    String name;
    //image???//
    HashSet<String> tags;

    public Rateable(String name){
        setName(name);
        tags=new HashSet<String>();
    }

    //adds a tag to the objects tag list//
    //0 - error
    //1 - tag added successfully
    //2 - object already had the tag
    //3 - 
    private void setTag(String tag){
        tag=tag.toLowerCase();
        tags.add(tag);
    }
    //returns list of tags in alphabetical order//
    public ArrayList<String> getTags(){
        ArrayList<String> toSortTags=new ArrayList<>();
        for(String tag:tags){
            toSortTags.add(tag);
        }
        //might want to make tags class
        //to make custom sorting
        toSortTags.sort(null);
        return toSortTags;
    }
    public String getName(){
        return name;
    }
    private void setName(String name){
        this.name=name;
    }
}
