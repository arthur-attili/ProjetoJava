package animais;

abstract class AnimalBase implements Animal {
 @Override
 public void move() {
     System.out.println("O animal se move de forma padrão.");
 }
}
