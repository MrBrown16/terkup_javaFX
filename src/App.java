import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception  {
        Label header = new Label("Kúp Térfogatszámítása");
        Label radiusL = new Label("A kúp alapjának a sugara: ");
        TextField radiusIn = new TextField();
        Label heightL = new Label("A kúp magassága: ");
        TextField heightIn = new TextField();
        Button sub = new Button("Kiszámol");
        String lab = "A kúp térfogata: ";

        HBox head = new HBox();
        head.getChildren().add(header);
        head.setAlignment(Pos.CENTER);
        HBox row1 = new HBox();
        row1.getChildren().addAll(radiusL,radiusIn);
        head.setAlignment(Pos.CENTER);

        HBox row2 = new HBox();
        row2.getChildren().addAll(heightL,heightIn);
        head.setAlignment(Pos.CENTER);

        HBox butt = new HBox();
        head.setAlignment(Pos.CENTER);

        HBox res = new HBox();
        butt.getChildren().add(sub);
    
        VBox vBox = new VBox();
        vBox.getChildren().addAll(head,row1,row2,butt,res);
        Scene scene = new Scene(vBox, 500, 400);

        stage.setScene(scene);
        stage.show();

        sub.setOnAction(e -> {
            String radiusStr = radiusIn.getText();
            Double radiusnum = Double.parseDouble(radiusStr);
            String heightStr = heightIn.getText();
            Double heightnum = Double.parseDouble(heightStr);

            Double volume = 1.0 * 1/3 * (radiusnum * radiusnum) * Math.PI * heightnum;
            
            Label resultmsg = new Label();
            resultmsg.setText(lab+volume);
            //lab+volume.toString();
            res.getChildren().add(resultmsg);
        });
    }
}
