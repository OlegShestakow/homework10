public class Radio {

    private int currentNumberOfRadiostation;
    private int currentSoundVolume;
    private int maxStation;


    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationCount) {
        stationCount = 10;
        maxStation = stationCount - 1;
    }


    public void setCurrentNumberOfRadiostation(int newCurrentNumberOfRadiostation) {
        if (newCurrentNumberOfRadiostation < 0) {
            return;
        }

        if (newCurrentNumberOfRadiostation > maxStation) {
            return;
        }
        currentNumberOfRadiostation = newCurrentNumberOfRadiostation;
    }

    public int getCurrentNumberOfRadiostation() {

        return currentNumberOfRadiostation;
    }

    public void next() {
        if (currentNumberOfRadiostation != maxStation) {
            currentNumberOfRadiostation++;
            return;
        }
        currentNumberOfRadiostation = 0;
    }


    public void prev() {
        if (currentNumberOfRadiostation != 0) {
            currentNumberOfRadiostation--;
        } else{
            currentNumberOfRadiostation = maxStation;
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