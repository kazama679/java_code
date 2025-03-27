package ss20.b3;

import java.util.List;
import java.util.Optional;

public class B3 {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Quý", "0987654321"),
                new User("Lan", null),
                new User("Mainh", "0933222111"),
                new User("Huyền", null)
        );
        users.forEach(User::printInfo);
    }
}
