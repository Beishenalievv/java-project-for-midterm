package MainClass;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;

import javafx.scene.Scene;

import javafx.scene.image.Image;

import javafx.stage.Stage;

import javafx.stage.StageStyle;

/**

 *

 * @author UpToDate

 */

public class RandomNumberGenerator extends Application {

    @Override

    public void start(Stage stage) throws Exception {

        try {

            Parent root = FXMLLoader.load(getClass().getResource("app.fxml"));

            Scene scene = new Scene(root);

            stage.initStyle(StageStyle.UNDECORATED);

            stage.setScene(scene);

            stage.getIcons().add(new Image(getClass()

                    .getResourceAsStream("dice.png")));

            stage.show();

        } catch (Exception e) {

            System.out.println(e);

            e.printStackTrace();

            System.exit(0);

        }

    }

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        launch(args);

    }

}
