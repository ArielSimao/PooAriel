package controledecaixa;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaMovimento extends JFrame implements WindowListener, ActionListener {
    //Definir atributos para janela
    protected Dimension dFrame, dLabel, dTextField, dButton, dTextArea;
    protected Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    protected TextField txtValor, txtSaldo;
    protected Label lblValor, lblSaldo;
    protected TextArea txtMsg;
    public Caixa caixa;
    
    public TelaMovimento(){
        //Instanciar o objeto caixa
        caixa = new Caixa();
        //Construtor padrão da janela
        dFrame = new Dimension(350,400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150,20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300,140);
        //Definir a janela gráfica
        this.setSize(dFrame);
        this.setTitle("Controle de Caixa");
        this.setResizable(false);
        this.setLayout(null);
        this.setLocation(500, 350);
        //definir as propriedade do label lblValor
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        //definir as propriedade do label lblSaldo
        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        //Definir propriedades para as caixa txtValor
        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75, 50);
        //Definir propriedades para as caixa txtSaldo
        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        //Definir o cmdEntrada
        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25, 150);
        cmdEntrada.addActionListener(this);
                //Definir o cmdRetirada
        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180, 150);
        cmdRetirada.addActionListener(this);
        //Definir o cmdEntrada
        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25, 185);
        cmdConsulta.addActionListener(this);
        //Definir o cmdSair
        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180, 185);
        cmdSair.addActionListener(this);
        //Definir propriedades do txtMsg
        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        //Colocar os objetos na janela
        this.add(lblValor);
        this.add(lblSaldo);
        this.add(txtValor);
        this.add(txtSaldo);
        this.add(cmdEntrada);
        this.add(cmdRetirada);
        this.add(cmdConsulta);
        this.add(cmdSair);
        this.add(txtMsg);
        this.addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "Fechando a janela e o aplicativo");
        System.exit(0); //Encerrar o programa
    }

    @Override
    public void windowClosed(WindowEvent e) {
   
    }

    @Override
    public void windowIconified(WindowEvent e) {
    
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    
    }

    @Override
    public void windowActivated(WindowEvent e) {
    
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cmdSair){
            System.exit(0);
        }
        if(e.getSource()==cmdConsulta){
            this.txtSaldo.setText(String.valueOf(caixa.getSaldo()));
        }
        if(e.getSource()==cmdEntrada){
            double valor = Double.parseDouble(txtValor.getText());
            txtMsg.append(caixa.depositar(valor));
            this.txtSaldo.setText(String.valueOf(caixa.getSaldo()));
            txtValor.setText(null);
            txtValor.requestFocus(); //Colocar o foco no valor
        }
        if(e.getSource()==cmdRetirada){
            double valor = Double.parseDouble(txtValor.getText());
            txtMsg.append(caixa.sacar(valor));
            this.txtSaldo.setText(String.valueOf(caixa.getSaldo()));
            txtValor.setText(null);
            txtValor.requestFocus(); //Colocar o foco no valor
        }
    }
    
}
