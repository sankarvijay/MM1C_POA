package patterns.state;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 09/12/2013
 * Time: 11:12
 * To change this template use File | Settings | File Templates.
 */
public class VendingMachineStateRefund extends VendingMachineState {
    private static VendingMachineStateRefund instance = null;
    private int givenCash;

    private VendingMachineStateRefund() {
        givenCash = 0;
    }

    public static VendingMachineStateRefund getInstance() {
        if (instance == null)
            instance = new VendingMachineStateRefund();
        return instance;
    }

    public void give(VendingMachineContext c, int money) throws IncorrectStateException {
        throw new IncorrectStateException("impossible to give money now");
    }

    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("impossible make choice now");
    }

    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("impossible to make choice");
    }

    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
        //argent renvoyer au debut

        int rtr = c.getCash();
        c.setCash(0);
        c.setState(VendingMachineStateBegin.getInstance());
        return rtr;
    }

}
