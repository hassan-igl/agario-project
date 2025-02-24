package org.example;

import javafx.scene.shape.Circle;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import java.util.Random;

public class Food extends Group {
    public Food(double radius) {
        Random random = new Random();  // Create the Random object once

        int count = 0;
        while (count < 50) {
            double randomX = random.nextDouble() * (1000 - 2 * radius) + radius; // Keeps within 500 width
            double randomY = random.nextDouble() * (700 - 2 * radius) + radius; // Keeps within 300 height

            Circle foodCircle = new Circle(randomX, randomY, radius);
            foodCircle.setFill(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));

            this.getChildren().add(foodCircle);
            count++;
        }
    }
}
