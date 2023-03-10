import java.util.ArrayList;


public class Song {

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    private String title;

    private String artist;

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    private ArrayList<String>Listener = new ArrayList<>();

    public int howMany(ArrayList<String>Name){
        int newListener = 0;
        int i;
        for(String n : Name){
            if(Listener.contains(n.toLowerCase())){
                continue;
            }
            else{
                Listener.add(n.toLowerCase());
                newListener+=1;
            }

        }
        return newListener;

    }


}
