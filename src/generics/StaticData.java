package generics;

import java.util.Map;

public interface StaticData<K,V> {

    String getName();

    Map<K,V> getMappings();
}
