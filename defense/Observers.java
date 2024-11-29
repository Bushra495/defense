/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defense;

/**
 *
 * @author User
 */
public interface Observers  {
    public void updateCheckAreaCleared(boolean checkAreaCleared);
    public void updateStrengthButtons(int strength);
    public void updateText(String text);
    public int updateSoldiers();
    public int updateAmmo();
}
