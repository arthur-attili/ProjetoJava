package animais;

class Passaro extends AnimalBase {
 @Override
 public void emitSound() {
     System.out.println("O pássaro canta: Piu piu!");
 }
 
 @Override
 public void move() {
     System.out.println("O pássaro voa.");
 }
}
