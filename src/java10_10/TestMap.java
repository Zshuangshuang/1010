package java10_10;

import java.util.HashMap;
import java.util.Map;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-10
 * Time:19:19
 **/
public class TestMap {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        System.out.println(map.size());
        map.put("鱼鱼","庄周");
        map.put("奶妈","蔡文姬");
        map.put("猴子","孙悟空");
        map.put("妲己","小妖精");
        System.out.println(map.get("妲己"));
        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println (entry.getKey()+":" +entry.getValue());
        }
    }
}
