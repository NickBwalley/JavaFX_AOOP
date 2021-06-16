/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author nickbwalley
 */
public class LoginForm1 extends Application {
    
    @Override
    public void start(Stage my_Stage) {
        //LABELS
        Text name_label=new Text("User Name");
        Text pass_label=new Text("Password"); 
        
        //TEXT FIELDS
        TextField uname_tf=new TextField();
        
        //PASSWORD FIELD
        PasswordField pass_field = new PasswordField();
        
        //BUTTONS
        Button login_btn = new Button("Login");
        Button cncl_btn = new Button("Cancel");
        
        //IMAGE
        ImageView logo_img = new ImageView();  
        Image my_image = new Image(LoginForm1.class.getResourceAsStream("img.jpg"));
        
        logo_img.setImage(my_image); 
        logo_img.setX(10);
        logo_img.setY(10);
        logo_img.setFitWidth(50);
        logo_img.setPreserveRatio(true);
        
        //GRID PANE
        GridPane gridPane = new GridPane();
        
        gridPane.add(name_label,1,1);
        gridPane.add(pass_label,1,2);
        gridPane.add(uname_tf,2,1);
        gridPane.add(pass_field,2,2);
        gridPane.add(login_btn,1,3);
        gridPane.add(cncl_btn,2,3);
        gridPane.add(logo_img, 1, 0);       
        
        
        gridPane.setMinSize(600,300);
        
        gridPane.setVgap(10);
        
        gridPane.setHgap(20);
        
        gridPane.setAlignment(Pos.CENTER);
        
        my_Stage.setTitle("Login Group B");
        
        Scene my_scene = new Scene(gridPane);
        
        my_Stage.setScene(my_scene);
        
        my_Stage.show();
        
 
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}