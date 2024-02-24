//Fady Zaki SDEV200 2/24/2024

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GameModeSelectionWindow {

    public static void display(Game game) {
        Stage window = new Stage();
        window.setTitle("Select Game Mode");

        VBox layout = new VBox(10);
        Button simpleButton = new Button("Simple");
        Button standardButton = new Button("Standard");
        Button difficultButton = new Button("Difficult");

        simpleButton.setOnAction(e -> {
            game.startNewGame(game.getPlayerName(), "Simple");
            window.close();
        });

        standardButton.setOnAction(e -> {
            game.startNewGame(game.getPlayerName(), "Standard");
            window.close();
        });

        difficultButton.setOnAction(e -> {
            game.startNewGame(game.getPlayerName(), "Difficult");
            window.close();
        });

        layout.getChildren().addAll(simpleButton, standardButton, difficultButton);
        Scene scene = new Scene(layout, 300, 200);

        window.setScene(scene);
        window.showAndWait(); 
    }
}
