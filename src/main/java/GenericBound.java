public class GenericBound <T extends Cat>{
    public static void main(String[] args) {
        GenericBound<Cat> genericBound = new GenericBound();
        GenericBound<WildCat> genericBound1 = new GenericBound<>();
    }
}
