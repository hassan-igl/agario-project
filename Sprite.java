package org.example;

import javafx.scene.shape.Circle;
import javafx.scene.Group;

public class Sprite extends Group {
    public Sprite(double x, double y, double radius) {
        Circle circle = new Circle(x, y, radius);
        this.getChildren().add(circle);
    }

    public void setX(double sceneX) {
        System.out.println(sceneX + " X");
    }

    public void setY(double sceneY) {
        System.out.println(sceneY+ " Y");
    }
}