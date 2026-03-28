package coupling.looseCoupling;




public class UserService {
    NotificationUser notificationUser;

    public UserService (NotificationUser notificationUser){
        this.notificationUser = notificationUser;
    }

    public void notifyUser(String message){
        notificationUser.send("Notification hellow");
    }
}

