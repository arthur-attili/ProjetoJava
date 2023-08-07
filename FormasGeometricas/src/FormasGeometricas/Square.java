package FormasGeometricas;

//Classes concretas que herdam de ShapeBase e implementam comportamentos específicos
public class Square extends ShapeBase {
 private double side;

 public Square(double side) {
     this.side = side;
 }

 @Override
 public double calculateArea() {
     return side * side;
 }

 @Override
 public double calculatePerimeter() {
     return 4 * side;
 }
}
