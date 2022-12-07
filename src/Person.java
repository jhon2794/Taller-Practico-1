/**
 * Representa una persona y sus atributos
 * @author Jhon Gutierrez
 */
public class Person {
    /**
     * Representa variable nombre
     */
    public String name;
    /**
     * Representa variable apellido
     */
public String lastname;
    /**
     * Representa variable segundo apellido
     */
public String lastname2;
    /**
     * Representa variable fecha nacimiento
     */
public String dateBirth;
    /**
     * Representa variable altura
     */
public String height;

    /**
     * Representa metodo constructor de la clase
     * @param name
     * @param lastname
     * @param lastname2
     * @param dateBirth
     * @param height
     */

    public Person(String name, String lastname, String lastname2, String dateBirth, String height) {
        this.name = name;
        this.lastname = lastname;
        this.lastname2 = lastname2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Representa los gets and sets de las variables de la clase
     *
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getLastname2() {
        return lastname2;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public String getHeight() {
        return height;
    }
}
