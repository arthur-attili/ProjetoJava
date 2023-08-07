package estadosBrasileiros;

public class sistemaIbge {
    public static void main(String[] args) {
        for (estadosBrasileiros estado : estadosBrasileiros.values()) {
            String nomeEstado = estado.getNome();
            String siglaEstado = estado.getSigla();
            
            System.out.println("Estado: " + nomeEstado);
            System.out.println("Sigla: " + siglaEstado);
            System.out.println();
        }
    }
}
