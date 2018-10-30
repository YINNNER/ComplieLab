package UI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import Interpreter.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.StringReader;

import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class display {
    @FXML
    private AnchorPane Pane1;
    @FXML
    private TextArea textAreaLex;
    @FXML
    private TextArea textAreaSyn;
    @FXML
    private  TextArea textAreaSem;
    @FXML
    private  TextArea textAreaCode;
    @FXML
    private  TextArea textAreaErr;

    @FXML
    private Button btnLex;
    @FXML
    private Button btnSyn;
    @FXML
    private Button btnSem;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnExit;
    @FXML
    private TabPane tabPane1;
    @FXML
    private Tab tab1;
    @FXML
    private Tab tab2;
    @FXML
    private Tab tab3;

    StringReader content = new StringReader("this is ");
    BufferedReader br = new BufferedReader(content);
    compiler com = new compiler(br);

    public display() throws ParseException {
    }

    @FXML
    private void btnExitClicked(ActionEvent event){
        System.exit(0);

    }

    @FXML
    private void btnClearClicked(ActionEvent event){
        textAreaCode.setText("");
        textAreaLex.setText("");
        textAreaSem.setText("");
        textAreaSyn.setText("");
        textAreaErr.setText("");
    }


    @FXML
    private void btnLexClicked(ActionEvent event) throws Exception {
        textAreaErr.setText("");
        textAreaLex.setText("");
        tab1.isSelected();
        StringReader content = new StringReader(textAreaCode.getText());
        if (textAreaCode.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Input CMM Source Code !");
        } else {
            BufferedReader br = new BufferedReader(content);
            compiler.ReInit(br);
            textAreaLex.setText(com.Lexical());
          showLexicalErr();
        }
    }

    private void showLexicalErr() throws FileNotFoundException {
        textAreaErr.setText("");
        StringReader content = new StringReader(textAreaCode.getText());
        BufferedReader br = new BufferedReader(content);
        compiler.ReInit(br);
        textAreaErr.setText(com.Lexicaler());

        if((com.Lexicaler())!=""){

            JOptionPane.showMessageDialog(null, "Lexical Error: \n"+" Please Check Your Code Before Execution! ", "WARNING", JOptionPane.INFORMATION_MESSAGE);
        }

    }


    @FXML
    private void btnSynClicked(ActionEvent event) throws ParseException {
        textAreaErr.setText("");
        textAreaSyn.setText("");
        tab2.isSelected();
        StringReader content = new StringReader(textAreaCode.getText());
        BufferedReader br = new BufferedReader(content);
        String write;

        if (textAreaCode.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Input CMM Source Code !");
        } else {
            try {
                //重新初始化parser对象，进行第二次扫描，完成语法及语义分析
                //打印语法树和符号表
                compiler.ReInit(br);
                SimpleNode n = com.Start();
                textAreaSyn.setText(n.toString(""));
//                execute exe = new execute(n);
//                exe.walk();
//                write = exe.Console;
//                jTextArea4.setText(exe.varTable.toString());
//                jTextArea5.setText(write);

                //showSyntacticErr();

            } catch (Exception e) {
                textAreaSyn.setText("Syntax Error!  \n" +e.getMessage());
            }
        }

    }

    @FXML
    private void btnSemClicked(ActionEvent event){
        textAreaErr.setText("");
        textAreaSem.setText("");

    }

}
