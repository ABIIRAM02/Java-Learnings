public class CarFactory {

    private final String model;
    private String color;
    private int price;

    CarFactory(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    int getPrice(){
        return this.price;
    }


    String setColor(String color){
       return this.color = color;
    }

    int setPrice(int price){
        return this.price = price;
    }
}
