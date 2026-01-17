import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AnalyseurDeTexte {

    ArrayList<Observer> observers = new ArrayList<>();

    public void RegisterObserver(Observer o) {
        observers.add(o);
    }

	public  void analyser(String filename) throws IOException {
		BufferedReader lecteurAvecBuffer = null;
		String ligne;
		try {
			lecteurAvecBuffer = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			System.out.println("Erreur d'ouverture");
		}
		while ((ligne = lecteurAvecBuffer.readLine()) != null) {
            for (Observer observer : observers) {
                observer.update(ligne);
            }

		}
		lecteurAvecBuffer.close();
        for (Observer observer : observers) {
            observer.resultat();
        }
	}
}
