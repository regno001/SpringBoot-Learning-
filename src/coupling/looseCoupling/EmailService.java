package coupling.looseCoupling;

import coupling.tightCoupling.NotificationService;

public class EmailService implements NotificationUser {

    @Override
    public void send(String message) {
        System.out.println("Email:" + message);
    }
}
