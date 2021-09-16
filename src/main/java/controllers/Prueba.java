package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Prueba implements Initializable {
    public TextField textDel;
    @FXML
    private ListView<String> textView;
    @FXML
    private TextField textNombre;
    @FXML
    private ComboBox combo;
    @FXML
    private Button botonADD;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List Lista = new ArrayList();
    }

    @FXML
    private void addNombre(){
        String nombres= textNombre.getText();

        textView.getItems().add(nombres);
    }

    public void delNombre(ActionEvent actionEvent) {
        /*String nombre= textView.getSelectionModel().getSelectedItem();*/
        String nombre=textDel.getText();

        textView.getItems().remove(nombre);
    }
}
