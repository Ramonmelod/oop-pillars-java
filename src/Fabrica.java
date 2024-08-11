import copiadora.Copiadora;
import copiadora.Xerox;

public class Fabrica {
    public static void main(String [] args){
        Copiadora copiadora = new Xerox();

        copiadora.copiar();
    }
}
