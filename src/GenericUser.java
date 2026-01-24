
public class GenericUser<X> {
    X name;
    X age;

    GenericUser(X name, X age){
        this.name = name;
        this.age = age;
    }

    void createUser(){
        System.out.println("An user has been created, name: " + this.name + " age: " + this.age );
    }
}
