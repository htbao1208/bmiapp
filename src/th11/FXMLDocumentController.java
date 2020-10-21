/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th11;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author kid03
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML private TextField soCao;
    @FXML private TextField soNang;
    @FXML private Text kQ;
    
    @FXML private void handleTinh (ActionEvent event){
        double cao = Double.parseDouble(soCao.getText());
        double nang  = Double.parseDouble(soNang.getText());
        
        double result = nang/Math.pow(cao, 2);
        
        kQ.setText(String.valueOf(result));
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
