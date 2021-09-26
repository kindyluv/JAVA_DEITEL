package Mp3Project;

import java.util.ArrayList;

public class PlayList {

    private static ArrayList<Music> music ;
    private static Music musiz;

    public PlayList() {
        music = new ArrayList<>();
    }

    public static boolean addMusic() {
      return music.add(musiz);
    }

    public static boolean removeMusic() {
        return music.remove(musiz);
    }

    public static ArrayList<Music> music() {
        return music;
    }

    public int getSizeOfPlaylist() {
        return music.size();
    }

}
