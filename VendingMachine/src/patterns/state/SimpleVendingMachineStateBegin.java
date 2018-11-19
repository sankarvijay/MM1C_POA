package patterns.state;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 09/12/2013
 * Time: 11:45
 * To change this template use File | Settings | File Templates.
 */
public class SimpleVendingMachineStateBegin extends SimpleVendingMachineState {
    private static SimpleVendingMachineStateBegin instance = null;
    private int cash;

    private SimpleVendingMachineStateBegin() {
        super();
        cash = 0;
    }

    public static SimpleVendingMachineStateBegin getInstance() {
        if (instance == null)
            instance = new SimpleVendingMachineStateBegin();
        return instance;
    }

    public void give(SimpleVendingMachineContext c, int money) throws IncorrectStateException {
        //on augmente l'argent de la caisse
        cash += money;
        if (cash >= 10) {
            cash = 0;
            // on change l'etat du choix
            c.setState(SimpleVendingMachineStateChoice.getInstance());
        }
    }

    public void askCoffee(SimpleVendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("not enough money given");
    }

    public void askTea(SimpleVendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("not enough money given");
    }
}
