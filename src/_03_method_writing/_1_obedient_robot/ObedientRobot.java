package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		rob.penDown();
		rob.setSpeed(100);
		String shape = JOptionPane.showInputDialog("What shape do you want to draw (triangle, square, circle)?");
		String color = JOptionPane.showInputDialog("What color do you want to use (red, blue, yellow)?");
		if (color.equals("red")) {
			rob.setPenColor(255,0,0);
		}
		else if (color.equals("yellow")) {
			rob.setPenColor(0, 255, 0);
		}
		else {
			rob.setPenColor(0, 0, 255);
		}
		if (shape.equals("triangle")) {
			drawTriangle();
		}
		else if (shape.equals("square")) {
			drawSquare();
		}
		else {
			drawCircle();
		}
	}
	public static void drawSquare() {
		rob.setX(500);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.setX(1000);
	}
	public static void drawTriangle() {
		rob.setX(500);
		rob.move(100);
		rob.turn(240);
		rob.move(100);
		rob.turn(240);
		rob.move(100);
		rob.turn(240);
		rob.setX(1000);
	}
	public static void drawCircle() {
		rob.setSpeed(100);
		for (int i = 0; i < 360; i++) {
			rob.move(1);
			rob.turn(1);
		}
		rob.setX(1000);
	}
}
