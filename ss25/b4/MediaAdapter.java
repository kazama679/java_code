package ss25.b4;

public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String audioType) {
        advancedMediaPlayer = new AdvancedMediaPlayer();
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else {
            System.out.println("Lỗi");
        }
    }
}
