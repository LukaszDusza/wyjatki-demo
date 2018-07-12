package pl.time4it;


import java.util.*;
import java.util.List;

public class Main {

    int abc = 5000; //do skomitowania

    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {

      //  userConsole();
    }

    public static void userConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj maks. 5 liczb");

        boolean flag = true;

        int counter = 0;

        while (flag) {
            flag = false;
            System.out.println("Dodać liczbę? T/N");
            String s = scanner.next();

            switch (s.toUpperCase()) {
                case "T":
                   //counter++;
                   flag = true;
                    System.out.println("Podaj " + numbers.size() + " liczbę");

                    try {
                        numbers.add(scanner.nextInt());

                    } catch (InputMismatchException e) {
                        System.err.println("Podaj liczbę zamiast litery!");
                        userConsole();

                    }
                    break;

                case "N":
                    if(numbers.size() > 0) {
                        flag = false;

                        try {
                            fiveNumbersTab(numbers.toArray());
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.err.println("podaj maksymalnie 5 liczb!");
                            userConsole();
                        } finally {
                            System.out.println("Sprzatam po zakończej pracy");
                            scanner.close();
                            numbers.clear();
                        }

                    } else {
                        System.out.println("Nie podales zadnych liczb. Program konczy prace.");
                    }
                    break;

                    default:
                        userConsole();
            }
        }
    }

    public static int[] fiveNumbersTab(Object[] objects) {

        int[] tab = new int[5];
        for (int i = 0; i < objects.length; i++) {
            tab[i] = (int)objects[i];
            System.out.println(tab[i] + "|");
        }

        return tab;
    }


}
