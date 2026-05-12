/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package tableview;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class Tableview extends Application {
     @Override
    public void start(Stage primaryStage) {
    
        Text heading =new Text("Student Registration");
        heading.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");
        TextField id = new TextField();
        id.setPromptText("ID");

        TextField name = new TextField();
        name.setPromptText("Name");

        TextField cgpa = new TextField();
        cgpa.setPromptText("CGPA");

        Button Btn = new Button("Add");
        HBox inputBox = new HBox(10, id, name, cgpa, Btn);
        VBox root = new VBox(10,heading);
        root.getChildren().add(inputBox);

        Btn.setOnAction(e -> {

            String data = id.getText() + "  " +
                          name.getText() + "  " +
                          cgpa.getText();

            TextField output = new TextField(data);
            root.getChildren().add(output);

            id.clear();
            name.clear();
            cgpa.clear();
        });

        Scene scene = new Scene(root, 500, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}