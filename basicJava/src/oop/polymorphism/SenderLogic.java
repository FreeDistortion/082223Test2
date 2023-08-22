package oop.polymorphism;

public class SenderLogic {
//	public void run(EmailSender sender) {
//		sender.send();
//	}
//	public void run(SMSSender sender) {
//		sender.send();
//	}
	
	public void run(Sender sender) {
		sender.send();
	}
	public void change(Sender sender){
		sender.send();
	}
	//......
	
}
