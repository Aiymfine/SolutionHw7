import java.util.List;
import java.util.ArrayList;
public class Main{
public static void main(String[] args){
Episode e1=new Episode("Episode 1",3600);
Episode e2=new Episode("Episode 2",3500);
Episode e3=new Episode("Episode 3",3700);
Season season1=new Season();
season1.addEpisode(e1);
season1.addEpisode(e2);
season1.addEpisode(e3);


List<Season> series=new ArrayList<>();
series.add(season1);
BingeIterator bingeIterator=new BingeIterator(series);
while(bingeIterator.hasNext()){
Episode episode=bingeIterator.next();
System.out.println(episode.getTitle());
}
}
}
