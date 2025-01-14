package multifuncional;

import copiadora.Copiadora;
import digitalizadora.Digitalizadora;
import impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora{

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando com a multifuncional");
    }

    @Override
    public void copiar() {
        System.out.println("Copiando com a multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo com a multifuncional");
    }
    
}
