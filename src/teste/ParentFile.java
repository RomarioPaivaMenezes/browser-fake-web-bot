package teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import api.path.manager.sauter.FileHeritage;
import api.path.manager.sauter.fileManager;

public class ParentFile {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		 Path startPath = Paths.get("C:/Users/rmenezes/Downloads/New folder (3)");
    	 Path finalPath = Paths.get("C:/Users/rmenezes/Downloads/New folder (3)/SD Card/Card/teste 1");

    	 processFileHeritage2(getReversePaths2(startPath, finalPath));
	}

	
	
	static Path getParentFile(Path path){
		return path.getParent();
	}

	
	static Path getRootChildParents(Path father, Path child) {
		
		Path childPath = null;
		Path current = child;
		
		while(!current.equals(father)) {
			
			if(current.getParent().equals(father)) {
				childPath = current;
			}
			current = current.getParent();
		

		}
		
		return childPath;
	}
	
	
	static Set<Object> getReversePaths(Path root, Path child) {
		
		Set<Object> paths = new HashSet<Object>();
		Path current = child;
		
		while(!current.equals(root)) {
			current = current.getParent();
			paths.add(current);	
		}
		
		return paths;
	}
	
	static Map<Integer, FileHeritage>  getReversePaths2(Path root, Path child) {
		
		Map<Integer, FileHeritage> fileHeritages = new HashMap<Integer,FileHeritage>();
		Path current = child;
		
		int cont = 0;
		while(!current.equals(root)) {
			FileHeritage file = new FileHeritage();
			file.setPath(current.toString());
			file.setFather(current.getParent().toString());
			
			current = current.getParent();
			fileHeritages.put(cont ,file);
			cont ++;
		}
		
		return fileHeritages;
	}
	
	static void processFileHeritage(Map<Integer, FileHeritage> fileHeritages) {
		
		List<Integer> chaves = new ArrayList<>(fileHeritages.keySet());
		// ordenar as chaves na ordem inversa
		Collections.sort(chaves, Collections.reverseOrder());
		
		ArrayList<List<String>> paths = new ArrayList<List<String>>();
		chaves.forEach(key ->{
			List<String> children = new ArrayList<>();
			System.out.println("+++ DIRETORIOS ROOT+++"); 
			System.out.println(fileHeritages.get(key).getPath());

			/**System.out.println("+++ DIRETORIOS FILHOS+++  ");
			fileHeritages.get(key).getSons().forEach(p -> {
				System.out.println("+++ DIRETORIOS FILHOS DOS FILHOS+++  ");
				new FileHeritage(p.getPath(), 
						p.getParent()).getSons().forEach(System.out::println);
			});*/
			
			
		});
		
		
		
	}
	
	static Map<String, Object> sadasdas = new HashMap<>();
	
	static void processFileHeritage2(Map<Integer, FileHeritage> fileHeritages) {
		
		List<Integer> chaves = new ArrayList<>(fileHeritages.keySet());
		// ordenar as chaves na ordem inversa
		Collections.sort(chaves, Collections.reverseOrder());
			
		Map<String, Object> children = new HashMap<>();
		
		chaves.forEach(key ->{
			
			FileHeritage ht = fileHeritages.get(key);
			
			Map<String, Object> test = new HashMap<>();
			ht.getBrothers().forEach( b ->{
				test.put(b, null);
			});
			
			if(sadasdas.isEmpty()) {
		
				sadasdas = test;
				children.put(ht.getFather(), test);
				
				fileHeritages.remove(key);	
			}else {
				//esta apontando para o childre do atual nó, no caso da pasta atual
				sadasdas.replace(ht.getFather(), test);
				sadasdas = test;
			}
			
		});
		
		System.out.println("");
		
	}
	
	
}
