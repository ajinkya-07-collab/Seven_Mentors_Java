package Collections.Queue_eg.Cricket;

import java.util.ArrayDeque;
import java.util.Queue;

public class PlayerService {

    private Queue<PlayersModel> queue = new ArrayDeque<>();

    // add all players
    public void addPlayer(PlayersModel player) {
        queue.offer(player);
    }

    // show all players
    public void allShow() {
        System.out.println("\n----Team Playing 11---");
        for (PlayersModel players : queue) {
            System.out.println(players);
        }
    }

    // next player and out player one by one
    public void nextPlayer() {

        System.out.println("\n-----Match Starts!!-----");

        for (int i = 0; i < 3; i++) {
            System.out.println("=============================================");
            // player comes to bat

            System.out.println("Next Player to bat : " + queue.peek());

            // playerout

            System.out.println("Player Got Out : " + queue.poll());

            System.out.println("=============================================");
        }

    }

    // Remaing Players
    public void showRemaining() {

        System.out.println("=======Players Remaing to Bat======");
        for (PlayersModel player : queue) {
            System.out.println(player);
        }
    }

}
