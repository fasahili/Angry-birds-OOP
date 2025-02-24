public abstract class Bird {

    protected String name;
    protected String shape;
    protected String sound;
    protected int damage;

    public abstract void fly();
    public abstract void attack();
    public abstract void makeSound();

    public Bird(String name, String shape, String sound, int damage) {
        setDamage(damage);
        setShape(shape);
        setName(name);
        setSound(sound);
    }

    protected void setDamage(int damage) {
        this.damage = damage;
    }
    protected void setName(String name) {
        this.name = name;
    }
    protected void setShape(String shape) {
        this.shape = shape;
    }
    protected void setSound(String sound) {
        this.sound = sound;
    }

    protected int getDamage() {
        return damage;
    }
    protected String getShape() {
        return shape;
    }
    protected String getName() {
        return name;
    }
    protected String getSound() {
        return sound;
    }
}