import java.util.Vector;
public class vlist {
    public static void main(String[] args){
        Vector<String> V = new Vector<>();
        V.add("abc");
        V.add("cde");3
        V.add("def");
        System.out.println("values added" + V);
        V.remove("def");
        System.out.println("after removing values" + V);
    }
}
