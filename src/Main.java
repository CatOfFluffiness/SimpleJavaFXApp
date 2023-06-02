import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;

public class Main extends Application{

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) {

        // установка надписи
        Text text = new Text("Hello world!");
        text.setLayoutX(110);     // установка положения надписи по оси X
        text.setLayoutY(100);    // установка положения надписи по оси Y

        Group group = new Group(text);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("JavaFX App");
        stage.setHeight(250);
        stage.setWidth(300);
        stage.show();
    }
}