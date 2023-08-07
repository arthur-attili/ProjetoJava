package futebol;

import java.util.Scanner;

public class GettersSetters {
    public static void main(String[] args) {
        String time;
        Futebol torcida = new Futebol();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para qual time você torce?");
        time = scanner.nextLine();

        torcida.setTime(time);
        torcida.mostraTime();

        scanner.close();
    }
}
