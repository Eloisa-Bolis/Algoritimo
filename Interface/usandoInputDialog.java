import javax.swing.JOptionPane;

public class usandoInputDialog {

    public static void main(String[] args) {
        
        String resposta =
                JOptionPane.showInputDialog( null,
                        "digite algo",
                        "olá erika",
                        JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println(resposta);
    }
    
}
