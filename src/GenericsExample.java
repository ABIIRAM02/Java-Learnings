public class GenericsExample {

    public static void main(String[] arg){

        GenericUser<Integer> user1 = new GenericUser<>(007, 24);
        GenericUser<String> user2 = new GenericUser<>("Bond", "TwentyFour");

        user1.createUser();
        user2.createUser();

    }
}
