package FormasGeometricas;

//Classes concretas que herdam de ShapeBase e implementam comportamentos específicos
public class Circle extends ShapeBase {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }

 @Override
 public double calculatePerimeter() {
     return 2 * Math.PI * radius;
 }
}
