import java.util.List;

public class Game {
    private List<Bird> birds ;

    public Game(List<Bird> birds) {
        this.birds = birds;
    }

    public void play() {
        for (Bird bird : birds) {
            bird.fly();
            bird.makeSound();
            bird.attack();
        }
    }
}
