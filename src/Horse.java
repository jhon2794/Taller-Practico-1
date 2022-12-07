/**
 * Representa un caballo con sus atributos y algunas caracteristicas
 * @author Jhon Gutierrez
 */
public class Horse {
    /**
     * Representa variable nombre
     */
    public String name;
    /**
     * Representa variable edad
     */
    private int age;
    /**
     * Representa variable tamaño
     */
    public  int height;
    /**
     * Representa variable peso
     */
    public int weight;

    /**
     * Representa metodo constructor de la clase
     * @param name
     * @param age
     * @param height
     * @param weight
     */

    public Horse(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Representa velocidad con que corre el caballo
     */
    public void run(){
        System.out.println("la velocidad en que corre");
    }

    /**
     * Representa movimiento de cola que realiza el caballo al correr
     */
    private void tailMovement(){
/**
 * Representa movimiento de cabeza que realiza el caballo al correr
 */
    }

    private void headMovement(){

    }

    /**
     *
     * Representa metodos gets and sets de las variables de la clase
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
