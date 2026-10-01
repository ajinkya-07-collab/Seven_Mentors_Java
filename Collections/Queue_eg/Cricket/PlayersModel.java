package Collections.Queue_eg.Cricket;

public class PlayersModel {

    private int playerId;
    private String playername;

    public PlayersModel(int playerId, String playername) {
        this.playerId = playerId;
        this.playername = playername;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    @Override
    public String toString() {
        return "[playerId=" + playerId + ", playername=" + playername + "]";
    }

}
