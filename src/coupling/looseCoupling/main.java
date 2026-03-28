package coupling.looseCoupling;

public class main {
    public static void main(String[] args) {
        NotificationUser emailUSer = new EmailService();
        NotificationUser smsService= new SmsService();
        UserService userService= new UserService(emailUSer);
        UserService u2=new UserService(smsService);
        u2.notifyUser("Working");
        userService.notifyUser("Order Processed");

    }
}
