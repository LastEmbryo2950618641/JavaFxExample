package showDateTime;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button btn;

    @FXML
    private TextField txt;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void showTime(ActionEvent event){
        System.out.println("btn click");

        Date date=new Date();
        DateFormat df= new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
        String format = df.format(date);
        txt.setText(format);
    }
}
