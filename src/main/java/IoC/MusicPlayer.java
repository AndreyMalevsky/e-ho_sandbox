package IoC;

public class MusicPlayer {
    private Music ourMusic;
    /*  Сильная зависимость
       private ClassicalMusic classicalMusic = new ClassicalMusic();
       private RockMusic rockMusic = new RockMusic();
    */

    public MusicPlayer(Music ourMusic) {
        this.ourMusic = ourMusic;
    }

    public void playMusic() {
        ourMusic.playMusic();
    }
}

