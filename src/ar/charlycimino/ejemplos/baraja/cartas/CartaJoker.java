package ar.charlycimino.ejemplos.baraja.cartas;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class CartaJoker extends Carta {

    private boolean aColor;

    public CartaJoker(boolean aColor) {
        this.aColor = aColor;
    }

    @Override
    public String getRepresentacion() {
        return "Joker " + (aColor ? "a colores" : "blanco y negro");
    }

}
