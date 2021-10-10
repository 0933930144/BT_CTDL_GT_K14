
import java.util.ArrayList;

public class ctmh {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();       
        a.add("Khai");
        a.add("true");
        a.add(1);
        a.add(1,5);
        Integer x = (Integer)a.get(2);
        for (Object object : a) {
            System.out.println(object);
            
        }

    }
}
