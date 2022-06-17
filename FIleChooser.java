import java.util.*;
import java.util.stream.IntStream;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import java.io.*;
import javafx.scene.control.TextArea;


public class FileChooser extends  Application {
    @Override
    public void start(Stage stage) throws Exception {
        StackPane pane=new StackPane();
        FileChooser file=new FileChooser();
        File file1=file.showOpenDialog(stage);
        Scanner c=new Scanner(file1);
        String s="";
        while (c.hasNext()){
            String q=c.nextLine();
            s+=q+"\n";
        }
        TextArea area=new TextArea(s);
        area.setPrefWidth(800);
        area.setPrefHeight(800);

        pane.getChildren().add(area);
        Scene scene=new Scene(pane);
        stage.setTitle("lab6");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String []args){
        launch(args);

    }
}