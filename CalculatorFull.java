/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package calculatorfull;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class CalculatorFull extends Application {
    double firstnum=0;
    String operator="";
    @Override
    public void start(Stage primaryStage) {
       
        TextField display= new TextField();
        display.setEditable(false);
        
        GridPane grid=new GridPane();
        Button btn1= new Button("1");
        Button btn2= new Button("2");
        Button btn3= new Button("3");
        Button btn4= new Button("4");
        Button btn5= new Button("5");
        Button btn6= new Button("6");
        Button btn7= new Button("7");
        Button btn8= new Button("8");
        Button btn9= new Button("9");
        Button btn10= new Button("+");
        Button btn11= new Button("-");
        Button btn12= new Button("*");
        Button btn13= new Button("/");
        Button btn14= new Button("%");
        Button btn15= new Button("C");
       Button btn16= new Button("=");
        
        grid.add(btn1,0,0);
        grid.add(btn2,1,0);
        grid.add(btn3,2,0);
        grid.add(btn4,0,1);
        grid.add(btn5,1,1);
        grid.add(btn6,2,1);
        grid.add(btn7,0,2);
        grid.add(btn8,1,2);
        grid.add(btn9,2,2);
        grid.add(btn10,0,3);
        grid.add(btn11,1,3);
        grid.add(btn12,2,3);
        grid.add(btn13,0,4);
        grid.add(btn14,1,4);
        grid.add(btn15,2,4);
        grid.add(btn16,0,5);
        btn1.setOnAction(e->{
         display.setText(display.getText()+"1");  
        });
       btn2.setOnAction(e->{
         display.setText(display.getText()+"2");
       });
       btn3.setOnAction(e->{
          display.setText(display.getText()+"3");
       });
       btn4.setOnAction(e->{
         display.setText(display.getText()+"4");  
        });
       btn5.setOnAction(e->{
         display.setText(display.getText()+"5");
       });
       btn6.setOnAction(e->{
          display.setText(display.getText()+"6");
       });
        btn7.setOnAction(e->{
         display.setText(display.getText()+"7");  
        });
       btn8.setOnAction(e->{
         display.setText(display.getText()+"8");
       });
       btn9.setOnAction(e->{
          display.setText(display.getText()+"9");
       });
       btn10.setOnAction(e->{
       firstnum=Double.parseDouble (display.getText());
       operator ="+";
       display.clear();
       });
       btn11.setOnAction(e->{
          firstnum= Double.parseDouble(display.getText());
          operator ="-";
          display.clear();
       });
      btn12.setOnAction(e->{
       firstnum=Double.parseDouble (display.getText());
       operator ="*";
       display.clear();
       });
       btn13.setOnAction(e->{
          firstnum= Double.parseDouble(display.getText());
          operator ="/";
          display.clear();
       });
      btn14.setOnAction(e->{
       firstnum=Double.parseDouble (display.getText());
       operator ="%";
       display.clear();
       });
       btn15.setOnAction(e->{
          operator ="C";
          display.clear();
       });
       btn16.setOnAction(e->{
      double secondnum=Double.parseDouble (display.getText());
      double result =0.0;
      if(operator=="+")
      {
          result =firstnum+secondnum;
      }
      else if(operator=="-")
      {
          result =firstnum-secondnum;
      }
     else if(operator=="*")
      {
          result =firstnum*secondnum;
      }
     else if(operator=="/")
      {
          result =firstnum/secondnum;
      }
     else if(operator=="%")
      {
          result =firstnum%secondnum;
      }
      display.setText(String.valueOf(result));
       });
       VBox root=new VBox(20,display,grid);
       Scene scene=new Scene(root,300,400);
       primaryStage.setScene(scene);
        primaryStage.show();
       }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
