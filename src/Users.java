public class Users {

    public static void main(String[] arg){
        User user1 = new User("Abiram",25,3);
        user1.userBio();

        User user2 = new User("Jaan",28,6);
        user2.userBio();

        User user3 = new User("Introvert ram", 24, 4){
            @Override
            void userBio(){
                System.out.println("Gotta go");
            }
        };

        user3.userBio();
    }

}
