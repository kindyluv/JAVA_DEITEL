package Mp3Project;

public class Volume {
    private static int volume = 5;


    public static void increaseVolumeLevel() {
        boolean isHighestLevelPossible = volume <= 100;
        if (isHighestLevelPossible){
            volume += 5;
        } else {
            volume = 100;
        }
    }

    public static int getVolumeLevel() {
        return volume;
    }

    public static void decreaseVolumeLevel() {
        boolean isLowestLevelPossible = volume > 0;
        if (isLowestLevelPossible){
            volume -=5;
        }else {
            volume = 0;
        }
    }
}
