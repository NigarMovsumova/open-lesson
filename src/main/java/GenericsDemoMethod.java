public class GenericsDemoMethod {

    public <K extends Number, V> void print(K key, V val) {
        System.out.println("key = " + key + " value = " + val);
    }

    public static void main(String[] args) {
        GenericsDemoMethod genericsDemoMethod = new GenericsDemoMethod();
        genericsDemoMethod.print(2.0, 5);
    }
}
