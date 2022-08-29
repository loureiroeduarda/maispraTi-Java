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

    public double caculaDistancia (int coordenadaX, int coodernadaY) {
        return Math.sqrt(Math.pow(coordenadaX - this.x, 2) + Math.pow(coodernadaY - this.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
