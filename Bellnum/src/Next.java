import java.util.*;
import java.awt.*;
public class Next {
    ArrayList<Integer> bell = new ArrayList<Integer>();
    ArrayList<Integer> bell2 = new ArrayList<Integer>();
    public Next() {
        bell.add(1);
        System.out.println(bell);
    }
    public void getRows() {

        bell2.add(0, bell.get((bell.size()) - 1));
        for (int i = 1; i <= bell.size(); i++) {
            bell2.add(i, (bell2.get(i - 1) + bell.get(i - 1)));
        }


        ArrayList<Integer> temp = bell2;
        bell2 = bell;
        bell = temp;
        bell2.clear();

    }

}

