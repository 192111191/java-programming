import java.util.ArrayList;
import java.util.LinkedList;
        public class alist {
            public static void main(String[] args){
                ArrayList<String> A = new ArrayList<>();
                A.add("abc");
                A.add("cde");
                A.add("def");
                System.out.println("values added" + A);
                A.remove("def");
                System.out.println("after removing values" + A);
            }
        }

