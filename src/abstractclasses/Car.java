package abstractclasses;

public abstract class Car {
    public abstract void ride();
    public void makeNoise(String name){
        System.out.println(name);
    }
    public String makeNoise(String name2, String name){
        return name2;
    }

}
