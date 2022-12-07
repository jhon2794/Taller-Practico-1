import java.util.ArrayList;

/**
 * Representa una fruta y sus atributos
 * @author Jhon Gutierrez
 */
public class Fruit {
    /**
     * Representa variable nombre
     */
    public String name;
    /**
     * Representa variable promedio de peso
     */
    private float  averageWeight;
    /**
     * Representa lista de colores
     */
    public ArrayList<String> colors;

    /**
     * Representa metodo contructor de la clase
     * @param name
     * @param averageWeight
     * @param colors
     */

    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     *
     *  Metodos gets and sets de las variables de la clase
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
