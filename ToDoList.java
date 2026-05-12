/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package to.pkgdo.list;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
public class ToDoList extends Application {
    
    @Override
     public void start(Stage primaryStage) {
        Text heading =new Text("To Do List");
        heading.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");
        TextField input = new TextField();
        input.setPromptText("Enter task");
        Button addBtn = new Button("Add");
        
        HBox top = new HBox(10, input, addBtn);
        VBox root = new VBox(10,heading);
        root.getChildren().add(top);

        addBtn.setOnAction(e -> {
            String task = input.getText();

            if (!task.isEmpty()) {
             Text taskl = new Text(task);
             root.getChildren().add(taskl);
              
                input.clear();
            }
        });
          
        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
