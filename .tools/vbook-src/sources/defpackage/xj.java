package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import com.reader.data.AndroidActionReceiver;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xj {
    public final Service a;
    public final l87 b;

    public xj(Service service) {
        this.a = service;
        this.b = new l87(service);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("test_server_channel", "Test Server", 2);
            NotificationManager notificationManager = (NotificationManager) service.getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        service.startForeground(100010, a("Starting"));
    }

    public final Notification a(String str) {
        Service service = this.a;
        c87 c87Var = new c87(service, "test_server_channel");
        c87Var.e = c87.c("Test Server");
        c87Var.f = c87.c(str);
        c87Var.u.icon = 2131230998;
        c87Var.d(2);
        CharSequence charSequence = (CharSequence) ah1.S(hc3.a, new hc(2, 8, null));
        Intent intent = new Intent(service, (Class<?>) AndroidActionReceiver.class);
        intent.setAction("com.reader.action.test_server.STOP");
        PendingIntent broadcast = PendingIntent.getBroadcast(service, 100011, intent, 201326592);
        broadcast.getClass();
        c87Var.a(2131231007, charSequence, broadcast);
        Notification notificationB = c87Var.b();
        notificationB.getClass();
        return notificationB;
    }
}
