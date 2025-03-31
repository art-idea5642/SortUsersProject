package org.example;


import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List <User> users = List.of(
                new User("Пользователь 1", 30),
                new User("Пользователь 2", 15),
                new User("Пользователь 24", 22),
                new User("Пользователь 4", 30),
                new User("Пользователь 6", 30),
                new User("Пользователь 1", 15),
                new User("Пользователь 10", 35),
                new User("Пользователь 1", 30),
                new User("Пользователь 12", 30),
                new User("Пользователь 1", 30)
        );
        System.out.println(sortUsers(users));
    }

    public static List <User> sortUsers (Collection <User> users) {
        return users.stream().distinct().sorted(Comparator.comparingInt(User::getAge).
                reversed().thenComparing(User::getName)).limit(5).collect(Collectors.toList());
    }

}