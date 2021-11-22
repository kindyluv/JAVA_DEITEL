package Mp3Project;

public class Music {
    private String tractName;
    private int tractNumber;
    private double lengthInSeconds;

    public Music(String tractName, int tractNumber, double length) {
        this.tractName = tractName;
        this.tractNumber = tractNumber;
        this.lengthInSeconds = length;
    }

    public String getTractName() {
        return tractName;
    }

    public void setTractName(String tractName) {
        this.tractName = tractName;
    }

    public int getTractNumber() {
        return tractNumber;
    }

    public void setTractNumber(int tractNumber) {
        this.tractNumber = tractNumber;
    }

    public double getLength() {
        return lengthInSeconds;
    }

    public void setLength(double length) {
        this.lengthInSeconds = length;
    }
}
