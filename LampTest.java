/**
 * Java OOP to create Instance and Main class in a single file
 */

package oopsdemo1;

//Instance Class

class Lamp
{
    //Stores the status of lamp;
    private boolean isOn;

    // Default constructor

    //method to turn On Lamp
    public void turnOn(){
        isOn=true;
        System.out.println("Light On ? "+isOn);
    }

    //method to turn Off Lamp
    public void turnOff(){
        isOn=false;
        System.out.println("Light On ? "+isOn);
    }
}

public class LampTest {

    public static void main(String[] args)
    {
        Lamp led=new Lamp();
        Lamp halogen=new Lamp();

        // Switch On led and halogen

        led.turnOn();
        halogen.turnOn();

        // Switch Off led and halogen

        led.turnOff();
        halogen.turnOff();
    }


}
