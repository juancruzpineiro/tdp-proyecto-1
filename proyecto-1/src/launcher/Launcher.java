package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student estudiante= new Student(121302, "Piñeiro", "Juan Cruz", "juancruzpineiro@gmail.com", "github.com/juancruzpineiro", "/proyecto-1/src/images/WIN_20220825_11_16_11_Pro (2).jpg");
            	SimplePresentationScreen ventana= new SimplePresentationScreen(estudiante);
            	ventana.setVisible(true);
            }
        });
    }
}