import rs.itbootcamp.dao.*;
import rs.itbootcamp.model.FoodModel;
import rs.itbootcamp.model.FridgeModel;
import rs.itbootcamp.model.MealModel;
import rs.itbootcamp.model.UserModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main2 {

    static FoodDao fd = new FoodDaoSQL();
    static FridgeDao fridge = new FridgeDaoSQL();
    static MealDao md = new MealDaoSQL();
    static int fridgeId = 1;

    private static void addFoodToFridge(Scanner sc) {
        List<FoodModel> foodList = fd.getAllFood();

        int choice = -1;

        while (choice != 0) {
            for (int i = 0; i < foodList.size(); i++)
                System.out.println((i + 1) + ". " + foodList.get(i).getFood_name());
            System.out.println("0. Back");

            choice = sc.nextInt();

            if (choice > 0 && choice <= foodList.size()) {
                System.out.println("How much: (in grams)");
                double mass = sc.nextDouble();
                fd.addToFridge(fridgeId, foodList.get(choice - 1).getFood_id(), mass);
                System.out.println("++");
            }
        }
    }

    private static void removeFoodFromFridge(Scanner sc) {
        int choice = -1;

        while (choice != 0) {
            List<FoodModel> foodList = fd.getAllFood();
            for (int i = 0; i < foodList.size(); i++)
                System.out.println((i + 1) + ". " + foodList.get(i).getFood_name());
            System.out.println("0. Back");

            choice = sc.nextInt();

            if (choice > 0 && choice <= foodList.size()) {
                fd.delete(foodList.get(choice - 1).getFood_id());
                System.out.println("++");
            }
        }
    }

    private static void lookInFridge(Scanner sc) {
        List<FoodModel> foodList = fd.getAllFood();

        int choice = -1;

        while (choice != 0) {
            for (int i = 0; i < foodList.size(); i++)
                System.out.println((i + 1) + ". " + foodList.get(i).getFood_name());
            System.out.println("0. Back");

            choice = sc.nextInt();

            if (choice > 0 && choice <= foodList.size())
                System.out.println(foodList.get(choice - 1));
        }
    }

    private static void fridgeMenu(Scanner sc) {
        int choice = 0;

        do {
            System.out.println("Main menu:");
            System.out.println("---------------");
            System.out.println("1. Add food");
            System.out.println("2. Remove food");
            System.out.println("3. Look in");
            System.out.println("4. Create meal");
            System.out.println("0. Back");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addFoodToFridge(sc);
                case 2 -> removeFoodFromFridge(sc);
                case 3 -> lookInFridge(sc);
                case 4 -> System.out.println("Create meal");
                case 0 -> System.out.println();
                default -> System.out.println("Invalid option");
            }
        }
        while (choice != 0);
    }

    private static void searchMeals(Scanner sc) {
        int choice;

        do {
            System.out.println("Search meals:");
            System.out.println("1. All meals");
            System.out.println("2. Search by name");
            System.out.println("0. Back");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Items per page?");
                    int items = sc.nextInt();
                    searchByPages(md.getAllMealNames(), items, sc);
                }
                case 2 -> {
                    System.out.println("Enter meal name");
                    sc.skip("[\r\n]+");
                    String s = sc.nextLine();
                    System.out.println("Items per page?");
                    int items = sc.nextInt();
                    searchByPages(md.getMealNames(s), items, sc);
                }
                case 0 -> System.out.println();
                default -> System.out.println("Invalid option");
            }
        }
        while (choice != 0);
    }

    private static void printThePage(List<String> list, int itemsPerPage, int currentPage){

        double poslednjiElement = list.size()*2;
        if (itemsPerPage*currentPage > poslednjiElement) currentPage=1;

        for (int i = itemsPerPage * (currentPage-1); i < itemsPerPage*currentPage; i++) { // i = pocetni element na strani -> poslednji element na strani
            if (i >= list.size()) break;

            System.out.println(i + 1 + ". " +list.get(i));

        }

        if (list.size() <= 0) {
            System.out.println("Nema podataka!");

        }
        else{
            System.out.println();
            System.out.println("-exclude s -> [Remove everything that contains specified String]");
            System.out.println("-startsWith s -> [Show those that start with specified String]");

            if (itemsPerPage * currentPage < list.size()) System.out.println("n -> [Next Page]");
            if (currentPage > 1) System.out.println("p -> [Previous Page]");
            System.out.println("b -> [Back]");
        }


    }


    private static void searchByPages(List<String> list, int itemsPerPage, Scanner sc) {
        int page = 1;
        String s;

        do {
            if (list.size() <= 0)
                break;



            printThePage(list, itemsPerPage, page);

            s = sc.next();

            if (s.equals("n") && itemsPerPage * page < list.size()) page++;
            else if (s.equals("p") && page > 1) page--;
            else if (s.equals("-exclude")) {
                s = sc.next();
                list = exclude(list, s);

            } else if (s.equals("-startsWith")) {
                s = sc.next();
                list = startWith(list, s);
            }
        }while (!s.equals("b"));


    }

    public static List<String> exclude(List<String> list, String s) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toLowerCase().contains(s.toLowerCase())) {
                list.remove(list.get(i));
                i--;
            }
        }
        return list;
    }

    public static List<String> startWith(List<String> list, String s) {
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).toLowerCase().startsWith(s.toLowerCase())) {
                list.remove(list.get(i));
                i--;
            }
        }
        return list;
    }


    private static void mainMenu(Scanner sc) {
        int choice = 0;

        do {
            System.out.println("Main menu:");
            System.out.println("---------------");
            System.out.println("1. My Fridge");
            System.out.println("2. Search meal");
            System.out.println("3. All food");
            System.out.println("4. Add new food");
            System.out.println("0. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> fridgeMenu(sc);
                case 2 -> searchMeals(sc);
                case 3 -> System.out.println("All food");
                case 4 -> System.out.println("Add new food");
                case 0 -> System.out.println("Exiting...");
                default -> {
                    System.out.println("Invalid option");
                }
            }
        }
        while (choice != 0);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mainMenu(sc);
    }
}
