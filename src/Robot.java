/**
 * Created by valmach on 04/03/2017.
 */


public class Robot {

    private int id;

        public class Brain {
            public void think() {
                System.out.println("Robot " + id + " is thinking. ");
            }
        }

        public static class Battery {
            public void charge(){
                System.out.println("Battery charging ... ");
            }
        }

        public Robot(int id) {
            this.id = id;
        }
        public void start () {
            System.out.println("Starting robot " + id);

            Brain brain = new Brain();
            brain.think();

            final String name = "Cecile";
           class Temp {
               public void doSomething(){
                   System.out.println("ID is: " + id);
                   System.out.println("My name is " + name);
                   //you can put a class inside a method

               }


           }
        Temp temp = new Temp() ;
            temp.doSomething();
        }
    }
