class AbstractionExample {
 public static void main(String args[]){
  Car car = new BMW();
  car.startCar();
  car.stopTheCar();
 }
}
abstract class Car{
 abstract void startCar();
 abstract void stopTheCar();
}
class BMW extends Car{
  @Override
 void startCar(){
  System.out.println("The car has been started");
 }
 @Override
 void stopTheCar(){
  System.out.println("The car has been stoped");
 }

}