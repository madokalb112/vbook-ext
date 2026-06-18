package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zabx extends BroadcastReceiver {
    public Context a;
    public final wo9 b;

    public zabx(wo9 wo9Var) {
        this.b = wo9Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            wo9 wo9Var = this.b;
            y8c y8cVar = (y8c) ((oc4) wo9Var.c).c;
            y8cVar.b.set(null);
            zau zauVar = y8cVar.f.z;
            zauVar.sendMessage(zauVar.obtainMessage(3));
            AlertDialog alertDialog = (AlertDialog) wo9Var.b;
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
            synchronized (this) {
                try {
                    Context context2 = this.a;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.a = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
