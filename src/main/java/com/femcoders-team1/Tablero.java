
public class Tablero {

    private static char[][] tablero = new char[3][3];

    public Tablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "-";
            }
        }
    }

    private static void inicializarTablero() {
        System.out.println(Tablero);

    }
}
