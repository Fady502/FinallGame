import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NumberGuessingGameGUI extends Application {

    private Game game;
    private Menu menu;
    private Player player;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Number Guessing Game");

        // Initialize game components
        game = new Game();
        menu = new Menu();
        player = new Player("Player 1");

        // Create main menu window
        VBox mainMenuLayout = new VBox(10);
        Button newGameButton = new Button("New Game");
        Button savedGameButton = new Button("Saved Game");

        newGameButton.setOnAction(e -> {
            // Display game mode selection window
            displayGameModeSelection();
        });

        savedGameButton.setOnAction(e -> {
            // Display saved games window
            displaySavedGames();
        });

        mainMenuLayout.getChildren().addAll(newGameButton, savedGameButton);
        Scene mainMenuScene = new Scene(mainMenuLayout, 300, 200);

        primaryStage.setScene(mainMenuScene);
        primaryStage.show();
    }

    private void displayGameModeSelection() {
        // Create and display game mode selection window
    }

    private void displaySavedGames() {
        // Create and display saved games window
    }

    public static void main(String[] args) {
        launch(args);
    }
}
