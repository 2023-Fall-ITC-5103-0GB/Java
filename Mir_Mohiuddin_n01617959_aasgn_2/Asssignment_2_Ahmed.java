package sem2week2;
import java.util.Random;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.GridPane;


public class Asssignment_2_Ahmed extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
        primaryStage.setTitle("Search Name Ranking Application");

        // Creating labels and text fields fot thr user input
        Label lableForYear = new Label("Enter Year:");
        TextField feildForYear = new TextField();

        Label lableForGender = new Label("Enter Gender:");
        TextField feildForGender = new TextField();

        Label lableForName = new Label("Enter Name:");
        TextField feildForName = new TextField();

        // cerating buttons for the ranking and exiting the application
        Button rankButton = new Button("Submit Query");
        Button exitButton = new Button("Exit");

        // Event handler for the ranking button
        rankButton.setOnAction(event -> {
            // Get user input
            String year = feildForYear.getText();
            String gender = feildForGender.getText();
            String name = feildForName.getText();

            // Generating a random rank
            Random random = new Random();
            int ranking = random.nextInt(100);

            // Display the ranking
            String message = " '" + name + "' ranked " + ranking + " for the year " + year + " among " + gender.toLowerCase() + " names.";
            System.out.println(message);
        });
        
        // Event handler for the exit button
        exitButton.setOnAction(event -> primaryStage.close());

     // Create a GridPane to organize the elements
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20));

        // Add elements to the grid pane
        gridPane.add(lableForYear, 0, 0);
        gridPane.add(feildForYear, 1, 0);
        gridPane.add(lableForGender, 0, 1);
        gridPane.add(feildForGender, 1, 1);
        gridPane.add(lableForName, 0, 2);
        gridPane.add(feildForName, 1, 2);
        gridPane.add(rankButton, 0, 3);
        gridPane.add(exitButton, 1, 3);

        // Adjusting the buttons a bit on the right wrt their places 
          GridPane.setHalignment(rankButton, HPos.RIGHT);
          GridPane.setHalignment(exitButton, HPos.RIGHT);


        // Creating a scene and seting it on the stage
        Scene scene = new Scene(gridPane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
	}

}
