package interfaces;

public class SmsLogger implements Logger{//implement=gerekli kodlarý uyarlamak

	@Override
	public void log(String message) {
		System.out.println("Sms gönderildi : " + message);
		
	} 

}
