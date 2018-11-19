package patterns.state;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 09/12/2013
 * Time: 11:43
 * To change this template use File | Settings | File Templates.
 */
public class SimpleVendingMachineContext {
    //composition de notre stat
    private SimpleVendingMachineState current;

    public SimpleVendingMachineContext() {
        //Singleton, constructeur de la classe, permet de creer ma machine à cafe, j'initialise son etat, il est unique, on permet de creer un object unique
        current = SimpleVendingMachineStateBegin.getInstance();
    }

    void setState(SimpleVendingMachineState s) {
        current = s;
    }


    public void give(int money) throws IncorrectStateException {

        current.give(this, money);
    }

    public void askCoffee() throws IncorrectStateException {
        current.askCoffee(this);
    }

    public void askTea() throws IncorrectStateException {
        current.askTea(this);
    }

}
