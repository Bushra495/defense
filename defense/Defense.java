package defense;

public class Defense {

    public static void main(String[] args) {
        MainController mainController=new MainController();
        Helicopter helicopter = new Helicopter(mainController);
        Tank tank = new Tank(mainController);
        Submarine submarine = new Submarine(mainController);
        

        mainController.addObservers(helicopter);
        mainController.addObservers(tank);
        mainController.addObservers(submarine);
        
        
        tank.setVisible(true);
        submarine.setVisible(true);
        helicopter.setVisible(true);
        
        DefenseSystem defenseSystem=new DefenseSystem(mainController);
        defenseSystem.setVisible(true);
        
        mainController.addDefenseSystem(defenseSystem);
    }
}
