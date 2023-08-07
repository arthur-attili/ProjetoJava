package impressora;

public class fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncionalImpl();

        Impressoraa impressora = em;
        digitalizadora digitalizadora = em;
        copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
