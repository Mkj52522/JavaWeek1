package TheAdventureofthebarrenmoor;

import java.util.ArrayList;

import Car;
import Lorry;
import Motorcycle;
import Vehicle;

public class Main{



		public static void main(String[] args) {
			Vehicle vehicle1 = new Motorcycle(1, "Motorcycle", 120, 40, 700, "AH51 7LK", 6);
			Vehicle vehicle2 = new Lorry(6, "Lorry", 100, 60, 1500, "YU21 8KU", 60);
			Vehicle vehicle3 = new Car(3, "Car", 130, 50, 2000, "SK89 9LQ", 12);
			Vehicle vehicle4 = new Motorcycle(2, "Motorcycle", 160, 45, 1000, "UQ76 8IJ", 6);
			Vehicle vehicle5 = new Lorry(4, "Lorry", 90, 50, 2500, "YR24 9KU", 60);
			Vehicle vehicle6 = new Car(4, "Car", 165, 40, 3800, "OP24 0IL", 12);
			
			System.out.println(vehicle1); 
			System.out.println(vehicle2);
			System.out.println(vehicle3);
			System.out.println(vehicle4);
			System.out.println(vehicle5); 
			System.out.println(vehicle6);
	
			
			System.out.println(vehicle1.f*5);
			System.out.println(vehicle2.f*5);
			System.out.println(vehicle3.f*5);
			System.out.println(vehicle4.f*5);
			System.out.println(vehicle5.f*5);
			System.out.println(vehicle6.f*5);
			
			
		}
		}
			







		
			
