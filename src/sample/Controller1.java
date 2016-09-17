package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
public class Controller1 {
    public TextField fieldN;
    public void actionConfirm(ActionEvent actionEvent) throws IOException {
        String strn = fieldN.getText();
        if (strn != null){
            int count = Integer.valueOf(strn);
            Algorithm algorithm = Algorithm.getInstance();
            Stage stage;
            Parent root;
            switch (count) {
                case 2:
                    algorithm.setCount(count);
                    stage = new Stage();
                    root = FXMLLoader.load(getClass().getResource("twoNatwo.fxml"));
                    stage.setTitle("Задание матрицы");
                    stage.setMinHeight(300);
                    stage.setMinWidth(300);
                    stage.setResizable(false);
                    stage.setScene(new Scene(root));
//                    stage.initModality(Modality.WINDOW_MODAL);
//                    stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
                    stage.show();
                    break;
                case 3:
                    algorithm.setCount(count);
                    stage = new Stage();
                    root = FXMLLoader.load(getClass().getResource("threeNathree.fxml"));
                    stage.setTitle("Задание матрицы");
                    stage.setMinHeight(300);
                    stage.setMinWidth(300);
                    stage.setResizable(false);
                    stage.setScene(new Scene(root));
//                    stage.initModality(Modality.WINDOW_MODAL);
//                    stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
                    stage.show();
                    break;
                case 4 :
                    algorithm.setCount(count);
                    stage = new Stage();
                    root = FXMLLoader.load(getClass().getResource("fourNafour.fxml"));
                    stage.setTitle("Задание матрицы");
                    stage.setMinHeight(400);
                    stage.setMinWidth(400);
                    stage.setResizable(false);
                    stage.setScene(new Scene(root));
//                    stage.initModality(Modality.WINDOW_MODAL);
//                    stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
                    stage.show();
                    break;
                case 5 :
                    algorithm.setCount(count);
                    stage = new Stage();
                    root = FXMLLoader.load(getClass().getResource("fiveNafive.fxml"));
                    stage.setTitle("Задание матрицы");
                    stage.setMinHeight(500);
                    stage.setMinWidth(500);
                    stage.setResizable(false);
                    stage.setScene(new Scene(root));
//                    stage.initModality(Modality.WINDOW_MODAL);
//                    stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
                    stage.show();
                    break;
                default:
                    algorithm.setCount(count);
                    stage = new Stage();
                    root = FXMLLoader.load(getClass().getResource("count.fxml"));
                    stage.setTitle("Задание матрицы");
                    stage.setMinHeight(300);
                    stage.setMinWidth(300);
                    stage.setResizable(false);
                    stage.setScene(new Scene(root));
//                    stage.initModality(Modality.WINDOW_MODAL);
//                    stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
                    stage.show();
                    break;
            }
        }
        Node source = (Node) actionEvent.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
