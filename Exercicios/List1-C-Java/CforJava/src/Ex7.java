import javax.swing.JOptionPane;

public class Ex7 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Fatorial do 5: " + fat(5));
    }
    public static int fat(int n){
        int f = 1;
        for(int i = 2; i <= n; i++){
            f *= i;
        }
        return f;
    }
}
