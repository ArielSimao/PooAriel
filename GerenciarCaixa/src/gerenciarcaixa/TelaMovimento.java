package gerenciarcaixa;

//Transformar em uma janela (JFrame do pacote swing)
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaMovimento extends JFrame implements ActionListener, WindowListener {

    //Definir atributos da janela
    //Atributos serão da classe AWT

    protected Dimension dFrame, dLabel, dTextField, dTextArea, dButton;
    protected Label lblValor;
    protected Label lblSaldo;
    protected TextField txtValor;
    protected TextField txtSaldo;
    protected Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    protected TextArea txtMsg;
    public Caixa caixa;

    //Construtor personalizado
    public TelaMovimento() {
        //Iniciar uma conta caixa
        caixa = new Caixa();
        //Definir tamanhos padrões de objetos
        dFrame = new Dimension(400, 400);
        dLabel = new Dimension(40, 20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95, 20);
        dTextArea = new Dimension(350, 140);
        //Definir valores para a janela (JFrame)
        setTitle("Controle de Caixa");
        setResizable(false);
        setSize(dFrame);
        setLayout(null);
        //Definir os rótulos
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);

        //Definir as caixas de texto
        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75, 50);
       /* txtValor.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                char l = e.getKeyChar();
                if (((l < '0') || (l > '9')) && (l != '.')) {
                    e.consume();
                }

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });*/

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);

        //Definir os botões
        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25, 150);
        cmdEntrada.addActionListener(this);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25, 185);
        cmdConsulta.addActionListener(this);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180, 150);
        cmdRetirada.addActionListener(this);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180, 185);
        cmdSair.addActionListener(this);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 220);

        add(txtMsg);
        add(cmdEntrada);
        add(cmdConsulta);
        add(cmdRetirada);
        add(cmdSair);
        add(lblValor);
        add(lblSaldo);
        add(txtValor);
        add(txtSaldo);
        addWindowListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cmdSair) {
            //Sair do sistema
            System.exit(0);
        }
        if (e.getSource() == cmdEntrada) {
            try {
                double valor = Double.parseDouble(txtValor.getText());
                String mensagem = caixa.depositar(valor);
                txtMsg.append(mensagem + "\n");
                
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null,
                        "Aconteceu erro de entrada de dados, Erro:  " +
                                erro.getMessage());
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null,
                        "Aconteceu erro:  " +
                                erro.getMessage());
            } finally{
                txtValor.setText(null);
                txtValor.requestFocus(); //Coloca o foco no objeto    
            }

        }
        if (e.getSource() == cmdRetirada) {
            double valor = Double.parseDouble(txtValor.getText());
            String mensagem;
            try {
                mensagem = caixa.sacar(valor);
                 txtMsg.append(mensagem + "\n");
            } catch (GerenciarCaixaException ex) {
                 JOptionPane.showMessageDialog(null, "Erro: " +
                         ex.toString());
            }
           
            txtValor.setText(null);
            txtValor.requestFocus(); //Coloca o foco no objeto
        }
        if (e.getSource() == cmdConsulta) {
            txtSaldo.setText(Double.toString(caixa.getSaldo()));
            txtValor.setText(null);
            txtValor.requestFocus();
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        //Metódo que ocorre ao sair da janela (fechar)
        JOptionPane.showMessageDialog(null, "Fechando.. Bye");
        System.exit(0); //Fecha o aplicativo
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
}
