import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Season implements Iterable<Episode>{
private List<Episode> episodes=new ArrayList<>();
public void addEpisode(Episode e){
    episodes.add(e);}
public List<Episode> getEpisodes(){
    return episodes;}
public Iterator<Episode> iterator(){
    return new SeasonIterator(this);}
}
