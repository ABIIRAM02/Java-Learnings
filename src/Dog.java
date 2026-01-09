public class Dog extends Animals {
    boolean isCanBark;
    String name;
    String gender;

    Dog(String name, String gender){
        this.isCanBark = true;
        this.name = name;
        this.gender = gender;
    }

    void dogInfo(){
        System.out.println("Dogs can bark. Dogs are domestic animals");
    }
}
