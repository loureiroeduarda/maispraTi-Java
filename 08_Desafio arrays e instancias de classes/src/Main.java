public class Main {
    public static void main(String[] args) {
        Objeto[] objetos = new Objeto[4];

        objetos[0] = new Objeto(50,30);
        objetos[1] = new Objeto(100,300);
        objetos[2] = new Objeto(20,90);
        objetos[3] = new Objeto(1,3);

        for (Objeto elemento : objetos) {
            System.out.println(elemento);
        }
    }
}