package com.leanthelanguage.lambdaexpressions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class Main {


    public static void main(String[] strings) {

        List<PersonDto> personDtos = new ArrayList<>();

        persons().stream().map(p -> new PersonDto(p.getName())).filter(m->personDtos.add(m));

        printPerson(persons(), p -> p.getGender() == Person.Sex.MALE, Person::printPerson, Person::getName, System.out::println);

        System.out.println(personDtos.size());

    }


    private static class PersonDto {
        private String name;

        public PersonDto(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private static List<Person> persons() {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("adelin12", LocalDate.of(1939, 2, 12), Person.Sex.MALE, "mail@mail.com"));
        persons.add(new Person("adelin11", LocalDate.of(1949, 2, 22), Person.Sex.MALE, "mail@mail.com"));
        persons.add(new Person("adelin13", LocalDate.of(1979, 2, 12), Person.Sex.MALE, "mail@mail.com"));
        persons.add(new Person("adelin23", LocalDate.of(1988, 2, 22), Person.Sex.MALE, "mail@mail.com"));
        persons.add(new Person("adelin43", LocalDate.of(1999, 2, 22), Person.Sex.MALE, "mail@mail.com"));
        return persons;

    }


    private static void printPerson(List<Person> personList,
                                    Predicate<Person> age,
                                    Consumer<Person> personConsumer, Function<Person, String> function, Consumer<String> block) {
        for (Person p : personList) {
            if (age.test(p)) {
                String name = function.apply(p);
                block.accept(name);
            }
        }
    }


    interface CheckPerson<T> {
        boolean check(T t);
    }


}
