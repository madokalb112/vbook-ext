package com.reader.android;

import android.app.Application;
import defpackage.dk5;
import defpackage.fu6;
import defpackage.hy7;
import defpackage.zs5;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class AndroidApp extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        zs5 zs5Var = new zs5(new hy7(this, 4), 15);
        synchronized (fu6.A) {
            dk5 dk5Var = new dk5();
            if (fu6.B != null) {
                throw new e20("A Koin Application has already been started");
            }
            fu6.B = dk5Var.a;
            zs5Var.invoke(dk5Var);
            dk5Var.a.s();
        }
    }
}
