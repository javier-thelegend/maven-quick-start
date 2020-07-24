package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public void lista(){
		List<String> l = new ArrayList<>();
		l.add("Test");
		
		for(String s : l){
			System.out.println("Valor: " + s);
		}
	}
	
	public Application(){
		System.out.println("Inside Application");
	}

	public static void main(String args[]){
		System.out.println("Starting Application");
		Application a = new Application();
		a.lista();
	}
}