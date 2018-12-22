package ui;

import ui.MenuInterface.MenuFileListener;
import ui.MenuInterface.MenuHelpListener;
import ui.MenuInterface.MenuRunListener;

import java.awt.*;

/**
 * Created by Alex on 2018.11.20
 */
public class CompilerMenu extends MenuBar {

    private MenuItem fileNew, fileOpen, fileSave, fileExit;
    private MenuItem runRun, runDebug,runLex;
    private MenuItem helpAbout;

    public CompilerMenu(){
        Menu menuFile = new Menu("File");
        Menu menuRun = new Menu("Run");
        Menu menuHelp = new Menu("Help");

        fileNew = new MenuItem("New File");
        fileOpen = new MenuItem("Open File");
        fileSave = new MenuItem("Save File");
        fileExit = new MenuItem("Exit");

        menuFile.add(fileNew);
        menuFile.add(fileOpen);
        menuFile.addSeparator();
        menuFile.add(fileSave);
        menuFile.addSeparator();
        menuFile.add(fileExit);

        runRun = new MenuItem("Run");
        runDebug = new MenuItem("Debug");
        runLex=new MenuItem("Lexing analysis");

        menuRun.add(runRun);
        menuRun.add(runDebug);
        menuRun.add(runLex);

        helpAbout = new MenuItem("About");
        menuHelp.add(helpAbout);

        add(menuFile);add(menuRun);add(menuHelp);
    }

    void addMenuFileListener(MenuFileListener menuFileListener){
        fileNew.addActionListener(menuFileListener::setNewFileListener);
        fileOpen.addActionListener(menuFileListener::setOpenFileListener);
        fileSave.addActionListener(menuFileListener::setSaveFileListener);
        fileExit.addActionListener(menuFileListener::setExitListener);
    }

    void addMenuRunListener(MenuRunListener menuRunListener){
        runRun.addActionListener(menuRunListener::setRunListener);
        runDebug.addActionListener(menuRunListener::setDebugListener);
        runLex.addActionListener(menuRunListener::setLexListener);
    }

    void addMenuHelpListener(MenuHelpListener menuHelpListener){
        helpAbout.addActionListener(menuHelpListener::setAboutListener);
    }
}
