package api.path.manager.sauter;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class fileManager {
		
	private List<Object> getNodeFoldersJson(File file, String deviceMount) throws IOException {

			List<Object> array = new ArrayList<>();
			// visible files inside folder
			File[] visibleFiles = file.listFiles();
			for (File f : visibleFiles) {
				if (f.isDirectory()) {
					Map<String, Object> obj = new HashMap<String, Object>();
					obj.put("FILEMANAGER_DEVICE_LABEL", f.getName());
					obj.put("FILEMANAGER_DEVICE_KEY", f.getCanonicalPath());
					obj.put("FILEMANAGER_DEVICE_MOUNT", deviceMount);
					File[] fVisibleFiles = f.listFiles();
					boolean isLeaf = true;
					for (File fVisible : fVisibleFiles) {
						if (fVisible.isDirectory()) {
							isLeaf = false;
						}
					}
					obj.put("FILEMANAGER_DEVICE_LEAF_FOLDER", isLeaf);
					array.add(obj);
				}
			}
			return array;
		}
		
	


	public static Set<Object> addAllPath(Set<Object> pathList, Path path) throws IOException{
		
			if(pathList == null) {
				pathList = new HashSet<Object>();
			}
		    pathList.add(
		    		Files.list(path).collect(Collectors.toList()));
		    return pathList;
	}
	

}