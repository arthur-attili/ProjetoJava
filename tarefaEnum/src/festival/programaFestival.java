package festival;

public class programaFestival {
    public static void main(String[] args) {
        Banda bandaSelecionada = Banda.selecionarBandaAleatoria();

        System.out.println("Banda selecionada: " + bandaSelecionada);
    }
}
