import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new RedBird());
        birds.add(new YellowBird());
        birds.add(new BlueBird());
        Game game = new Game(birds);
        game.play();
    }
}