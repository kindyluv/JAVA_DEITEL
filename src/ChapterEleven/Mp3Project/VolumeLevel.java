package ChapterEleven;

public class VolumeLevel {
    private static int level = 0;
   static Volume volume;

    public static void increaseLevel() {
        volume = Volume.INCREASE;
        boolean isHighestLevelPossible = level <= 100;
        if (isHighestLevelPossible){
            level += 5;
        } else {
            level = 100;
        }
    }

    public static void decreaseLevel() {
        volume = Volume.DECREASE;
        boolean isLowestLevelPossible = level >= 0;
        if (isLowestLevelPossible) {
            level -= 5;
        } else {
            level = 0;
        }
    }

    public static int getVolumeLevel() {
        return level;
    }
}
