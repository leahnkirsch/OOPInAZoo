public class Tiger {
    public String name;
    public String favoriteFood = "meat";

    public Tiger(String name) {
        this.name = name;
        favoriteFood = "meat";
    }


    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        if (food.equals(favoriteFood)) {
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
        } else {
            System.out.println(name + " eats " + food);
        }
    }

    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        tigger.sleep("Tigger");
    }
}