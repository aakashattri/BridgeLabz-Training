

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class GymMember {
    String name;
    LocalDate expiryDate;

    GymMember(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return name + " | Expiry: " + expiryDate;
    }
}

public class ExpiringMembership {
    public static void main(String[] args) {

        List<GymMember> members = Arrays.asList(
                new GymMember("Anurag", LocalDate.now().plusDays(10)),
                new GymMember("Aakash", LocalDate.now().plusDays(40)),
                new GymMember("Aditya", LocalDate.now().plusDays(25)),
                new GymMember("Prashant", LocalDate.now().plusDays(5)),
                new GymMember("Rohan", LocalDate.now().plusDays(60))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<GymMember> expiringSoon =
                members.stream()
                        .filter(m -> !m.getExpiryDate().isBefore(today)
                                && m.getExpiryDate().isBefore(next30Days))
                        .collect(Collectors.toList());

        expiringSoon.forEach(System.out::println);
    }
}
