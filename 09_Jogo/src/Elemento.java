import java.util.Random;

public class Elemento {
    private final int x;
    private final int y;

    public Elemento() {
        Random random = new Random();
        this.x = random.nextInt(9);
        this.y = random.nextInt(9);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
