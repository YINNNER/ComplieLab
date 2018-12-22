package ui;

import java.awt.event.ActionEvent;

/**
 * Created by Alex on 2018.11.20
 */
public interface MenuInterface {

    interface MenuFileListener {
        void setNewFileListener(ActionEvent event);
        void setOpenFileListener(ActionEvent event);
        void setSaveFileListener(ActionEvent event);
        void setExitListener(ActionEvent event);
    }

    interface MenuRunListener {
        void setRunListener(ActionEvent event);
        void setDebugListener(ActionEvent event);
        void setLexListener(ActionEvent event);
    }

    interface MenuHelpListener {
        void setAboutListener(ActionEvent event);
    }
}
