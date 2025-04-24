import java.util.Iterator;
public class SeasonIterator implements Iterator<Episode>{
private Season season;
private int index=0;
public SeasonIterator(Season season){
    this.season=season;}
public boolean hasNext(){
    return index<season.getEpisodes().size();}
public Episode next(){
    return season.getEpisodes().get(index++);}
}