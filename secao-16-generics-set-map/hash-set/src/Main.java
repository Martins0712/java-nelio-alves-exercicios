import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        set.add("TV");

        System.out.println(set.contains("Notebook"));

        set.remove("Tablet");

        System.out.println(set);
        System.out.println(set.size());

        set.clear();

        System.out.println(set);
    }
}