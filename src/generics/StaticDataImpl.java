package generics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StaticDataImpl<K,V> implements StaticData<K,V> {
    @Override
    public String getName() {
        return "Siddharth";
    }

    @Override
    public Map<K,V> getMappings() {
        Map<String, TreeMap<String,String>> map = new HashMap<>();

        return (Map<K, V>) map;


    }



}
