public class User {

    String userName;
    int age;
    int yearsOfExp;

    User(String name, int age, int exp){
        this.userName = name;
        this.age = age;
        this.yearsOfExp = exp;
    }

    void userBio(){
        System.out.println( userName + " is " + age + " years old. He has " + yearsOfExp + " years of experience");
    }
}
