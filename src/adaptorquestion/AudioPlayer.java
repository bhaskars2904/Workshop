package adaptorquestion;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String mediaType, String filename) {
        if(mediaType.equalsIgnoreCase("mp3")){
            System.out.println("playing mp3 file "+filename);
        }else{
            System.out.println("invalid type");
        }
    }
}
