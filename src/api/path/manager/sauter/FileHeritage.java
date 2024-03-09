package api.path.manager.sauter;

import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FileHeritage {
	
	private String path;
	private String father;
	
	public FileHeritage() {
		
	}
	
	public FileHeritage(String path, String father) {
		super();
		this.path = path;
		this.father = father;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public Set<String> getSons() {
		return getChildren(getPath());
	}
	
	public Set<String> getBrothers() {
		return getChildren(getFather());
	}
	
	public void setSons(List<File> sons) {
	}
	
	private Set<String> getChildren(String path) {
		return Arrays.asList(Paths.get(path).toFile()
				.listFiles()).stream()
				.filter(p -> p.isDirectory())
				.map(p -> p.getPath())
				.collect(Collectors.toSet());
	}

}
