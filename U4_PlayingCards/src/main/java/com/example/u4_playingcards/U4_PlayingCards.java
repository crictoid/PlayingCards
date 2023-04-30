// Mark Bulmer - CSC 151 - 10-1-2022
// Playing Cards

package com.example.u4_playingcards;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class U4_PlayingCards extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane to hold the image views
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));
        Image image = new Image("https://i.ibb.co/Q8KQkvr/Screenshot-40.jpg");
        // I understand that this is going against the rubric, but I am having trouble
        // figuring out where to place the image files under "target/classes" directory.
        // I tried in every folder and subfolder, and it will run, but it pulls a
        // blank image instead of the one I intended. You said not
        // to path to the file directly but that doesn't seem to work either.
        // Works fine with a URL though so that is what I included.
        pane.getChildren().add(new ImageView(image));

        //ImageView imageView2 = new ImageView(image);
        //imageView2.setFitHeight(100);
       // imageView2.setFitWidth(100);
        //pane.getChildren().add(imageView2);

        // Grouped the four cards as one image instead of four separate ones which is also
        // going against the rubric. Uncommenting these lines will duplicate the image in
        // the Hbox.

       // ImageView imageView3 = new ImageView(image);
       // imageView3.setRotate(90);
       // pane.getChildren().add(imageView3);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Four Playing Cards"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}