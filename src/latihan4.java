     import javax.swing.JOptionPane; 

public class latihan4 {
     
    public static void main(String[] args) {
   
    
        //input angka pertama
        String input1= JOptionPane.showInputDialog("masukkan angka pertama :");
        double angka1 = Double.parseDouble(input1);
         
        // input angka kedua
        String input2 = JOptionPane.showInputDialog("masukkan angka kedua:");
        double angka2 = Double.parseDouble(input2);
        // input operasi yang di inginkan
        String operasi =JOptionPane.showInputDialog("pilih operasi (+,-.*,/):");
        double hasil = 0;
        switch(operasi){
            case "+":
                hasil = angka1 + angka2;
                break;
            case "-":
                hasil = angka1 - angka2;
                break;
            case "/" :
                hasil = angka1 / angka2;
                        break;
            case "*":
                hasil = angka1 * angka2;
                break;
            default :
                JOptionPane.showMessageDialog(null, "operasi tidak valid");
                return;       
                        }
        JOptionPane.showMessageDialog(null, "hasil :" + hasil);
    }
}

