public class Customer {
    public static void main(String[] arg){
        CarFactory car = new CarFactory("Porshe", "Black", 10000);

        car.setPrice(8900);

        System.out.println("Your booking of " + car.getModel() + " " + car.getColor() + " is set to the final price of " + car.getPrice());
    }
}
