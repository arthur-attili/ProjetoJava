package animais;

class Peixe extends AnimalBase {
 @Override
 public void emitSound() {
     System.out.println("O peixe não emite som.");
 }
 
 @Override
 public void move() {
     System.out.println("O peixe nada.");
 }
}
