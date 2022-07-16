package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class Main extends Application {
final static String one = "Tampa Bay";
final static String two = "Winnipeg";
final static String three = "Nashville";
final static String four = "Detroit";
final static String five = "Los Angeles";
final static String six = "Boston";
final static String seven = "Toronto";
public void start(Stage stage) throws Exception {
final NumberAxis xAxis = new NumberAxis();
final CategoryAxis yAxis = new CategoryAxis();
final BarChart<Number,String> barChart =
new BarChart<Number,String>(xAxis,yAxis);

  
xAxis.setTickLabelRotation(90);
  

XYChart.Series chart = new XYChart.Series();
chart.setName("Count");   
chart.getData().add(new XYChart.Data(319, one));
chart.getData().add(new XYChart.Data(270, two));
chart.getData().add(new XYChart.Data(236, three));
chart.getData().add(new XYChart.Data(224, four));
chart.getData().add(new XYChart.Data(199, five));
chart.getData().add(new XYChart.Data(257, six));
chart.getData().add(new XYChart.Data(286, seven));
  

  
Scene scene = new Scene(barChart,800,600);
barChart.getData().addAll(chart);
stage.setScene(scene);
stage.show();
}

public static void main(String[] args) {
launch(args);
}
  
}