import abstractclasses.Vehicle;
import exceptions.CardCustomExceptions;
import inheritance.Circle;
import enums.Enums;
import inheritance.Shape;
import model.Person;
import model.PersonResponse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        //
        Circle circle = new Circle("color", "size");
        Shape shape = new Shape(new Circle("color", "shapeSize"));
        System.out.println(circle);
        System.out.println(shape);



        System.out.println(Enums.NGJYRA.getNgjyra());
        System.out.println(Enums.NGJYRA.name());
        System.out.println(Enums.PESHA.getPesha());


        Vehicle vehicle = new Vehicle();
        vehicle.makeNoise("name");
        vehicle.ride();
        int a = 2;
        try {
            if(a > 1){
                throw new CardCustomExceptions("Card Custom Exception");
            }
        } catch (CardCustomExceptions error){
            System.out.println(error.getMessage());
        }

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "name", 22));
        persons.add(new Person(2, "name2", 23));

        List<PersonResponse> response = persons.stream().map(person -> new PersonResponse(person.getName(), person.getAge())).toList();

        for (PersonResponse res : response) {
            System.out.println(res);
        }
    }
}