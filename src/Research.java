public class Research {
    public static void main(String[] arg){
        Dog dog1 = new Dog("scooby", "Male");
        Dog dog2 = new Dog("gayu", "Female"); // dogs -> animals -> species

        dog1.dogInfo();
        System.out.println("Is dogs are living thing? : " + dog1.isLivingThings +"\nhow many sence does it have? : " + dog1.sence);

        System.out.println("Let's name our first " + dog1.gender + " dog: " + dog1.name);
        System.out.println("Let's name our second " + dog2.gender + " dog: " + dog2.name);
    }
}
