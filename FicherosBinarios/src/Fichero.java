import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fichero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fichero;
		try {
			fichero = new FileOutputStream("HolaCapullo");
			DataOutputStream ficherito = new DataOutputStream(fichero);
			
			for (int i = 1; i < 11; i++) {
				ficherito.writeInt(i);

			}
			
			FileInputStream fichero2 = new FileInputStream("HolaCapullo");
			DataInputStream ficherito2 = new DataInputStream(fichero2);
	
			for (int i = 1; i < 11; i++) {
				
			System.out.println(ficherito2.readInt());

			}
			fichero.flush();
			ficherito.flush();
			ficherito.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
