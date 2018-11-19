package patterns.state;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 09/12/2013
 * Time: 11:09
 * To change this template use File | Settings | File Templates.
 */
public class VendingMachineStateChoice extends VendingMachineState {
    private static VendingMachineStateChoice instance = null;

    private VendingMachineStateChoice() {
     }

    public static VendingMachineStateChoice getInstance() {
        if (instance == null)
            instance = new VendingMachineStateChoice();
        return instance;
    }

    public void give(VendingMachineContext c, int money) throws IncorrectStateException {
        throw new IncorrectStateException("impossible to give money now");
    }

    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {
        System.out.println("coffee being served ...");
        c.setCash(c.getCash()-10);
        c.setState(VendingMachineStateRefund.getInstance());
    }

    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        System.out.println("tea being served ...");
        c.setCash(c.getCash()-10);
        c.setState(VendingMachineStateRefund.getInstance());
    }

    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
        int rtr = c.getCash();
        c.setCash(0);
        c.setState(VendingMachineStateBegin.getInstance());
        return rtr;
    }

}
