package escola;

public class SistemaCadastro {
    public static void main(String[] args) {
        pessoa marcos = new pessoa("03238157404", "MARCOS SILVA");

        marcos.setEndereco("Campos Salles");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
