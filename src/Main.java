import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import acsse.csc2a.gui.MyPane;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        MyPane RootNode = new MyPane();

        stage.setScene(new Scene(RootNode, 300, 300));
        stage.show();
    }

    private Parent createContent(){
        return new StackPane(new Text("Hello World"));
    }
}