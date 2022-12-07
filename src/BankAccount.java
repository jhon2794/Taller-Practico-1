/** Representa una cuenta bancaria con sus atributos
 * @author jhon gutierrez
 */
public class BankAccount {
    /**
     * Representa la variable numero de cuenta
     */
    private int accountNumber;
    /**
     * Representa la variable de activada
     */
    protected boolean activated;

    /**
     * Representa el  metodo constructor de la clase
     * @param accountNumber
     * @param activated
     */

    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    /**
     * Representa metodos gets and sets de las variables de la clase
     *
     */

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
