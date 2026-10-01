package Collections.Queue_eg.Cricket;

public class PlayerMain {

    public static void main(String[] args) {

        PlayerService service = new PlayerService();

        service.addPlayer(new PlayersModel(1, "Ruturaj Gaikwad"));
        service.addPlayer(new PlayersModel(2, "Faf du Plessis"));
        service.addPlayer(new PlayersModel(3, "Suresh Raina"));
        service.addPlayer(new PlayersModel(4, "Ambati Rayudu"));
        service.addPlayer(new PlayersModel(5, "MS Dhoni"));
        service.addPlayer(new PlayersModel(6, "Shane Watson"));
        service.addPlayer(new PlayersModel(7, "Ravindra Jadeja"));
        service.addPlayer(new PlayersModel(8, "Dwayne Bravo"));
        service.addPlayer(new PlayersModel(9, "Ravichandran Ashwin"));
        service.addPlayer(new PlayersModel(10, "Deepak Chahar"));
        service.addPlayer(new PlayersModel(11, "Imran Tahir"));

        service.allShow();

        service.nextPlayer();

        service.showRemaining();
    }

}
