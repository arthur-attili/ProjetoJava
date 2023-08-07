package olimpíadas;
public enum modalidade {
    FUTEBOL(1),
    GINASTICA(2),
    NATACAO(3),
    ATLETISMO(4);

    private int codigo;

    private modalidade(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
