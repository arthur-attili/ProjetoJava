package animais;

public class Main {
 public static void main(String[] args) {
     Animal cachorro = new Cachorro();
     Animal passaro = new Passaro();
     Animal peixe = new Peixe();

     System.out.println("Ações do cachorro:");
     cachorro.emitSound();
     cachorro.move();

     System.out.println("\nAções do pássaro:");
     passaro.emitSound();
     passaro.move();

     System.out.println("\nAções do peixe:");
     peixe.emitSound();
     peixe.move();
 }
}
