package interfaces;

public class SmsLogger implements Logger{//implement=gerekli kodlar� uyarlamak

	@Override
	public void log(String message) {
		System.out.println("Sms g�nderildi : " + message);
		
	} 

}
