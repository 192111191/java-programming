import java.util.LinkedList;
public class list {
    public static void main(String[] args){
        LinkedList<String> L = new LinkedList<>();
        L.add("abc");
        L.add("cde");
        L.add("def");
        System.out.println("values added" + L);
        L.remove("def");
        System.out.println("after removing values" + L);
    }
}