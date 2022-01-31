public class PokemonStadium {

    public static void main(String[] args) {
        Pokemon pokemon = new Squirtle() ;
        WaterPokemon pokemon2 = new Squirtle() ;
        Squirtle pokemon3 = new Squirtle() ;

        pokemon3.fight();
        pokemon3.eat("Fish");

        Pokemon pokemon4 = new Psyduck() ;
        pokemon4.fight();
    }
}

abstract class Pokemon{
    String name;
    void fight(){
        System.out.println("Im pokemon and I fight");
    }
    abstract void eat(String food);
    abstract void recover();
}

abstract class WaterPokemon extends Pokemon{
    abstract void swim();
}

abstract class GrassPokemon extends Pokemon{
    abstract void run();
}

abstract class FirePokemon extends Pokemon{
    abstract void fire();
}

interface Physcho{
    void mentalAttack();
}

class Squirtle extends WaterPokemon{

    //Overriding a method
    @Override void fight() {
        System.out.println("Squirtle fight");
    }
    @Override void eat(String food) {
        System.out.println("Squirtle eating " + food);
    }
    @Override void recover() {
        System.out.println("Squirtle recover");
    }
    @Override void swim() {
        System.out.println("Squirtle swim");
    }

    //Overloading a method
    void newMethod(String a, String b){
        System.out.println(a + b);
    }
    void newMethod(Integer a, Integer b){
        System.out.println(a + b);
    }
}

class Psyduck extends WaterPokemon implements Physcho{

    @Override void eat(String food) {
        System.out.println("Psyduck eat" + food);
    }
    @Override void recover() {
        System.out.println("Psyduck recover");
    }
    @Override void swim() {
        System.out.println("Psyduck swim");
    }
    @Override public void mentalAttack() {
        System.out.println("Psyduck mentalAttack");
    }
}