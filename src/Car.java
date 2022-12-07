/** Representa un carro con sus atributos y algunas funciones
 * @author Jhon Gutierrez
 */
public class Car {
    /**
     * Representa variable color
     */
    public String color;
    /**
     * Representa variable modelo
     */
    public String model;
    /**
     * Representa variable precio
     */
    public float price;
    /**
     * Representa variable marca
     */
    private String brand;
    /**
     * Representa variable condicion
     */
    private boolean condition;

    /**
     * Representa metodo constructor de la clase
     * @param color
     * @param model
     * @param price
     * @param brand
     * @param condition
     */

    public Car(String color, String model, float price, String brand, boolean condition) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.brand = brand;
        this.condition = condition;
    }

    /**
     * Representa metodo que informa la condicion del carro
     */
    private void conditionCar(){
        if(condition == false){
            System.out.println("El carro no esta disponible");
        }else{
            System.out.println("El carro esta disponible");
        }
    }

    /**
     * Representa la velocidad  que alcanza el carro
     */
    public void speedcar(){
    }

    /**
     * Representa los gets and sets de las variables de la clase
     *
     */

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
