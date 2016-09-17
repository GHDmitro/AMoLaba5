package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by macbookair on 10.05.16.
 */
public class Controller2 {
    public TextField fieldX00;
    public TextField fieldX01;
    public TextField fieldX11;
    public TextField fieldX02;
    public TextField fieldX12;
    public TextField fieldX10;
    public TextField fieldX03;
    public TextField fieldX13;
    public TextField fieldX20;
    public TextField fieldX21;
    public TextField fieldX22;
    public TextField fieldX23;
    public TextField fieldX30;
    public TextField fieldX31;
    public TextField fieldX32;
    public TextField fieldX33;
    public TextField fieldX04;
    public TextField fieldX14;
    public TextField fieldX24;
    public TextField fieldX34;
    public TextField fieldX40;
    public TextField fieldX41;
    public TextField fieldX42;
    public TextField fieldX43;
    public TextField fieldX44;
    public TextField fieldX05;
    public TextField fieldX15;
    public TextField fieldX25;
    public TextField fieldX35;
    public TextField fieldX45;


    public void actionTakeData(ActionEvent actionEvent) throws IOException {

        Algorithm algorithm = Algorithm.getInstance();
        HashMap<String, Double> map = new HashMap<>();
        int countN = algorithm.getCount();
        if (countN == 2) {
            map.put("00", Double.parseDouble(fieldX00.getText()));
            map.put("01", Double.parseDouble(fieldX01.getText()));
            map.put("02", Double.parseDouble(fieldX02.getText()));
            map.put("10", Double.parseDouble(fieldX10.getText()));
            map.put("11", Double.parseDouble(fieldX11.getText()));
            map.put("12", Double.parseDouble(fieldX12.getText()));
        }else if (countN == 3){
//            map.put("00", fieldX00.getText());
//            map.put("01", fieldX01.getText());
//            map.put("02", fieldX02.getText());
//            map.put("10", fieldX10.getText());
//            map.put("11", fieldX11.getText());
//            map.put("12", fieldX12.getText());
//            map.put("03", fieldX03.getText());
//            map.put("13", fieldX13.getText());
//            map.put("20", fieldX20.getText());
//            map.put("21", fieldX21.getText());
//            map.put("22", fieldX22.getText());
//            map.put("23", fieldX23.getText());

            map.put("00", Double.parseDouble(fieldX00.getText()));
            map.put("01", Double.parseDouble(fieldX01.getText()));
            map.put("02", Double.parseDouble(fieldX02.getText()));
            map.put("10", Double.parseDouble(fieldX10.getText()));
            map.put("11", Double.parseDouble(fieldX11.getText()));
            map.put("12", Double.parseDouble(fieldX12.getText()));
            map.put("03", Double.parseDouble(fieldX03.getText()));
            map.put("13", Double.parseDouble(fieldX13.getText()));
            map.put("20", Double.parseDouble(fieldX20.getText()));
            map.put("21", Double.parseDouble(fieldX21.getText()));
            map.put("22", Double.parseDouble(fieldX22.getText()));
            map.put("23", Double.parseDouble(fieldX23.getText()));
//        Iterator iter = map.entrySet().iterator();
//        int lrnthMap = 0;
//        while (iter.hasNext()){
//            Map.Entry<String, String> entry = (Map.Entry<String, String>) iter.next();
//            if (entry.getValue() != null){
//                lrnthMap++;
//            }
//        }
        }else if(countN == 4){
            map.put("00", Double.parseDouble(fieldX00.getText()));
            map.put("01", Double.parseDouble(fieldX01.getText()));
            map.put("02", Double.parseDouble(fieldX02.getText()));
            map.put("10", Double.parseDouble(fieldX10.getText()));
            map.put("11", Double.parseDouble(fieldX11.getText()));
            map.put("12", Double.parseDouble(fieldX12.getText()));
            map.put("03", Double.parseDouble(fieldX03.getText()));
            map.put("13", Double.parseDouble(fieldX13.getText()));
            map.put("20", Double.parseDouble(fieldX20.getText()));
            map.put("21", Double.parseDouble(fieldX21.getText()));
            map.put("22", Double.parseDouble(fieldX22.getText()));
            map.put("23", Double.parseDouble(fieldX23.getText()));
            map.put("04", Double.parseDouble(fieldX04.getText()));
            map.put("14", Double.parseDouble(fieldX14.getText()));
            map.put("24", Double.parseDouble(fieldX24.getText()));
            map.put("34", Double.parseDouble(fieldX34.getText()));
            map.put("30", Double.parseDouble(fieldX30.getText()));
            map.put("31", Double.parseDouble(fieldX31.getText()));
            map.put("32", Double.parseDouble(fieldX32.getText()));
            map.put("33", Double.parseDouble(fieldX33.getText()));
        }else if (countN == 5){
            map.put("00", Double.parseDouble(fieldX00.getText()));
            map.put("01", Double.parseDouble(fieldX01.getText()));
            map.put("02", Double.parseDouble(fieldX02.getText()));
            map.put("10", Double.parseDouble(fieldX10.getText()));
            map.put("11", Double.parseDouble(fieldX11.getText()));
            map.put("12", Double.parseDouble(fieldX12.getText()));
            map.put("03", Double.parseDouble(fieldX03.getText()));
            map.put("13", Double.parseDouble(fieldX13.getText()));
            map.put("20", Double.parseDouble(fieldX20.getText()));
            map.put("21", Double.parseDouble(fieldX21.getText()));
            map.put("22", Double.parseDouble(fieldX22.getText()));
            map.put("23", Double.parseDouble(fieldX23.getText()));
            map.put("04", Double.parseDouble(fieldX04.getText()));
            map.put("14", Double.parseDouble(fieldX14.getText()));
            map.put("24", Double.parseDouble(fieldX24.getText()));
            map.put("34", Double.parseDouble(fieldX34.getText()));
            map.put("30", Double.parseDouble(fieldX30.getText()));
            map.put("31", Double.parseDouble(fieldX31.getText()));
            map.put("32", Double.parseDouble(fieldX32.getText()));
            map.put("33", Double.parseDouble(fieldX33.getText()));

            map.put("40", Double.parseDouble(fieldX40.getText()));
            map.put("41", Double.parseDouble(fieldX41.getText()));
            map.put("42", Double.parseDouble(fieldX42.getText()));
            map.put("43", Double.parseDouble(fieldX43.getText()));
            map.put("44", Double.parseDouble(fieldX44.getText()));
            map.put("45", Double.parseDouble(fieldX45.getText()));
            map.put("35", Double.parseDouble(fieldX35.getText()));
            map.put("25", Double.parseDouble(fieldX25.getText()));
            map.put("15", Double.parseDouble(fieldX15.getText()));
            map.put("05", Double.parseDouble(fieldX05.getText()));
        }


        if (countN == 0){
            System.out.println("---------------------------------");
        }
        double [][] matrix = new double[countN][countN + 1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < (countN); i++) {
            for (int j = 0; j < (countN + 1); j++) {
                if (sb.length() != 0) {
                    sb.delete(0, sb.length());
                }
                sb.append(i).append(j);
                Double number = Double.valueOf(map.get(sb.toString()));
                System.out.println(number);
                if (number != null){
                    matrix[i][j] = number;
                }else {

//                    Stage stage = new Stage();
//                    Parent root = FXMLLoader.load(getClass().getResource("count.fxml"));
//                    stage.setTitle("Задание колличетсва уравнений");
//                    stage.setMinHeight(300);
//                    stage.setMinWidth(300);
//                    stage.setResizable(false);
//                    stage.setScene(new Scene(root));
//                    stage.initModality(Modality.WINDOW_MODAL);
//                    stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
//                    stage.show();
//
//                    textArea.setText("Неправильно введены данные");

                    return;
                }
            }
        }
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"       ");
            }
            System.out.println();
        }
        algorithm.getXarray(matrix);

        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
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
