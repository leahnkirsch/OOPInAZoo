public class Animal {
    public String name;
    public String favoriteFood;
    public static int population = 0;

// constructor
    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        population ++;

    }
//methods
    public void sleep() {
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        if (food.equals(favoriteFood)) {
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
        } else {
            System.out.println(name + " eats " + food);
            sleep();
        }
    }
    public static int populationCount(){
        return population;
    }
}
