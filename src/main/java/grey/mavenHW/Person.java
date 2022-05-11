package grey.mavenHW;

public class Person {
    private String name;
    private int age;
    private Animal myFavoriteAnimal;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Animal myFavoriteAnimal) {
        this.myFavoriteAnimal = myFavoriteAnimal;
    }

    public Person() {
        System.out.println("Persons default bean is created");

    }

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

    public Animal getMyFavoriteAnimal() {
        return myFavoriteAnimal;
    }

    public void setMyFavoriteAnimal(Animal myFavoriteAnimal) {
        this.myFavoriteAnimal = myFavoriteAnimal;
    }
    public void showFavAnimal() {
        myFavoriteAnimal.animalPlus();
    }
}
