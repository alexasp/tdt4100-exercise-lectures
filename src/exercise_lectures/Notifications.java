package exercise_lectures;

public class Notifications {

	public int contactRequests;
	public int newEmails;
	
	public Notifications(){
		contactRequests = 0;
		newEmails = 0;
	}
	
	public void clearNotifications() {
		contactRequests = 0;
		newEmails = 0;
	}
	public void addEmail() {
		newEmails = newEmails + 1;
	}
	public void addContactRequest() {
		contactRequests += 1;
	}
	
	public int totalNotifications() {
		return contactRequests + newEmails;
	}
	

}
