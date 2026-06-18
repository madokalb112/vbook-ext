package com.reader.data.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.ah1;
import defpackage.aj2;
import defpackage.d6a;
import defpackage.dp5;
import defpackage.ex1;
import defpackage.fr9;
import defpackage.gr9;
import defpackage.gx1;
import defpackage.iw0;
import defpackage.iw9;
import defpackage.jt1;
import defpackage.nh2;
import defpackage.o0a;
import defpackage.pc;
import defpackage.rw2;
import defpackage.u49;
import defpackage.ub;
import defpackage.wx1;
import defpackage.xj;
import defpackage.xu5;
import defpackage.yj;
import defpackage.zib;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class AndroidTestServerService extends Service {
    public static final fr9 d;
    public static final fr9 e;
    public final dp5 a = ex1.Z(xu5.a, new zj(this, 0));
    public final d6a b = new d6a(new ub(this, 8));
    public final iw0 c;

    static {
        fr9 fr9VarA = gr9.a(u49.a);
        d = fr9VarA;
        e = fr9VarA;
    }

    public AndroidTestServerService() {
        o0a o0aVarA = zib.a();
        aj2 aj2Var = rw2.a;
        this.c = wx1.b(gx1.T(o0aVarA, nh2.c));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ah1.J(this.c, null, null, new yj(this, null, 0), 3);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        fr9 fr9Var = d;
        fr9Var.getClass();
        fr9Var.l(null, u49.a);
        xj xjVar = (xj) this.b.getValue();
        xjVar.a.stopForeground(1);
        xjVar.b.b.cancel(null, 100010);
        ah1.J(this.c, null, null, new yj(this, null, 1), 3);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra;
        Integer numL;
        jt1 jt1Var = null;
        String action = intent != null ? intent.getAction() : null;
        if (action == null || action.hashCode() != 872976650 || !action.equals("com.reader.action.test_server.START") || (stringExtra = intent.getStringExtra("extra_port")) == null || (numL = iw9.L(10, stringExtra)) == null) {
            return 2;
        }
        ah1.J(this.c, null, null, new pc(this, numL.intValue(), jt1Var, 1), 3);
        return 1;
    }
}
