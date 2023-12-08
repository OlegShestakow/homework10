public class Radio {

    private int currentStation;
    private int currentSoundVolume;
    private int maxStation;


    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;
    }


    public void setCurrentNumberOfRadiostation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }

        if (newCurrentStation > maxStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public int getCurrentNumberOfRadiostation() {

        return currentStation;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }


    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else{
            currentStation = maxStation;
        }

    }

    public int getCurrentSoundVolume() {

        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            return;
        }

        if (newCurrentSoundVolume > 100) {
            return;
        }

        currentSoundVolume = newCurrentSoundVolume;
    }

    public void increaseCurrentSoundVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume++;
        }
    }

    public void decreaseCurrentSoundVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        }
    }
}