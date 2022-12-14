package com.vicnetto.javafx2048.controller;

import com.vicnetto.javafx2048.model.GameInformation;
import com.vicnetto.javafx2048.view.GameInformationView;

public class GameInformationController {

    private GameInformation gameInformation;

    public GameInformationController(GameInformationView gameInformationView, GameInformation gameInformation) {
        setView(gameInformationView, gameInformation);
    }

    private void setView(GameInformationView gameInformationView, GameInformation gameInformation) {
        this.gameInformation = gameInformation;

        gameInformationView.getScoreText().textProperty().bind(gameInformation.scoreProperty().asString());
        gameInformationView.getWinsText().textProperty().bind(gameInformation.winsProperty().asString());
        gameInformationView.getAttemptsText().textProperty().bind(gameInformation.attemptsProperty().asString());
        gameInformationView.getBestScoreText().textProperty().bind(gameInformation.bestScoreProperty().asString());
    }

    public GameInformation getGameInformation() {
        return gameInformation;
    }
}
