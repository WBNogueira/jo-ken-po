import java.util.Scanner;

public class Main {
    
    public static JoKenPo startGame() {
        System.out.println("******* Jo-Ken-Po *******\n");
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String playerName = scan.next().toUpperCase();

        Player user = new Player(playerName);
        Player IA = new Player("IA");

        System.out.println(playerName + " informe quantos rounds você deseja jogar: ");
        int rounds = scan.nextInt();

        return new JoKenPo(user, IA, rounds);

    }
    
    public static void main(String[] args) {
        JoKenPo joKenPo = startGame();
        joKenPo.toPlay();
        joKenPo.showFinalResult();

    }
}