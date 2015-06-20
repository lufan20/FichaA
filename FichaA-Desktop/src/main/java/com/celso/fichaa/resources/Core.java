/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celso.fichaa.resources;

import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Celso
 */
public abstract class Core extends Application {

    Controller controller;
    Stage primaryStage;
    public Scene scene;
    private AnchorPane personOverview;
    private String title;
    FXMLLoader loader;

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle(inserirTitulo());

        this.initComponents();

        this.primaryStage.initStyle(getStyle());
        this.primaryStage.setResizable(isResisable());
        this.primaryStage.setMaximized(this.isMaximixed());

        this.primaryStage.setScene(scene);
        this.primaryStage.centerOnScreen();
        this.primaryStage.show();
    }

    public void initComponents() throws IOException {
        URL basico = inserirAsset();

        loader = new FXMLLoader();
        loader.setLocation(basico);

        personOverview = (AnchorPane) loader.load();

        controller = loader.getController();
        controller.setMain(this);
        controller.setStage(primaryStage);

        scene = new Scene(this.personOverview);
    }

    public String inserirTitulo(){
        return "";
    }

    public abstract URL inserirAsset();

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public AnchorPane getPersonOverview() {
        return personOverview;
    }

    public void setPersonOverview(AnchorPane personOverview) {
        this.personOverview = personOverview;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StageStyle getStyle() {
        return StageStyle.UNDECORATED;
    }

    public boolean isResisable() {
        return false;
    }

    public boolean isMaximixed() {
        return false;
    }

    public FXMLLoader getLoader() {
        return loader;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
