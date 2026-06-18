package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import defpackage.bi1;
import defpackage.hx1;
import defpackage.ml2;
import defpackage.p7c;
import defpackage.pe5;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzbx {
    public static final ml2 zza(Task task) {
        final bi1 bi1VarD = p7c.d();
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            public final void onComplete(Task task2) {
                hx1 hx1Var = bi1VarD;
                Exception exception = task2.getException();
                if (exception != null) {
                    ((bi1) hx1Var).o0(exception);
                } else if (task2.isCanceled()) {
                    ((pe5) hx1Var).cancel(null);
                } else {
                    ((bi1) hx1Var).Q(task2.getResult());
                }
            }
        });
        return new zzbw(bi1VarD);
    }
}
