class RedBird extends Bird {
    public RedBird(String name, String shape, String sound, int damage) {
        super(name, shape, sound, damage);
    }
    @Override
    public void fly() {
        System.out.println(getName() + " Bird is flying straight");
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " Bird makes a " + getSound() + " sound");
    }
    @Override
    public void attack() {
        System.out.println(getName() + " Bird hits the target with " + getDamage() + " damage points");
        System.out.println(" ");
    }
}