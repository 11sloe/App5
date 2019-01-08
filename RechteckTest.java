import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

public class RechteckTest extends Application
{
      @Override public void start(Stage primaryStage)
    {

        Group group1 = new Group();

        // A rectangle
        Rectangle r1 = new Rectangle(50,25,100,140);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.GREEN);
        r1.setStrokeWidth(3);
        group1.getChildren().add(r1);

        // A rounded rectangle
        Rectangle r2 = new Rectangle(250,25,100,140);
        r2.setStroke(Color.BLACK);
        r2.setFill(Color.BLUE);
        r2.setStrokeWidth(3);
        r2.setArcWidth(25);
        r2.setArcHeight(25);
        group1.getChildren().add(r2);		

        // Another rounded rectangle
        Rectangle r3 = new Rectangle(450,25,100,140);
        r3.setStroke(Color.BLACK);
        r3.setFill(Color.PURPLE);
        r3.setStrokeWidth(3);
        r3.setArcWidth(75);
        r3.setArcHeight(125);
        group1.getChildren().add(r3);

        // Auf MouseEvents reagieren:
        r1.setOnMouseClicked(e -> r1.setFill(Color.RED));
        r2.setOnMouseClicked(e -> r2.setStrokeWidth(7));
        r3.setOnMouseClicked(e -> r3.setY(150));

        // Create the scene and the stage
        Scene scene = new Scene(group1, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Shape Maker");
        primaryStage.show();

    }

}
