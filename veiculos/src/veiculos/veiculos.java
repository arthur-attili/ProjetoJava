package veiculos;

import java.util.Scanner;

public class veiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione um veículo:");
        System.out.println("1. Jeep Renegade");
        System.out.println("2. Onix");
        System.out.println("3. HB20");
        System.out.println("4. Civic");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        Veiculo veiculo = null;

        switch (opcao) {
            case 1:
                veiculo = Veiculo.JEEP_RENEGADE;
                break;
            case 2:
                veiculo = Veiculo.ONIX;
                break;
            case 3:
                veiculo = Veiculo.HB20;
                break;
            case 4:
                veiculo = Veiculo.CIVIC;
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }

        scanner.close();

        System.out.println("Informações do veículo selecionado:");
        System.out.println("Nome: " + veiculo.getNome());
        System.out.println("Número de portas: " + veiculo.getNumeroPortas());
        System.out.println("Tipo: " + veiculo.getTipo());
        System.out.println("Litros do porta-malas: " + veiculo.getLitrosPortaMalas());
    }
}
