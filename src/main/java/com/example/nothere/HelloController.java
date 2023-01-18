package com.example.nothere;

import com.example.DataBase.DataBasee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    DataBasee dataBase;
    @FXML
    private TextField title;
    @FXML
    private TextField id;
    @FXML
    private TextField author;
    @FXML
    private TextField publisher;
    @FXML
    private Button saveButton;
    @FXML
    private Button cancelButton;


    @FXML
    public void initialize(URL url , ResourceBundle resourceBundle)
    {
        // TODO
    }
    @FXML
    private void addBook(ActionEvent event)
    {
        // TODO
        Stage newStage = new Stage();
        Group group = new Group();
        Scene scene = new Scene(group,300,100);

        dataBase = new DataBasee();
        String idn = id.getText();
        String name = title.getText();
        String auther = author.getText();
        String publish = publisher.getText();
        int idNo = Integer.parseInt(idn);
        // add the databases 
        int result = dataBase.addBook(idNo , name , auther , publish);
        if(result!=0)
        {
            newStage.setTitle("Added the book");
            Label label = new Label("کتاب په بریالی توګه اضافه شو");

            group.getChildren().add(label);
            newStage.setScene(scene);
            newStage.show();

        }
        else {
            newStage.setTitle("The book is not added");
            Label label = new Label("کتاب نشو اضافه");

            group.getChildren().add(label);
            newStage.setScene(scene);
            newStage.show();

        }




    }
    @FXML
    private void cancel(ActionEvent event)
    {
        cancelButton.setCancelButton(true);
        System.exit(0);
    }

}
