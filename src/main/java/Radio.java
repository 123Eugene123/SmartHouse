public class Radio {
    public int currentStation;                                    // текущая радиостанция

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {       // Выбор радиостанции
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextRadioStation() {                             // Следующая радиостанция
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevRadioStation() {                             // Предыдущая радиостанция
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public int currentVolume;                                   // Текущая громкость

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {        // Выбор громкости
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {                              // Прибавление громкости
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }

    }

    public void reduceVolume() {                             // Понижение громкости
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}