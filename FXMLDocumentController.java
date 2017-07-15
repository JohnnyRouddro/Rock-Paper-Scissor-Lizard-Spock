import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {
    
    Game game = new Game();
    
    @FXML
    private Label label;
    
    @FXML
    private void rockAction(ActionEvent event) {
        label.setText("You chose Rock.\n" + game.getResult(1));
    }
    @FXML
    private void paperAction(ActionEvent event) {
        label.setText("You chose Paper.\n" + game.getResult(2));
    }
    @FXML
    private void scsrAction(ActionEvent event) {
        label.setText("You chose Scissor.\n" + game.getResult(3));
    }
    @FXML
    private void lizAction(ActionEvent event) {
        label.setText("You chose Lizard.\n" + game.getResult(4));
    }
    @FXML
    private void spockAction(ActionEvent event) {
        label.setText("You chose Spock.\n" + game.getResult(5));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
