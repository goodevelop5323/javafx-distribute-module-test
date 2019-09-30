package test;

import javafx.application.Application;
import javafx.stage.Stage;


public class TestApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello");
        primaryStage.setWidth(300);
        primaryStage.setHeight(200);
        primaryStage.show();
    }
}
