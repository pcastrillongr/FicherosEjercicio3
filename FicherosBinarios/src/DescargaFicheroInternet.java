import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DescargaFicheroInternet {

	public static void main(String[] args) throws IOException {

		try {
			
			//url de internet
			URL url=new URL("http://www.cenecmalaga.es/uploads/7/9/8/4/79848062/9917986.png");
			//conexion con la url de internet
			URLConnection urlcon=url.openConnection();
			//Creacion del fichero que se queda en el ordenador
			FileOutputStream ficherillo=new FileOutputStream("Foto Cenec.png");
			//crea la conexion con la url de internet
			InputStream fis=urlcon.getInputStream();
			//buffer para guardar la info del archivo
			byte[]array=new byte[1000];
			
			
			int leido=fis.read(array);
			
			while(leido>0) {
				
					ficherillo.write(array,0,leido);
					leido=fis.read(array);
				
			}
	
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

	}

}
