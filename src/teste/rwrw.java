package teste;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class rwrw {
	  static Path dirs;
	
	
	public static void main(String[] args) {
		 // Root directory
		
        try {

        	 Path startPath = Paths.get("C:/Users/rmenezes/Downloads/New folder (3)");
        	 dirs = startPath;
        	 Path finalPath = Paths.get("C:/Users/rmenezes/Downloads/New folder (3)/SD Card/Card/teste 1");
	 
        	 
        	 
        	 Files.walkFileTree(startPath, new SimpleFileVisitor<Path>() {
        		 
                 @Override
                 public FileVisitResult preVisitDirectory(Path dir,
                         BasicFileAttributes attrs) {
                	 
                	 if(!(dir.equals(dirs)) ) {
                		 if(dir.equals(finalPath)) {
             			 	System.out.println("Diretório: " + dir.toString());
             			    return FileVisitResult.CONTINUE;  
                		 }else if(dir.getParent().equals(dirs)) {
                		       System.out.println("Diretório: " + dir.toString());
                			    return FileVisitResult.SKIP_SUBTREE;   
                		 } else dirs = dir;
                     }
                     
                    System.out.println("Diretório: " + dir.toString());
                    return FileVisitResult.CONTINUE;  

                 }

                 @Override
                 public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                    // System.out.println("Arquivo: " + file.toString());    
                	 if(file.toString().equals(finalPath.toString())) {
               		  	return FileVisitResult.TERMINATE; 
                	 }else {
                		 System.out.println("Arquivo: " + file.toString());
                		 return FileVisitResult.CONTINUE;
                	 }
                 }
   

                 @Override
                 public FileVisitResult visitFileFailed(Path file, IOException e) {
                	 return FileVisitResult.CONTINUE;
                     
                 }
             });
                
            } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
			}
      
	}
	
	

}
