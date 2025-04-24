import java.util.Iterator;
import java.util.List;
public class BingeIterator implements Iterator<Episode>{
private Iterator<Episode> currentIterator;
private List<Season> seasons;
private int currentSeasonIndex=0;

public BingeIterator(List<Season> seasons){
this.seasons=seasons;
if(!seasons.isEmpty())this.currentIterator=seasons.get(0).iterator();
}

public boolean hasNext(){
while((currentIterator==null||!currentIterator.hasNext())&&currentSeasonIndex<seasons.size()-1){
currentSeasonIndex++;
currentIterator=seasons.get(currentSeasonIndex).iterator();
}
return currentIterator!=null&&currentIterator.hasNext();
}
public Episode next(){return currentIterator.next();}
}