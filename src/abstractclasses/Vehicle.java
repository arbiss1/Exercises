package abstractclasses;

public class Vehicle extends Car {
    @Override
    public void ride() {
        System.out.println("I am riding");
    }
    @Override
    public void makeNoise(String name){
        System.out.println("make different noise");
    }

    @Override
    public String makeNoise(String name1, String name2){
        return name2;
    }
}
