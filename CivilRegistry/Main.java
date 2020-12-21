package Stream.CivilRegistry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        RegistryOffice registryOffice = new RegistryOffice(people);

        registryOffice.addPersonWithChild("bao", "caio", 30, "ASD", "via a", Arrays.asList("susano", "amaterasu"));
        registryOffice.addPersonWithChild("cosa", "tua", 20, "asdfgh", "via b", Arrays.asList("toper", "doc"));
        registryOffice.addPersonWithChild("viva", "mai", 42, "sdfgh", "via c", Arrays.asList("lacosa", "rosa"));
        registryOffice.addPerson("mao", "tze", 60, "qwerty", "via b");
        registryOffice.addPerson("barba", "lunga", 55, "stra", "via a");

        registryOffice.removePersonById("sdfgh");
        System.out.println(registryOffice.PersonByName("m"));
        System.out.println(registryOffice.Top3Oldest());
        System.out.println(registryOffice.AddressByName("via a"));
        System.out.println(registryOffice.getChildren("viva"));
    }
}
