import java.util.TreeSet;
public class sort {
    public static void main(String[] args){
        TreeSet<String> S = new TreeSet<>();
        S.add("abc");
        S.add("cde");
        S.add("def");
        System.out.println("values added" + S);
        S.remove("def");
        System.out.println("after removing values" + S);
    }
}

