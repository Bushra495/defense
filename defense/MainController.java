package defense;

import java.util.ArrayList;

public class MainController {

    private ArrayList<Observers> observerList;

    private boolean checkAreaCleared;
    private int strength;
    private DefenseSystem defenseSystem;

    MainController() {
        observerList = new ArrayList<>();
    }

    public void addObservers(Observers object) {
        observerList.add(object);
    }

    public void addDefenseSystem(DefenseSystem defenseSystem) {
        this.defenseSystem = defenseSystem;
    }

    public void setChkArea(boolean checkAreaCleared) {
        if (this.checkAreaCleared != checkAreaCleared) {
            this.checkAreaCleared = checkAreaCleared;
            for (Observers ob : observerList) {
                ob.updateCheckAreaCleared(checkAreaCleared);
            }
        }
    }

    public void setStrength(int strength) {
        this.strength = strength;
        for (Observers ob : observerList) {
            ob.updateStrengthButtons(strength);
        }
    }

    public void setText(String text) {
        for (Observers ob : observerList) {
            ob.updateText("Defense System : " + text + " \n");
        }
    }

    public void setTextIndex(int index, boolean selected, String text) {
        if (index == 1 && selected == true) {
            observerList.get(index - 1).updateText("Defense System : " + text + " \n");
        } else if (index == 2 && selected == true) {
            observerList.get(index - 1).updateText("Defense System : " + text + " \n");
        } else if (index == 3 && selected == true) {
            observerList.get(index - 1).updateText("Defense System : " + text + " \n");
        } else {
            setText(text);
        }
    }

    public void CollectInfo(int index) {
        switch (index) {
            case 1:
                defenseSystem.setCount(observerList.get(index - 1).updateSoldiers(), observerList.get(index - 1).updateAmmo());
                break;
            case 2:
                defenseSystem.setCount(observerList.get(index - 1).updateSoldiers(), observerList.get(index - 1).updateAmmo());
                break;
            case 3:
                defenseSystem.setCount(observerList.get(index - 1).updateSoldiers(), observerList.get(index - 1).updateAmmo());
                break;
            default:
                defenseSystem.setCount(0, 0);
        }
    }

    public void setReceivedMsg(String title, String msg) {
        defenseSystem.SetMessage(title, msg);
    }

    public ArrayList getList() {
        return observerList;
    }
}
