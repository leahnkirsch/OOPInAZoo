public class Bear {
    public String name;
    public String favoriteFood = "fish";

    public Bear(String name) {
        this.name = name;
        this.favoriteFood = "fish";
    }


    public void sleep(String name) {
        System.out.println(name + " sleeps for 12 hours");
    }

    public void eat(String food) {
        if (food.equals(favoriteFood)) {
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
        } else {
            System.out.println(name + " eats " + food);
        }
    }
}
