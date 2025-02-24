import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new RedBird("Red", "circular", "squawk", 50));
        birds.add(new YellowBird("Yellow", "triangular", "chirp", 75));
        birds.add(new BlueBird("Blue", "circular", "squawk", 100));
        Game game = new Game(birds);
        game.play();
    }
}