package IoC;

public class Main {
    public static void main(String[] args) {
        Music music1 = new RockMusic();
        MusicPlayer player1 = new MusicPlayer(music1);
        player1.playMusic();
    }

}

