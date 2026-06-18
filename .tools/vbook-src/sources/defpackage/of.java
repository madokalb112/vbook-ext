package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.reader.android.MainActivity;
import com.reader.data.AndroidActionReceiver;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class of {
    public final Service a;
    public final l87 b;
    public final LinkedHashMap c = new LinkedHashMap();

    public of(Service service) {
        this.a = service;
        this.b = new l87(service);
        int i = Build.VERSION.SDK_INT;
        int i2 = 3;
        hc3 hc3Var = hc3.a;
        int i3 = 2;
        jt1 jt1Var = null;
        if (i >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("download_channel", (CharSequence) ah1.S(hc3Var, new hc(i3, 6, jt1Var)), 2);
            notificationChannel.setDescription((String) ah1.S(hc3Var, new hc(i3, 7, jt1Var)));
            NotificationChannel notificationChannel2 = new NotificationChannel("download_complete_channel", (CharSequence) ah1.S(hc3Var, new hc(i3, 4, jt1Var)), 3);
            notificationChannel2.setDescription((String) ah1.S(hc3Var, new hc(i3, 5, jt1Var)));
            NotificationManager notificationManager = (NotificationManager) service.getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel2);
            }
        }
        c87 c87Var = new c87(service, "download_channel");
        c87Var.e = c87.c((CharSequence) ah1.S(hc3Var, new hc(i3, i2, jt1Var)));
        c87Var.u.icon = 2131231009;
        c87Var.o = "group_downloads";
        service.startForeground(100001, c87Var.b());
    }

    public final PendingIntent a(String str, String str2) {
        Service service = this.a;
        Intent intent = new Intent(service, (Class<?>) AndroidActionReceiver.class);
        intent.setAction(str);
        intent.putExtra("book_id", str2);
        PendingIntent broadcast = PendingIntent.getBroadcast(service, str.hashCode() + str2.hashCode(), intent, 201326592);
        broadcast.getClass();
        return broadcast;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, java.lang.String r7, int r8, int r9, defpackage.kt1 r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof defpackage.jf
            if (r0 == 0) goto L13
            r0 = r10
            jf r0 = (defpackage.jf) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            jf r0 = new jf
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            c87 r6 = r0.b
            java.lang.String r7 = r0.a
            defpackage.e11.e0(r10)
            goto L6b
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L30:
            defpackage.e11.e0(r10)
            c87 r10 = new c87
            android.app.Service r1 = r5.a
            java.lang.String r3 = "download_complete_channel"
            r10.<init>(r1, r3)
            java.lang.CharSequence r7 = c87.c(r7)
            r10.e = r7
            d6a r7 = defpackage.mu9.k
            java.lang.Object r7 = r7.getValue()
            pv9 r7 = (defpackage.pv9) r7
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r8)
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r9)
            java.lang.Object[] r8 = new java.lang.Object[]{r1, r8}
            r0.a = r6
            r0.b = r10
            r0.e = r2
            java.lang.Object r7 = defpackage.wn9.z(r7, r8, r0)
            xx1 r8 = defpackage.xx1.a
            if (r7 != r8) goto L67
            return r8
        L67:
            r4 = r7
            r7 = r6
            r6 = r10
            r10 = r4
        L6b:
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r6.getClass()
            java.lang.CharSequence r8 = c87.c(r10)
            r6.f = r8
            r8 = 2131231008(0x7f080120, float:1.8078085E38)
            android.app.Notification r9 = r6.u
            r9.icon = r8
            r8 = 0
            r6.l = r8
            r6.m = r8
            r6.n = r8
            android.app.PendingIntent r8 = r5.c(r7)
            r6.g = r8
            r8 = 16
            r6.d(r8)
            java.lang.String r8 = "group_downloads"
            r6.o = r8
            r8 = 8
            r6.d(r8)
            android.app.Notification r6 = r6.b()
            r6.getClass()
            l87 r5 = r5.b
            int r7 = r7.hashCode()
            r5.a(r7, r6)
            heb r5 = defpackage.heb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of.b(java.lang.String, java.lang.String, int, int, kt1):java.lang.Object");
    }

    public final PendingIntent c(String str) {
        Service service = this.a;
        Context applicationContext = service.getApplicationContext();
        int i = MainActivity.L;
        Intent intent = new Intent(applicationContext, (Class<?>) MainActivity.class);
        intent.setAction(wm9.p());
        intent.setData(Uri.parse("vbookapp://view?screen=read&id=" + str));
        PendingIntent pendingIntentS0 = fx1.s0(service.getApplicationContext(), intent, true);
        pendingIntentS0.getClass();
        return pendingIntentS0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r9, java.lang.String r10, defpackage.kt1 r11) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of.d(java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r9, java.lang.String r10, defpackage.kt1 r11) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of.e(java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r23, java.lang.String r24, int r25, int r26, defpackage.kt1 r27) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of.f(java.lang.String, java.lang.String, int, int, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r10, java.lang.String r11, defpackage.kt1 r12) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of.g(java.lang.String, java.lang.String, kt1):java.lang.Object");
    }
}
