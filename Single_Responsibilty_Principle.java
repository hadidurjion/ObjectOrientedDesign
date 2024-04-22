//****************************************************************************
// Title : Demonstrating the Single Responsibility Principle (SRP)
// Author: Hadidur Rahman Jion
//         Undergraduate Student
//         Khulna University
//****************************************************************************


/**
 * Manages the dispatching of emails.
 */
class EmailDispatcher {
    /**
     * Sends an email to the specified recipient with the provided subject and message.
     *
     * @param recipientAddress The email address of the recipient.
     * @param emailSubject     The subject line of the email.
     * @param emailContent     The content of the email message.
     */
    public void dispatchEmail(String recipientAddress, String emailSubject, String emailContent) {
        // Code to dispatch email goes here
        System.out.println("Email dispatched to: " + recipientAddress);
        System.out.println("Subject: " + emailSubject);
        System.out.println("Content: " + emailContent);
    }
}

/**
 * Demonstrates the utilization of EmailDispatcher class.
 */
class EmailDispatchExample {
    public static void main(String[] args) {
        // Create an instance of EmailDispatcher
        EmailDispatcher dispatcher = new EmailDispatcher();

        // Prepare email details
        String recipientAddress = "example@example.com";
        String emailSubject = "Test Email";
        String emailContent = "This is a test email.";

        // Dispatch the email using EmailDispatcher
        dispatcher.dispatchEmail(recipientAddress, emailSubject, emailContent);
    }
}

/**
 * In the above demonstration, the EmailDispatcher class manages the responsibility
 * of dispatching emails. The EmailDispatchExample class illustrates the usage of EmailDispatcher
 * class without directly involving in the email dispatching process, thereby adhering
 * to the Single Responsibility Principle (SRP).
 */
