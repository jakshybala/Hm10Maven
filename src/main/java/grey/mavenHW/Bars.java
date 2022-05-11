package grey.mavenHW;

public class Bars implements Animal{

    private String name;
    private String species; //парода
    private String color;


    @Override
    public void animalPlus() {
        System.out.println("AnimalPlus method from Bars class: " + "\nName is: " + getName() + "\nSpecies: " + getSpecies() + "\nColor: " + getColor());

    }

    @Override
    public void animalMinus() {
        System.out.println("Test animalMinus method from Bars class");

    }

    public Bars() {
        System.out.println("Bars default bean is created");
    }

    public Bars(String name, String species, String color) {
        this.name = name;
        this.species = species;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", color='" + color + '\'';
    }
}
