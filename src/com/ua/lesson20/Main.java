package src.com.ua.lesson20;

import src.com.ua.lesson20.service.UserService;

public class Main {
    public static void main(String[] args) {

        UserService user = new UserService();
        user.startTranslator();
    }
}
