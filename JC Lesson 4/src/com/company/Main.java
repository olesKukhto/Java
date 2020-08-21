package com.company;

public class Main {

    public static void main(String[] args) {
          Robot robot = new Robot();
          String robot1;
          robot.work();
          CoffeeRobot coffeeRobot = new CoffeeRobot();
          coffeeRobot.work();
          DancerRobot dancerRobot = new DancerRobot();
          dancerRobot.work();
          CookerRobot cookerRobot = new CookerRobot();
          cookerRobot.work();
          Robot[] array = {robot,coffeeRobot,dancerRobot,cookerRobot};
          for(int i = 0;i < 4;i++){
              array[i].work();
          }
    }
}
