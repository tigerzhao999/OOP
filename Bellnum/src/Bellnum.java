import java.util.*;
import java.awt.*;
public class Bellnum {

    public static void main(String[] arg0){
        Next n = new Next();
        for (int i = 1; i < 10 ; i++) {
            n.getRows();
            System.out.println(n.bell);
        }
    }
}
