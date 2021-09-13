package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    static List<User> getFakeUsersRandom() {
        return new ArrayList<>(FAKE_USERS_RANDOM);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://picsum.photos/200/300"),
            new User("002", "Paul", "https://picsum.photos/200/300"),
            new User("003", "Phil", "https://picsum.photos/200/300"),
            new User("004", "Guillaume", "https://picsum.photos/200/300"),
            new User("005", "Francis", "https://picsum.photos/200/300"),
            new User("006", "George", "https://picsum.photos/200/300"),
            new User("007", "Louis", "https://picsum.photos/200/300"),
            new User("008", "Mateo", "https://picsum.photos/200/300"),
            new User("009", "April", "https://picsum.photos/200/300"),
            new User("010", "Louise", "https://picsum.photos/200/300"),
            new User("011", "Elodie", "https://picsum.photos/200/300"),
            new User("012", "Helene", "https://picsum.photos/200/300"),
            new User("013", "Fanny", "https://picsum.photos/200/300"),
            new User("014", "Laura", "https://picsum.photos/200/300"),
            new User("015", "Gertrude", "https://picsum.photos/200/300"),
            new User("016", "Chloé", "https://picsum.photos/200/300"),
            new User("017", "April", "https://picsum.photos/200/300"),
            new User("018", "Marie", "https://picsum.photos/200/300"),
            new User("019", "Henri", "https://picsum.photos/200/300"),
            new User("020", "Rémi", "https://picsum.photos/200/300")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://picsum.photos/200/300"),
            new User("022", "Geoffrey", "https://picsum.photos/200/300"),
            new User("023", "Simon", "https://picsum.photos/200/300"),
            new User("024", "André", "https://picsum.photos/200/300"),
            new User("025", "Leopold", "https://picsum.photos/200/300")
    );
}
