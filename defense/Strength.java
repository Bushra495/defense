/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package defense;

/**
 *
 * @author User
 */
public enum Strength {
    LOW(10), MEDIUM(25), HIGH(50), STRONG(75), CLOSED(90);
    
    private int value;
    
    Strength(int value){
    this.value=value;
    }
    
    public int getValue(){
        return value;
    }
    
    public static Strength strengthForValue(int value){
        if (value <= 10) {
            return LOW;
        }else if (value <= 25) {
            return MEDIUM;
        }else if (value <= 50) {
            return HIGH;
        }else if (value <= 75) {
            return STRONG;
        }else if (value >75 ){
            return CLOSED;
        }
        return null;
    }
}
