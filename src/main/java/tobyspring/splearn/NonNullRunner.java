package tobyspring.splearn;

import lombok.NonNull;

public class NonNullRunner {

    public static void main(String[] args) {
        String name = null;
        print(name);
    }

    static void print(@NonNull String name) {
        System.out.println(name);
    }
}
