package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
public class Controller {
    public GridPane gridPaneInsert;
    public GridPane gridPaneTriangle;
    public GridPane gridPaneResault;
    public TextArea textArea;
    private Stage stage;
    private Parent root;
    private double matrix[][];
    @FXML
    public void initialize() {
        Algorithm algorithm = Algorithm.getInstance();
        double[][] matrix = algorithm.getA();
        double[][] teangleMatrix = algorithm.getQ();
        Double[] X = algorithm.getX();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                Label lable = null;
                Label lable2 = null;
                double p = matrix[i][j];
                if (j < (matrix[0].length - 2)) {
                    lable = new Label(algorithm.round(p) + " X" + String.valueOf(j) + " + ");
                    lable2 = new Label(algorithm.round(p) + " X" + String.valueOf(j) + " + ");
                } else if (j == (matrix[0].length - 2)) {
                    lable = new Label(algorithm.round(p) + " X" + String.valueOf(j));
//                    lable2 = new Label(String.valueOf(matrix[i][j]) + " X" + String.valueOf(j));
                    lable2 = new Label(algorithm.round(p) + " X" + String.valueOf(j));

                } else {
                    lable = new Label(" = " + algorithm.round(matrix[i][j]));
                    lable2 = new Label(" = " + algorithm.round(matrix[i][j]));
                }
                lable.setStyle("-fx-font-size: 20px");
                lable2.setStyle("-fx-font-size: 20px");
                gridPaneInsert.add(lable, j, i);

                if (j >= i) {
                    gridPaneTriangle.add(lable2, j, i);
                }
            }
            Double d = X[i];
            Label lable1 = null;
            boolean t = false;
            if (d != null) {
                lable1 = new Label("X = " + algorithm.round(d));
            }else {
                lable1 = new Label("X = " + "C");
                t = true;
            }
            if (t){
                textArea.setText("Система уравнений имеет свободные корни члены С, посчитать все корни нельзя, введите другие данные");
            }
            lable1.setStyle("-fx-font-size: 20px");
            gridPaneResault.add(lable1, 0, i);
            t = false;
        }
    }
    public void actionAddNewForm(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("count.fxml"));
        stage.setTitle("Задание матрицы");
        stage.setMinHeight(300);
        stage.setMinWidth(300);
        stage.setResizable(false);
        stage.setScene(new Scene(root));
//        stage.initModality(Modality.WINDOW_MODAL);
//        stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.show();
        Node source = (Node) actionEvent.getSource();
        Stage stage1 = (Stage) source.getScene().getWindow();
        stage1.close();
    }


}
