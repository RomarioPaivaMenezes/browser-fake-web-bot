package test.slipt;

public class TestSlipt {

	public static void main(String[] args) {
		
		String carriageReturn = "CR";
		String value = "Sadaosdasdas\rsadsadsadas\rsadsadsad\r\rsadsadsad\r";

		StringBuilder sb2 = new StringBuilder();
		sb2.append(value);

		value = value.replaceAll("\n|\r", carriageReturn);
		
		for (String line : value.split("\n|\r")) {
			
		}
		
		value = value.replace("\n\n", carriageReturn)
				.replace("\n", carriageReturn);
		
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
