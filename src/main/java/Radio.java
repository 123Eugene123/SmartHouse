public class Radio {
    private int numberOfRadioStation = 10;
    private int maxRadioStation = numberOfRadioStation - 1;
    private int minRadioStation = 0;
    private int currentStation;

    public Radio(int numberOfRadioStation) {
        this.maxRadioStation = numberOfRadioStation - 1;

    }

    public Radio() {

    }

    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxRadioStation) {
            return;
        }
        if (newCurrentStation < minRadioStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void nextRadioStation() {
        if (currentStation < maxRadioStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minRadioStation;
        }
    }

    public void prevRadioStation() {
        if (currentStation > minRadioStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxRadioStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}