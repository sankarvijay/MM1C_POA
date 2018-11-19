package patterns.state;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 09/12/2013
 * Time: 10:57
 * To change this template use File | Settings | File Templates.
 */
public class VendingMachineStateBegin extends VendingMachineState {
    private static VendingMachineStateBegin instance = null;

    private VendingMachineStateBegin() {
        super();
    }

    public static VendingMachineStateBegin getInstance() {
        if (instance == null)
            instance = new VendingMachineStateBegin();
        return instance;
    }

    public void give(VendingMachineContext c, int money) throws IncorrectStateException {
        c.setCash(c.getCash()+money);
        if (c.getCash() >= 10)
            c.setState(VendingMachineStateChoice.getInstance());
    }

    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("not enough money given");
    }

    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("not enough money given");
    }

    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
        int rtr = c.getCash();
        c.setCash(0);
        return rtr;
    }

}
