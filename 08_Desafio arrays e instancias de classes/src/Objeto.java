public class Objeto {
    private final int valor1;
    private final int valor2;

    public Objeto(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    @Override
    public String toString() {
        return "(" + this.valor1 + "," + this.valor2 + ")";
    }
}
