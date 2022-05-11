package grey.mavenHW;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Bars bars = new Bars("White Bars", "TyanShan", "White and grey");
//        bars.animalPlus();
//        Bars barsFriend = new Bars("Snow Bars", "Asian", "White and black");
//        barsFriend.animalPlus();

//        Animal myFavoriteAnimal = person.getMyFavoriteAnimal();
//        System.out.println("My Favorite animal " + myFavoriteAnimal);
        //friend fav animal
//        Person personFriend = context.getBean("myFavriteAnimalBean", Person.class);
//        personFriend.setMyFavoriteAnimal();
//        Animal friendFavAnimal = personFriend.getMyFavoriteAnimal();
//        System.out.println("My Friend Favorite animal " + friendFavAnimal);

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myFavoriteAnimalBean", Person.class);
        person.showFavAnimal();
        System.out.println("****************");
        //Friend favorite animals
        Person personFriend = context.getBean("friendAnimals", Person.class);
        personFriend.showFavAnimal();




    }
}
