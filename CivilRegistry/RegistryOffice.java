package Stream.CivilRegistry;

import java.util.*;
import java.util.stream.Collectors;

public class RegistryOffice {

    List<Person> people;

    public RegistryOffice(List<Person> people) {
        this.people = people;
    }

    public void addPerson(String name, String surname, int age, String id, String address){
        people.add(new Person(name, surname, age, id, address));
    }
    public void addPersonWithChild(String name, String surname, int age, String id, String address, List<String> children){
        people.add(new Person(name, surname, age, id, address, children));
    }

    public void removePersonById(String id){
        //persone.removeIf(p -> p.getCodFiscale().equals(id));
        /*
        Optional<Persona> p = persone.stream()
                .filter(s -> s.getCodFiscale().equals(id))
                .findFirst();
        p.ifPresent(persona -> persone.remove(persona));
        */
        people = people.stream().
                filter((s -> !s.getId().equals(id)))
                .collect(Collectors.toList());
    }

    public List<Person> PersonByName(String name){
        /*
        List<Persona> personeNomi = persone;
        for(Persona p : persone){
            if(p.getNome().equals(name) || p.getNome().charAt(0)==name.charAt(0)){
                personeNomi.add(p);
            }
        }
        return personeNomi;
        */
        return people.stream()
                .filter(s -> s.getName().equals(name) || s.getName().charAt(0)==name.charAt(0))
                .collect(Collectors.toList());
    }

    public List<Person> Top3Oldest()
    {
        /*
        int[] personaEta = new int[3];
        for(Persona p : persone){
            for(int i=0; i<3; i++){
                if(p.getEta()>personaEta[i]){
                    personaEta[i]=p.getEta();
                }
            }
        }
        return personaEta;
        */
        /*
        return persone.stream()
                .map(Persona::getEta)
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        */
        return people.stream()
                .sorted((o1, o2) -> o2.getAge()-o1.getAge())
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<String> AddressByName(String address){
        return people.stream()
                .filter(s -> s.getAddress().equals(address))
                .map(Person::getName)
                .collect(Collectors.toList());
    }

    public List<String> getChildren(String name){
        return people.stream()
                .filter(s -> s.getName().equals(name))
                .map(Person::getChild)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

}
