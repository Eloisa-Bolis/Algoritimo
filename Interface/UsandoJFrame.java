import java.awt.Color;
//import javax.awt.Color;
import javax.swing.JFrame;
import javax.swing.*;

public class UsandoJFrame {

    public static void main(String[] args) {
        JFrame minhaJanela = new JFrame("Novo cu");
        
        minhaJanela.setSize(300, 300);
        //tamanho
        minhaJanela.getContentPane().setBackground(
                Color.red);
        //cor de fundo
        minhaJanela.setResizable( false );
        //nao deixa mininizar mudar o tamanho 
        minhaJanela.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE);
        //da pra fechar a janela agora 
        
        JPanel painel = new JPanel();
        painel.setSize(150, 150);
        painel.setBackground(Color.green);
        
        minhaJanela.setLayout( null );
        minhaJanela.add( painel );
        
        minhaJanela.setVisible( true );
        //deixa a janela visivel
        //é lega deichar esse pro final se não vai ficar carregando um por um, e o usuario ve isso
        
        
    }
    
}
