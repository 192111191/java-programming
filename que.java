import java.util.Queue;
import java.util.PriorityQueue;
public class que {
    public static void main(String[] args){
        Queue<String> H= new PriorityQueue<>();
        H.add("abc");
        H.add("cde");
        H.add("def");
        System.out.println("values added" + H);
        H.remove();
        System.out.println("after removing values" + H);
    }
}
