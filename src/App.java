/**
 * Created by valmach on 04/03/2017.
 */
public class App {
    public static void main(String[] args) {
        Robot robot = new Robot(7);
        robot.start();
       // Robot.Brain brain = robot.new Brain();
        //brain.think();

                //Robot.Brain is type

        Robot.Battery battery = new Robot.Battery();
        battery.charge();
    }
}
