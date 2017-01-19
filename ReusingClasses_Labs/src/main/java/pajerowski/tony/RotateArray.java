package pajerowski.tony;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by anthonypajerowski on 1/18/17.
 */
public class RotateArray extends ArrayList {

    public static void rotateArray(ArrayList list, int rotations) {
        for (int i = 0; i < rotations; i++) {
            list.add(list.get(0));
            list.remove(0);
        }
    }

//    public static void main(String[] args) {
//        ArrayList<Integer> inty = new ArrayList<Integer>();
//        for (int i = 1; i < 6; i++) {
//            inty.add(i);
//        }
//        rotateArray(inty, 2);
//        for (int i = 0; i < inty.size(); i++ ) {
//            System.out.println(inty.get(i));
//        }
//    }
}






