package impressora;

public class EquipamentoMultifuncionalImpl implements EquipamentoMultifuncional {
    public void imprimir() {
        System.out.println("Imprimindo documento");
    }

    public void digitalizar() {
        System.out.println("Digitalizando documento");
    }

    public void copiar() {
        System.out.println("Copiando documento");
    }
}
