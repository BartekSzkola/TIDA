import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String pin = generujPIN();
        String token = generujToken();

        System.out.println("Wygenerowany PIN: " + pin);
        System.out.println("Wygenerowany token: " + token);
    }


    public static String generujPIN() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Generowanie kodu PIN");
        System.out.println("Wybierz długość kodu PIN [4 lub 6]:");
        int PINdl = scan.nextInt();
        String pin = "";

        if(PINdl == 4) {
            System.out.println("Generowanie 4-cyfrowego kodu PIN:");
            int liczba = rand.nextInt(10000);
            return pin = String.format("%04d", liczba);
        }
        else if(PINdl == 6) {
            System.out.println("Generowanie 6-cyfrowego kodu PIN:");
            int liczba = rand.nextInt(1000000);
            return pin = String.format("%06d", liczba);

        } else {
            System.out.println("Podano nieprawidłową długość kodu PIN.");
            System.out.println("Proszę o ponowne uruchomienie programu.");
            System.exit(0);
            return null;
        }
    }

    public static String generujToken() {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Generowanie tokena");
        System.out.println("Wybierz długość tokena [12 lub 16]:");
        int TOKENdl = scan.nextInt();
        String a = "";

        if(TOKENdl == 12) {
            System.out.println("Generowanie tokenu:");
            int length = 12;
            String characters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

            char[] token = new char[length];
            for (int i = 0; i < length; i++) {
                token[i] = characters.charAt(rand.nextInt(characters.length()));
            }

            return new String(token);
        }
        else if(TOKENdl == 16) {
            System.out.println("Generowanie tokenu:");
            int length = 16;
            String characters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

            char[] token = new char[length];
            for (int i = 0; i < length; i++) {
                token[i] = characters.charAt(rand.nextInt(characters.length()));
            }
            return new String(token);
        } else {
            System.out.println("Podano nieprawidłową długość tokena.");
            System.out.println("Proszę o ponowne uruchomienie programu.");
            System.exit(0);
            return null;
        }
}
}
