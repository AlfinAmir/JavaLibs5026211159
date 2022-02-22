import javax.swing.*;
import java.awt.*;

public class JavaLibs5026211159 {
	public static void main(String[] args) {


        String[] options = new String[]{"Iya","Tidak"};
        int introInt = JOptionPane.showOptionDialog(null, "Hai, Maukah kamu berkenalan denganku?", "WARNING!", 0, 2, null, options, options[0]);
        if (introInt != 0 ){
            JOptionPane.showMessageDialog(null, "Sampai Bertemu Lagi!","Selamat Tinggal! :(",2);
            System.exit(0);
	};

 		// Perkenalan
                String name = JOptionPane.showInputDialog("Halo, Kamu Siapa?");
                JOptionPane.showMessageDialog(null, "Halo "+name+", Salam Kenal!");
           
                // Umur
                String age = JOptionPane.showInputDialog("Berapa umurmu saat ini?");
                int ageConvert=Integer.parseInt(age);
                if ( ageConvert > 35 ) {
                    JOptionPane.showMessageDialog(null, "Wah kamu sudah tua ternyata");
                } else if ( ageConvert == 19 ) {
                    JOptionPane.showMessageDialog(null, "Ternyata kita seumura ya "+name+".");
                } else {
                    JOptionPane.showMessageDialog(null, "Yah "+age+".");
                }


		// Kelamin
                String[] acceptablevalues = {"Laki-laki" , "Perempuan"};
                String gender = (String)JOptionPane.showInputDialog(null, "Kamu", "jenis kelamin",2,null,acceptablevalues,acceptablevalues[1]);


                // Hobi 
                String[] option = new String[]{"Iya","NOPE!!"};
        	int sukaInt = JOptionPane.showOptionDialog(null, "Apakah kamu suka futsal?", "PERHATIAN!", 0, 2, null, options, options[0]);
        	if (sukaInt != 0 ){
            	JOptionPane.showMessageDialog(null, "Sampai Berjumpa Lagi! ","Sedih Nih :(",2);
		}else {
		JOptionPane.showMessageDialog(null, "Senang berkenalan denganmu, Selamat tinggal " + name+ " :D " );
            	System.exit(0);
	};
               

     }
}