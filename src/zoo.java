import java.util.ArrayList;
public class zoo {
    public static void main(String[] args){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.sleep();
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        gemma.sleep();
        Bee stinger = new Bee ("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        stinger.sleep();
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(pooh);
        animals.add(tigger);
        animals.add(rarity);
        animals.add(gemma);
        animals.add(stinger);
        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals, "popcorn");

    }

}

