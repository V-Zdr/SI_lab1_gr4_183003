
import java.util.List;

public class Canvas {
    List<Point> points = (List<Point>) new Point();
    public void srednaTocka(List<Point> p){
        int count=0;
        int x=0;
        int y=0;
        for(int i = 0; i < points.size(); ++i){
            x+= Integer.parseInt(String.valueOf(points.get(x)));
            y+= Integer.parseInt(String.valueOf(points.get(y)));
            count++;
        }
        System.out.println("X: " + (float)x/count + " Y: " + (float)y/count);
    }
}
