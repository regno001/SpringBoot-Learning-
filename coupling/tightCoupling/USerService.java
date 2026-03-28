package coupling.tightCoupling;

public class USerService {
    NotificationService notificationService = new NotificationService();
    public void notifyUSer(String message){
        notificationService.send("Notification hello");
    }
}
