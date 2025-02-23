import behavior.Attack;
import behavior.Fly;
import behavior.MakeSound;

public class Bird implements Fly, Attack, MakeSound {

    protected String name;
    protected String shape;
    protected String sound;
    protected int damage;

    public Bird(String name, String shape, String sound, int damage) {
        this.name = name;
        this.shape = shape;
        this.sound = sound;
        this.damage = damage;
    }

    public void fly() {
        System.out.println(name + " Bird is flying straight");
    }

    public void attack() {
        System.out.println(name + " Bird hits the target with " + damage + " damage points");
    }

    public void makeSound() {
        System.out.println(name + " Bird makes a " + sound + " sound");
    }
}
