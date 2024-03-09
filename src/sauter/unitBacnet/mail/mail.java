package sauter.unitBacnet.mail;

public class mail {
	
	public static void main(String[] args) {
		
		boolean enableSSL = false;
		boolean enableTLS = true;
		String host = "smtp.gmail.com";
		int port = 587;
		String user = "<gmail_account_username>";
		String password = "<gmail_account_password>";
		ServerConfig serverConfig = new ServerConfig(host, port, user, password);
		TransportStrategy transportStrategy = TransportStrategy.SMTP_TLS;
		Mailer mailer = new Mailer(serverConfig, transportStrategy);
		
	}

}
