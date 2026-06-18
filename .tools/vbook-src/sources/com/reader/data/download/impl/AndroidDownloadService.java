package com.reader.data.download.impl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.ah1;
import defpackage.aj2;
import defpackage.d6a;
import defpackage.dp5;
import defpackage.ex1;
import defpackage.gx1;
import defpackage.h13;
import defpackage.iw0;
import defpackage.jt1;
import defpackage.nh2;
import defpackage.o0a;
import defpackage.of;
import defpackage.rf;
import defpackage.rw2;
import defpackage.sf;
import defpackage.tf;
import defpackage.ub;
import defpackage.uf;
import defpackage.wx1;
import defpackage.xu5;
import defpackage.y;
import defpackage.yd5;
import defpackage.zib;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class AndroidDownloadService extends Service {
    public static boolean s;
    public final dp5 a;
    public final dp5 b;
    public final iw0 c;
    public final d6a d;
    public final Object e;
    public final HashMap f;

    public AndroidDownloadService() {
        uf ufVar = new uf(this, 0);
        xu5 xu5Var = xu5.a;
        this.a = ex1.Z(xu5Var, ufVar);
        this.b = ex1.Z(xu5Var, new uf(this, 1));
        o0a o0aVarA = zib.a();
        aj2 aj2Var = rw2.a;
        this.c = wx1.b(gx1.T(o0aVarA, nh2.c));
        this.d = new d6a(new ub(this, 2));
        this.e = new Object();
        this.f = new HashMap();
    }

    public static final void a(AndroidDownloadService androidDownloadService, String str) {
        synchronized (androidDownloadService.e) {
            try {
                if (androidDownloadService.f.containsKey(str)) {
                    yd5 yd5Var = (yd5) androidDownloadService.f.remove(str);
                    if (yd5Var != null) {
                        yd5Var.cancel(null);
                    }
                    if (androidDownloadService.f.isEmpty()) {
                        androidDownloadService.stopSelf();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final h13 b() {
        return (h13) this.a.getValue();
    }

    public final of c() {
        return (of) this.d.getValue();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        s = true;
        c().getClass();
        ah1.J(this.c, null, null, new rf(this, null, 0), 3);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        b().b();
        of ofVarC = c();
        ofVarC.a.stopForeground(1);
        ofVarC.b.b.cancel(null, 100001);
        wx1.K(this.c, null);
        s = false;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        jt1 jt1Var = null;
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            iw0 iw0Var = this.c;
            int i3 = 0;
            if (iHashCode != -1962111802) {
                if (iHashCode != -1528813959) {
                    if (iHashCode == 1614604406 && action.equals("com.reader.action.download.START") && (stringExtra3 = intent.getStringExtra("book_id")) != null) {
                        ah1.J(iw0Var, null, null, new sf(this, stringExtra3, intent.getIntExtra("start", 0), intent.getIntExtra("size", 0), intent.getBooleanExtra("from_last_read", false), null), 3);
                        return 2;
                    }
                } else if (action.equals("com.reader.action.download.RESUME") && (stringExtra2 = intent.getStringExtra("book_id")) != null) {
                    ah1.J(iw0Var, null, null, new y(this, stringExtra2, jt1Var, 6), 3);
                    return 2;
                }
            } else if (action.equals("com.reader.action.download.CANCEL") && (stringExtra = intent.getStringExtra("book_id")) != null) {
                ah1.J(iw0Var, null, null, new tf(this, stringExtra, jt1Var, i3), 3);
            }
        }
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        stopSelf();
    }
}
