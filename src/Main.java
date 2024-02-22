import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String command;
        System.out.println("ИГРА \"ЛАБИРИНТ\"\n");
        do {
            System.out.println("ВЫБИРАЙ\n");
            System.out.println("[1]-СТАРТ ИГРЫ" +"   " +"[2]-ОПЦИИ" +"   "+ "[3]-ПРАВИЛА ИГРЫ" +"   " + "[4]-О ПРОГРАММЕ" +"   " + "[5]-ВЫХОД");
            command = in.next();
            switch (command) {
                case "1":
                    startNewGame();
                    break;
                case "2":
                    options();
                    break;
                case "3":
                    rules();
                    break;
                case "4":
                    authors();
                    break;
                case "5":
                    break;
                default:
                    System.out.println("ВВЕДИТЕ ЦИФРУ 1 - 5");
                    break;

            }
        }
        while (!command.equals("5"));
        {
        }
    }

    private static void startNewGame() {
        StartNewGame game = new StartNewGame(6);
        //System.out.println("НАЧАЛА СЯ ИГРА");
    }


    private static void authors() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("README.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

    }

    private static void rules() {
        System.out.println("ТУТ У НАС ПРАВИЛА");
    }

    private static void options() {
        System.out.println("ТУТ У НАС НАСТРОЕЧКИ");
    }
}