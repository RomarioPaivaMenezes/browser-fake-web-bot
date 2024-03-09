package teste;

import java.util.regex.Pattern;

public class TesteParttern {

	public static void main(String[] args) {
	
		String deviceTypeBlock = "sd";
	    Pattern fdiskDrivePattern = Pattern.compile("Disk\\s+(\\/dev\\/" + deviceTypeBlock + "\\w)\\:\\s+[0-9]*['.']?[0-9]*\\s+\\w+,\\s+((\\d+))\\s+bytes");
	    Pattern fdiskPartitionPattern = Pattern.compile("(\\/dev\\/" + deviceTypeBlock + "\\w+)\\s+(\\*)?\\s+(\\d+)\\s+(\\d+)\\s+(\\d+\\+?)\\s+(\\w+)\\s+((.*))");
	    
	    System.out.println(fdiskDrivePattern.pattern());
	    System.out.println(fdiskPartitionPattern.pattern());
	}

}
