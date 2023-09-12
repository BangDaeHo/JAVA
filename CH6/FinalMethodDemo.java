package CH6;

class Chese{
    enum ChessPlayer{
        WHITE, BLACK
    }


    final ChessPlayer getFiPlayer(){
        return ChessPlayer.WHITE;
    }
}
class WorldChess extends Chese{
    //ChessPlayer getChessPlayer(){}
}

public class FinalMethodDemo {
    public static void main(String[] args){
        WorldChess w = new WorldChess();
        w.getFiPlayer();
    }
}
