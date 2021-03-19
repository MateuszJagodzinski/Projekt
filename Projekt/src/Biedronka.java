package Projekt;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Biedronka {
    public static void main(String[] args) {

        List<String> options = List.of("Nabiał", "Napoje", "Mięso", "Pieczywo", "Owoce", "Warzywa", "Stan koszyka", "Usuń produkt", "Opróżnij koszyk", "Idź do kasy", "Wyjście");
        String[] Nabial = {"Mleko", "Ser", "Jogurt", "Twaróg", "Jaja"};
        double[] Nabial_value = {3.99, 5.99, 2.99, 3.49, 7.99};
        String[] Napoje = {"Coca-cola", "Fanta", "Woda", "Sprite", "Sok"};
        double[] Napoje_value = {6.49, 4.99, 1.49, 3.99, 2.99};
        String[] Mieso = {"Wołowina", "Wieprzowina", "Kurczak", "Ryba", "Owoce morza"};
        double[] Mieso_value = {34.99, 29.99, 24.99, 27.99, 49.99};
        String[] Pieczywo = {"Chleb", "Bułki", "Drożdzówka", "Pączek", "Bagietka"};
        double[] Pieczywo_value = {2.49, 0.49, 2.49, 0.99, 1.99};
        String[] Owoce = {"Gruszka", "Banan", "Jabłko", "Pomarańcza", "Ananas"};
        double[] Owoce_value = {3.49, 4.99, 3.49, 4.99, 6.99};
        String[] Warzywa = {"Ziemniaki", "Ogórek", "Cebula", "Marchewka", "Pomidor"};
        double[] Warzywa_value = {3.99, 3.49, 2.49, 2.99, 4.99};

        String[] basket = new String[10];
        Scanner scanner = new Scanner(System.in);

        double[] basket_value = new double[10];
        double kasa_value = 0;
        double wallet = 0;
        double reszta;

        int Choice;
        int amount_basket = 0;
        boolean exit = true;
        boolean exit1 = true;
        boolean exit2 = true;
        System.out.println();
        System.out.println("Witamy w sklepie Biedronka! Twój koszyk może zmieścić 10 produktów.");
        System.out.println();
        System.out.print("Podaj stan portfela: ");
        do {
            try {
                wallet = scanner.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Podałeś złe dane!");
                System.exit(0);
            }
            if (wallet > 0)
            {
                System.out.println();
                System.out.println("Twój stan portfela to: " + wallet + " zł");
                System.out.println();
                exit2 = false;
            } else {
                System.out.print("Podałeś złą wartość Twojego portfela! Podaj stan portfela: ");
            }
        } while (exit2);
        do {
            try {
                System.out.println("Wybierz czynność lub kategorię: ");
                for (int i = 0; i < options.size(); i++) {
                    System.out.println("[" + i + "] " + options.get(i));
                    if (i == 5) {
                        System.out.println();
                    }
                }
                int userInput = scanner.nextInt();
                switch (userInput) {
                    case 0:
                        System.out.println("\n Wybierz produkt: ");
                        for (int j = 0; j < Nabial.length; j++) {
                            System.out.print("[" + j + "] = " + Nabial[j]);
                            System.out.println(" - " + Nabial_value[j] + " zł");
                        }
                        Choice = scanner.nextInt();
                        amount_basket++;
                        basket[amount_basket] = Nabial[Choice];
                        basket_value[amount_basket - 1] = Nabial_value[Choice];
                        System.out.println("Wybrałeś: " + basket[amount_basket]);
                        System.out.println();
                        kasa_value = kasa_value + Nabial_value[Choice];
                        System.out.println();
                        System.out.println("**********************************");
                        System.out.println();
                        System.out.println();
                        break;
                    case 1:
                        System.out.println();
                        System.out.println("**********************************");
                        System.out.println();
                        System.out.println("\n Wybierz produkt: ");
                        for (int j = 0; j < Napoje.length; j++) {
                            System.out.print("[" + j + "] = " + Napoje[j]);
                            System.out.println(" - " + Napoje_value[j] + " zł");
                        }
                        Choice = scanner.nextInt();
                        amount_basket++;
                        basket[amount_basket] = Napoje[Choice];
                        basket_value[amount_basket - 1] = Napoje_value[Choice];
                        System.out.println("Wybrałeś: " + basket[amount_basket]);
                        System.out.println();
                        kasa_value = kasa_value + Napoje_value[Choice];
                        System.out.println();
                        System.out.println("**********************************");
                        System.out.println();
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("\n Wybierz produkt: ");
                        for (int j = 0; j < Mieso.length; j++) {
                            System.out.print("[" + j + "] = " + Mieso[j]);
                            System.out.println(" - " + Mieso_value[j] + " zł");
                        }
                        Choice = scanner.nextInt();
                        amount_basket++;
                        basket[amount_basket] = Mieso[Choice];
                        basket_value[amount_basket - 1] = Mieso_value[Choice];
                        System.out.println("Wybrałeś: " + basket[amount_basket]);
                        System.out.println();
                        kasa_value = kasa_value + Mieso_value[Choice];
                        System.out.println();
                        System.out.println("**********************************");
                        System.out.println();
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("\n Wybierz produkt: ");
                        for (int j = 0; j < Pieczywo.length; j++) {
                            System.out.print("[" + j + "] = " + Pieczywo[j]);
                            System.out.println(" - " + Pieczywo_value[j] + " zł");
                        }
                        Choice = scanner.nextInt();
                        amount_basket++;
                        basket[amount_basket] = Pieczywo[Choice];
                        basket_value[amount_basket - 1] = Pieczywo_value[Choice];
                        System.out.println("Wybrałeś: " + basket[amount_basket]);
                        System.out.println();
                        kasa_value = kasa_value + Pieczywo_value[Choice];
                        System.out.println();
                        System.out.println("**********************************");
                        System.out.println();
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("\n Wybierz produkt: ");
                        for (int j = 0; j < Owoce.length; j++) {
                            System.out.print("[" + j + "] = " + Owoce[j]);
                            System.out.println(" - " + Owoce_value[j] + " zł");
                        }
                        Choice = scanner.nextInt();
                        amount_basket++;
                        basket[amount_basket] = Owoce[Choice];
                        basket_value[amount_basket - 1] = Owoce_value[Choice];
                        System.out.println("Wybrałeś: " + basket[amount_basket]);
                        System.out.println();
                        kasa_value = kasa_value + Owoce_value[Choice];
                        System.out.println();
                        System.out.println("**********************************");
                        System.out.println();
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("\n Wybierz produkt: ");
                        for (int j = 0; j < Warzywa.length; j++) {
                            System.out.print("[" + j + "] = " + Warzywa[j]);
                            System.out.println(" - " + Warzywa_value[j] + " zł");
                        }
                        Choice = scanner.nextInt();
                        amount_basket++;
                        basket[amount_basket] = Warzywa[Choice];
                        basket_value[amount_basket - 1] = Warzywa_value[Choice];
                        System.out.println("Wybrałeś: " + basket[amount_basket]);
                        System.out.println();
                        kasa_value = kasa_value + Warzywa_value[Choice];
                        System.out.println();
                        System.out.println("**********************************");
                        System.out.println();
                        System.out.println();
                        break;
                    case 6:
                        if (amount_basket > 0) {
                            System.out.print("\nTwój stan koszyka: ");

                            for (int j = 0; j < amount_basket; j++) {
                                System.out.println();
                                System.out.print(j+1 + ". ");
                                System.out.print(basket[j + 1]);
                                System.out.print(" - " + basket_value[j] + " zł");
                            }
                            System.out.println();
                            System.out.println();
                        } else {
                            System.out.println("Twój koszyk jest pusty!");
                            System.out.println();
                        }
                        break;
                    case 7:
                        if(amount_basket > 0)
                        {
                            System.out.println("Wybierz z listy, który produkt mam usunąć:");
                            for (int j = 0; j < amount_basket; j++) {
                                System.out.println();
                                System.out.print(j+1 + ". ");
                                System.out.print(basket[j + 1]);
                                System.out.print(" - " + basket_value[j] + " zł");
                            }
                            int amount_basket_value = basket_value.length;
                            System.out.println();
                            do {
                                Choice = scanner.nextInt();
                                if (Choice > 0 && Choice <= amount_basket)
                                {
                                    exit1 = false;
                                } else {
                                    System.out.println("Podałeś złą wartość!");
                                }
                            } while (exit1);
                            System.out.println("Poprawnie usunąłeś " + basket[Choice] + " z koszyka!");
                            kasa_value = kasa_value - basket_value[Choice-1];
                            for(int j = Choice; j < amount_basket + 1 ; j++){
                                basket[j] = basket[j+1];
                            }
                            basket[basket.length - 1] = null;
                            amount_basket -= 1;

                            for(int j = Choice-1; j < amount_basket_value - 1 ; j++){
                                basket_value[j] = basket_value[j+1];
                            }
                            basket_value[basket_value.length - 1] = 0;
                            System.out.println();
                        } else {
                            System.out.println("Twój koszyk jest pusty!");
                            System.out.println( );
                        }
                        break;
                    case 8:
                        if (amount_basket > 0) {
                            for (int j = 0; j < amount_basket + 1; j++) {
                                basket[j] = null;
                            }
                            amount_basket = 0;
                            System.out.println("Opróżniam koszyk!");
                        } else {
                            System.out.println("Twój koszyk jest pusty!");
                            System.out.println( );
                        }
                        break;
                    case 9:
                        if (amount_basket > 0) {
                            System.out.print("Do zapłaty: ");
                            System.out.format("%.2f", kasa_value);
                            System.out.println(" zł.");
                            if (wallet >= kasa_value) {
                                System.out.println();
                                System.out.println("Pomyślnie zapłaciłeś za zakupy.");
                                reszta = wallet-kasa_value;
                                System.out.println("Twoja reszta to: " + reszta + " zł");
                                System.out.println();
                                System.out.println("Zapraszamy ponownie!");
                                System.exit(0);
                            } else {
                                System.out.println("Nie masz tyle pieniędzy!");
                            }
                        } else {
                            System.out.println("Nie masz nic w koszyku!");
                        }
                        break;
                    case 10:
                        System.out.println("Zapraszamy ponownie!");
                        exit = false;
                        break;
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Podałeś złe dane!");
                scanner.next();
            } catch (ArrayIndexOutOfBoundsException ArrayIndexOutOfBoundsException) {
                System.out.println("Nie ma takiego produktu lub masz zapełniony cały koszyk!");
                System.out.println( );
                amount_basket--;
            }
        } while (exit);
    }
}