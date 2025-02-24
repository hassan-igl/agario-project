package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

public class Main extends Application {

    public void start(Stage stage) {
        stage.setTitle("Agar.io");

        Group root = new Group();

        Sprite sprite = new Sprite(150.0, 150.0, 80.0);
        Food food = new Food(5);

        // Mouse event handler to move the sprite
        EventHandler<MouseEvent> ev = event -> {
            sprite.setX(event.getSceneX());
            sprite.setY(event.getSceneY());
        };

        root.getChildren().addAll(sprite, food);
        Scene scene = new Scene(root, 1000, 700);
        stage.setScene(scene);

        // Add event listener to detect mouse movement
        scene.addEventFilter(MouseEvent.MOUSE_MOVED, ev);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
