package festival;

import java.util.Random;

public enum Banda {
    FOO_FIGHTERS,
    BON_JOVI,
    IRON_MAIDEN;

    public static Banda selecionarBandaAleatoria() {
        Banda[] bandas = Banda.values();
        Random random = new Random();
        int randomIndex = random.nextInt(bandas.length);
        return bandas[randomIndex];
    }
}
