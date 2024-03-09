package test.slipt;

public class TestSlipt2 {

	public static void main(String[] args) {
		
		String value = "Sadaosdasdas\nsadsadsadas\nsadsadsad\n\nsadsadsad\n";

		if(value.contains("\n\n")) {
			value = value.replaceAll("\n\n", "\n%newline%\n");
		}
		
		String[] test = value.split("\n|\r");
		
		StringBuilder  sb = new StringBuilder();
		for (String line : value.split("\n|\r")) {
			if (!line.trim().isEmpty()) {
				 if(line.contains("%newline%")) {
					 sb.append(line);
				 }else {
					 sb.append(line);					 
					 sb.append("\r\n");
				 }
			}
		}
		
		value = sb.toString().replaceAll("%newline%", "\r\n");

		System.out.println(value);
	}

}
