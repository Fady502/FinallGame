private void startNewGame() {
    String playerName = nameInput.getText();


    Stage modeSelectionStage = new Stage();
    modeSelectionStage.setTitle("Select Game Mode");

    VBox modeSelectionBox = new VBox(10);
    modeSelectionBox.setPadding(new Insets(10));

    Label modeLabel = new Label("Select Game Mode:");
    ComboBox<String> modeComboBox = new ComboBox<>();
    modeComboBox.getItems().addAll("Simple", "Standard", "Difficult");
    modeComboBox.setValue("Simple");

    Button startButton = new Button("Start Game");
    startButton.setOnAction(e -> {
        String selectedMode = modeComboBox.getValue();
        game.startNewGame(playerName, selectedMode);
        modeSelectionStage.close();

    });

    modeSelectionBox.getChildren().addAll(modeLabel, modeComboBox, startButton);

    Scene modeSelectionScene = new Scene(modeSelectionBox, 250, 150);
    modeSelectionStage.setScene(modeSelectionScene);
    modeSelectionStage.show();
}
