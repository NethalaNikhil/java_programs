class RunTimePolymorphism{
 public static void main(String args[]){
  Bicycle mb = new MountainBicycle (3,100,2);
  mb.speedIncrease(20);
  //mb.heightIncrease(2);
  mb.printInfo();
 }
}
class Bicycle {
 int gears,speed;
 Bicycle(int gears, int speed){
  this.gears = gears;
  this.speed = speed;
 }
 public void speedIncrease(int speed){
  this.speed = this.speed+speed;
 }
 public void speeddescrease(int speed){
  this.speed = this.speed-speed;
 }
 public void printInfo(){
  System.out.printf("gears = %d \n",gears);
  System.out.printf("speed = %d \n",speed);
 }
}
class MountainBicycle extends Bicycle{
 int height;
 MountainBicycle (int gear,int speed,int height){
  super(gear,speed);
  this.height = height;
 }
 public void heightIncrease(int height){
  this.height = this.height+height;
 }
 public void heightdescrease(int height){
  this.height = this.height-height;
 }

 public void printInfo(){
  super.printInfo();
  System.out.println("height = "+height);
 }
 
}
