class YellowBird extends Bird {
    public YellowBird(String name, String shape, String sound, int damage) {
        super(name, shape, sound, damage);
    }
    @Override
    public void fly() {
        System.out.println(getName() + " Bird is flying in a straight line at incredible speed");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Bird lets out a fierce " + getSound() + "!");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " Bird hits the target with a powerful punch, dealing " + getDamage() + " damage points");
        System.out.println(" ");
    }
}