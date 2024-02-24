import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class NumberGuessingGame extends Application {

    private Game game;
    private Menu menu;
    private TextField nameInput;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Number Guessing Game");

        game = new Game();
        menu = new Menu();


        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label nameLabel = new Label("Player Name:");
        GridPane.setConstraints(nameLabel, 0, 0);

        nameInput = new TextField();
        nameInput.setPromptText("Enter your name");
        GridPane.setConstraints(nameInput, 1, 0);

        Button newGameButton = new Button("New Game");
        GridPane.setConstraints(newGameButton, 1, 1);
        newGameButton.setOnAction(e -> startNewGame());

        Button savedGameButton = new Button("Saved Game");
        GridPane.setConstraints(savedGameButton, 1, 2);
        savedGameButton.setOnAction(e -> loadSavedGame());


        grid.getChildren().addAll(nameLabel, nameInput, newGameButton, savedGameButton);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void startNewGame() {
        String playerName = nameInput.getText();

    }

    private void loadSavedGame() {
   
    }
}
