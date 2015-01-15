package exercise_lectures;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(
		description="The Notifications object keeps track of the current number of notifications.",
		markupLanguage="textile"
		)
public class NotificationsTest extends TestCase {
	
	private Notifications notifications;

	protected void setUp() throws Exception {
		notifications = new Notifications();
	}
	
	@JExercise(
			tests="Notifications()",
			description="The counts of new emails and contact requests are zero.")
	public void testNotifications() {
		assertEquals(0, notifications.contactRequests);
		assertEquals(0, notifications.newEmails);
	}
	
	@JExercise(
			tests="addContactRequest()",
			description="The count of contact requests should increase by one.")
	public void testAddContactRequest() {
		notifications.addContactRequest();
		assertEquals("Number of contact requests is not correct.", 1, notifications.contactRequests);
		assertEquals("Number of emails should not change.", 0, notifications.newEmails);
	}
	
	
	@JExercise(
			tests="addEmail()",
			description="The count of emails should increase by one.")
	public void testAddEmail() {
		notifications.addEmail();
		assertEquals("Number of contact requests should not change.", 0, notifications.contactRequests);
		assertEquals("Number of emails is not correct.", 1, notifications.newEmails);
	}
	
	@JExercise(
			tests="clearNotifications()",
			description="The count of new emails and contact requests should both be zero.")
	public void testClearNotifications() {
		notifications.newEmails = 1;
		notifications.contactRequests = 1;
		notifications.clearNotifications();
		assertEquals("Number of contact requests were nonzero.", 0, notifications.contactRequests);
		assertEquals("Number of emails were nonzero.", 0, notifications.newEmails);
	}
	
	@JExercise(
			tests="int totalNotifications()",
			description="The total number of notifications should be equal to the sum of new email and contact request notifications.")
	public void testTotalNotifications() {
		notifications.newEmails = 2;
		notifications.contactRequests = 1;
		assertEquals("The total number of notifications was not correct.", 3, notifications.totalNotifications());
	}

	@JExercise(
			tests="String toString()",
			description="Prints a summary of the notifications, in this format:  *X notifications in total. Y new emails, Z new contact requests.*")
	public void testToString() {
		notifications.newEmails = 2;
		notifications.contactRequests = 1;
		assertEquals("The summary was not correct.", "3 notifications in total. 2 new emails, 1 new contact requests.", notifications.toString().trim());
	}
	
	
}
