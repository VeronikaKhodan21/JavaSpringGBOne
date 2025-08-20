
import com.google.common.base.Joiner;
import com.google.gson.Gson;


public class Main {
    public static void main(String[] args) {
        String[] words = {"Hello", "World"};
        String message = Joiner.on(", ").join(words);
        System.out.println(message);

        System.out.println("---------------------------------------------------");

        Person nill = new Person("Nill", "Hup", 12);
        Person lara = new Person("Lara", "Gutt", 34);
        // Печать персонажей
        System.out.println(nill.hashCode() + " " + nill.toString());
        System.out.println(lara.hashCode() + " " + lara.toString());

        System.out.println("\n---------------------------------------------------");
        System.out.println("Сomparing people");
        // Сравнение персонажей
        System.out.println(lara.getFirstName() + " and " + nill.getFirstName() + SimilarOrNot(lara, nill));


        System.out.println("\n---------------------------------------------------");
        System.out.println("Unpacked from JSON");
        Gson gson = new Gson();

        String json1 = gson.toJson(lara);
        Person read1 = gson.fromJson(json1, Person.class);
        System.out.println(read1.toString());


        String json3 = gson.toJson(nill);
        Person read3 = gson.fromJson(json3, Person.class);
        System.out.println(read3.toString());
    }

    private static String SimilarOrNot(Person perO, Person perT) {
        boolean res = perO.equals(perT);
        if (res == true) {
            return " are the same";

        } else {
            return " are different";
        }
    }
}