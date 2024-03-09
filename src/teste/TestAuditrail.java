package teste;

public class TestAuditrail {
	
	public static void main(String[] args) {
		
		String localizationKey = null;
		Teste test = Teste.UPDATE;
		
		switch (test) {
		
		case CREATE: 
			localizationKey = "audittrail.create.notificationrule";
			break;
		case DELETE:
			localizationKey = "audittrail.delete.notificationrule";
			break;
		case UPDATE:
			localizationKey = "audittrail.update.notificationrule";
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + test);
		}
		
	}
	
	
	public enum Teste{
		
		
		CREATE("Create"),
		DELETE("Delete"),
		UPDATE("Update");
		
		String type;
		
		Teste(String type) {
			this.type = type;
		}
	}
	
}
