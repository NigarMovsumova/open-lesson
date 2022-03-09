import java.util.HashMap;
import java.util.Map;

public class GenericsDemoClass<K, V> {

    Map<K, V> map = new HashMap<>();

    private void putVal(K key, V val) {
        map.put(key, val);
    }

    public static void main(String[] args) {
        GenericsDemoClass<Integer, String> genericsDemoClass = new GenericsDemoClass<>();
        genericsDemoClass.putVal(5, "5");
    }

}
