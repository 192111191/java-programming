import java.util.HashMap;
import java.util.Map;
public class map {
    public static void main(String[] args){
        Map<String,Integer> H= new HashMap<>();
        H.put("abc",45);
        H.put("cde",10);
        H.put("def",7);
        System.out.println("values added" + H);
        H.remove("abc",45);
        System.out.println("after removing values" + H);
    }
}