package de.whs.mcim.knokehelmes_preisumrechner;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup; 
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;

public class PreisumrechnerController implements Initializable {
    


    @FXML
    private Label labBrutto;
    @FXML
    private Label labNetto;
    @FXML
    private Label labLiterpreis;
    @FXML
    private Label labFlaPreis;
    @FXML
    private Label labFlaGroesse;
    @FXML
    private ToggleGroup Steuersatz;
    @FXML
    private TextField FlaPreisNetto;
    @FXML
    private ComboBox<String> FlaGroesseBox;
    @FXML
    private TextField LiterpreisNetto;
    @FXML
    private TextField FlaPreisBrutto;
    @FXML
    private TextField LiterpreisBrutto;
    @FXML
    private RadioButton radButMwst16;
    @FXML
    private RadioButton radButMwst19;
    @FXML
    private Button butLiterrechner;
    @FXML
    private Button butFlaschenrechner;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FlaGroesseBox.getItems().setAll("0,187 l","0,25 l", "0,375 l", "0,5 l", "0,62 l", "0,7 l", "0,75 l", "0,8 l", "1 l", "1,5 l");
        butLiterrechner.setOnAction(new EventHandler<ActionEvent>() {
    @Override public void handle(ActionEvent e) {
        umrechnen();
    }
});
//        umrechnen();
        
 
    
    }   

    public void umrechnen(){
        String ausgewaehlteGroesse = FlaGroesseBox
                .getSelectionModel().getSelectedItem();

        ausgewaehlteGroesse = ausgewaehlteGroesse
                .substring(0, ausgewaehlteGroesse.length() - 2);
        ausgewaehlteGroesse = ausgewaehlteGroesse.replace(',', '.'); 
        double umrechner = 1 / Double.parseDouble(ausgewaehlteGroesse);
        double nettopreis = Double.parseDouble(FlaPreisNetto.getText());
        umrechner = (int)(umrechner * nettopreis * 100);
        umrechner = umrechner / 100;
//        LiterpreisNetto.setEditable(true);
        LiterpreisNetto.setText(umrechner + "");
        double bruttopreis = nettopreis
        LiterpreisBrutto.setText()
    }
}




//        FlaGroesseBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
//      @Override 
//      public void changed(ObservableValue<? extends String> selected, String oldFruit, String newFruit) {
//
//      }
//    });