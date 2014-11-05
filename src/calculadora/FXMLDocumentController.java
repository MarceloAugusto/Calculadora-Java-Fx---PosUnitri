/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import com.towel.math.Expression;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author marcelo
 */
public class FXMLDocumentController implements Initializable {

    static String stringTela = "";
    static Integer total = 0;
    static Integer resto = 0;
    static double result = 0;

    @FXML
    private Button btnOito;
    @FXML
    private Button btnNove;
    @FXML
    private Button btnSoma;
    @FXML
    private Button btnSete;
    @FXML
    private Button btnQuatro;
    @FXML
    private Button btnCinco;
    @FXML
    private Button btnSeis;
    @FXML
    private Button btnSubtrai;
    @FXML
    private Button btnUm;
    @FXML
    private Button btnDois;
    @FXML
    private Button btnTres;
    @FXML
    private Button btnMultiplica;
    @FXML
    private Button btnZero;
    @FXML
    private Button btnZerar;
    @FXML
    private Button brnIgual;
    @FXML
    private Button btnDivide;
    @FXML
    private TextField txtTela;
    @FXML
    private Label label;

    @FXML
    private void metodBtnbtnZero(ActionEvent event) {
        mostrarNaTela(btnZero);
    }

    @FXML
    private void metodBtnbtnUm(ActionEvent event) {
        mostrarNaTela(btnUm);
    }

    @FXML
    private void metodBtnbtnDois(ActionEvent event) {
        mostrarNaTela(btnDois);
    }

    @FXML
    private void metodBtnbtnTres(ActionEvent event) {
        mostrarNaTela(btnTres);
    }

    @FXML
    private void metodBtnbtnQuatro(ActionEvent event) {
        mostrarNaTela(btnQuatro);
    }

    @FXML
    private void metodBtnbtnCinco(ActionEvent event) {
        mostrarNaTela(btnCinco);
    }

    @FXML
    private void metodBtnbtnSeis(ActionEvent event) {
        mostrarNaTela(btnSeis);
    }

    @FXML
    private void metodBtnbtnSete(ActionEvent event) {
        mostrarNaTela(btnSete);
    }

    @FXML
    private void metodBtnbtnOito(ActionEvent event) {
        mostrarNaTela(btnOito);
    }

    @FXML
    private void metodBtnbtnNove(ActionEvent event) {
        mostrarNaTela(btnNove);
    }

    @FXML
    private void metodBtnbtnSoma(ActionEvent event) {
        if (validarOperador()) {
            mostrarNaTela(btnSoma);
        }
    }

    @FXML
    private void metodBtnbtnMultiplicacao(ActionEvent event) {
        if (validarOperador()) {
            mostrarNaTela(btnMultiplica);
        }
    }

    @FXML
    private void metodBtnbtnSubtracao(ActionEvent event) {
        if (validarOperador()) {
            mostrarNaTela(btnSubtrai);
        }
    }

    @FXML
    private void metodBtnbtnDivisao(ActionEvent event) {
        if (validarOperador()) {
            mostrarNaTela(btnDivide);
        }

    }

    @FXML
    private void metodBtnbtnCC(ActionEvent event) {
        stringTela = "";
        txtTela.setText(stringTela);
    }

    @FXML
    public void metodBtnbtnIgual(ActionEvent event) {
        String var = stringTela.substring(stringTela.length() - 1);
        if ((!stringTela.equals("+")) && (!stringTela.equals("-")) && (!stringTela.equals("*")) && (!stringTela.equals("/")) && (!var.equals("+")) && (!var.equals("-")) && (!var.equals("*")) && (!var.equals("/"))) {
            Expression exp = new Expression(stringTela);
            exp.setVariable("", 3);
            result = exp.resolve();
            txtTela.setText(String.valueOf(result));
            stringTela = String.valueOf(result);
        } else {

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private void mostrarNaTela(Button btn) {
        if (stringTela.equals("")) {
            stringTela = stringTela + " " + btn.getText();
            txtTela.setText(stringTela);
        } else if (stringTela.equals(String.valueOf(result))) {
            if (btn.getText().equals("*") || btn.getText().equals("/") || btn.getText().equals("+") || btn.getText().equals("-")) {
                stringTela = stringTela + " " + btn.getText();
                txtTela.setText(stringTela);
            } else {
                //zerar display
                stringTela = "";
                txtTela.setText(stringTela);
                //insere numero no display
                stringTela = stringTela + " " + btn.getText();
                txtTela.setText(stringTela);
            }
        } else {
            stringTela = stringTela + " " + btn.getText();
            txtTela.setText(stringTela);
        }
    }

    private boolean validarOperador() {
        if (stringTela.length() == 0) {
            return false;
        }
        String var = stringTela.substring(stringTela.length() - 1);
        if ((!stringTela.equals("")) && (!stringTela.equals("+")) && (!stringTela.equals("-")) && (!stringTela.equals("*")) && (!stringTela.equals("/")) && (!var.equals("+")) && (!var.equals("-")) && (!var.equals("*")) && (!var.equals("/"))) {
            return true;
        }
        return false;
    }
    /*
     "Porque Deus tanto amou o mundo que deu o seu Filho Unigênito, para que todo o que nele crer não pereça, mas tenha a vida eterna. 
     João 3:16
     */
}
