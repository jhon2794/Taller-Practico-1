/** Representa un libro con sus atributos
 * @autor jhon gutierrez
 */
public class Book {

    /**
     * Representa variable de precio del libro
     */
    public float price;
    /**
     * Representa variable autor del libro
     */
    private String author;
    /**
     * Representa variable nombre del libro
     */
    public String name;
    /**
     * Representa variable numero de paginas del libro
     */
    protected int numberPages;
    /**
     * Representa el genero del libro
     */
    private String gender;

    /**
     * Represemta el metodo constructor de la clase
     * @param price
     * @param author
     * @param name
     * @param numberPages
     * @param gender
     */

    public Book(float price, String author, String name, int numberPages, String gender) {
        this.price = price;
        this.author = author;
        this.name = name;
        this.numberPages = numberPages;
        this.gender = gender;
    }

    /**
     * Representa el metodo que categoriza si un libro es caro o economico
     */
    public void expensiveBook(){
        if (price > 100.000){
            System.out.println("El libro es caro");
        }else{
            System.out.println("El libor es economico");
        }
    }

    /**
     * Metodos gets and sets de las variables de la clase
     *
     */
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
