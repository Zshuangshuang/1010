package java10_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-10
 * Time:18:57
 **/
public class TestCollection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        collection.add("我");
        collection.add("爱");
        collection.add("中国");
        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array));
        for (String s: collection) {
            System.out.print(s+"  ");
        }
    }
}
