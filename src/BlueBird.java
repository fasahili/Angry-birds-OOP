class BlueBird extends Bird {
    public BlueBird(String name, String shape, String sound, int damage) {
        super(name, shape, sound, damage);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " Bird is flying and can split into three smaller birds!");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Bird makes a " + getSound() + " sound!");
    }
    @Override
    public void attack() {
        System.out.println(getName() + " Bird attacks with " + getDamage() + " damage points!");
        System.out.println(" ");
    }
}