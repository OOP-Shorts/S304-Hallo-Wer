import java.util.Scanner;

public class HalloWer {

    public static String readName() {
        Scanner console = new Scanner(System.in);
        System.out.print("Bitte gib deinen Namen ein: ");
        return console.nextLine();
    }

    public static void main(String[] args) {
        String name = readName();
        System.out.println("Hello " + name);
    }
}
