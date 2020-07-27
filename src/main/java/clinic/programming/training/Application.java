package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public int countWords(String words){
		String[] sw = StringUtils.split(words, " ");
		return (sw == null) ? 0 : sw.length;
	}
	
	public void lista(){
		List<String> l = new ArrayList<>();
		l.add("Test of Dependency");
		
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
		System.out.println("Words: " + a.countWords("Test of Dependency"));
	}
}