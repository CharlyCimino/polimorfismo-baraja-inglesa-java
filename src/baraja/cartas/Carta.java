package baraja.cartas;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public abstract class Carta {

    private boolean tapada;

    public Carta() {
        this.tapada = true;
    }

    public boolean isTapada() {
        return tapada;
    }

    public void darVuelta() {
        tapada = !tapada;
//        if (tapada) {
//            tapada = false;
//        } else {
//            tapada = true;
//        }
    }

    public void mostrar() {
        if (tapada) {
            System.out.println("**************");
        } else {
            System.out.println(getRepresentacion());
        }
    }

    public String getRepresentacion() {
        return "Carta genérica";
    }
}
