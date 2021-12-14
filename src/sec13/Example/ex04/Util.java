package sec13.Example.ex04;

public class Util{
    //방법 1
    /*public static <K, V> V getValue(Pair<K, V> pair, K key) {
        if(pair.getKey().equals(key)) {
            return pair.getValue();
        } else {
            return null;
        }
    }*/

    //방법 2
    public static <P extends Pair<K, V>, K, V> V getValue(P pair, K key) {
        if(pair.getKey().equals(key)) {
            return pair.getValue();
        } else {
            return null;
        }
    }
}
