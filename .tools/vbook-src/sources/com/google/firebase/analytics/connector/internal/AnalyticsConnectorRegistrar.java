package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzez;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ex1;
import defpackage.ez9;
import defpackage.gx1;
import defpackage.gy3;
import defpackage.mi1;
import defpackage.ni1;
import defpackage.r32;
import defpackage.ug3;
import defpackage.vn2;
import defpackage.x9;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static x9 lambda$getComponents$0(bj1 bj1Var) {
        boolean z;
        gy3 gy3Var = (gy3) bj1Var.a(gy3.class);
        Context context = (Context) bj1Var.a(Context.class);
        ez9 ez9Var = (ez9) bj1Var.a(ez9.class);
        ex1.C(gy3Var);
        ex1.C(context);
        ex1.C(ez9Var);
        ex1.C(context.getApplicationContext());
        if (y9.c == null) {
            synchronized (y9.class) {
                if (y9.c == null) {
                    Bundle bundle = new Bundle(1);
                    gy3Var.a();
                    if ("[DEFAULT]".equals(gy3Var.b)) {
                        ((ug3) ez9Var).a();
                        gy3Var.a();
                        r32 r32Var = (r32) gy3Var.g.get();
                        synchronized (r32Var) {
                            z = r32Var.a;
                        }
                        bundle.putBoolean("dataCollectionDefaultEnabled", z);
                    }
                    y9.c = new y9(zzez.zza(context, bundle).zzb());
                }
            }
        }
        return y9.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ni1> getComponents() {
        mi1 mi1VarB = ni1.b(x9.class);
        mi1VarB.a(vn2.b(gy3.class));
        mi1VarB.a(vn2.b(Context.class));
        mi1VarB.a(vn2.b(ez9.class));
        mi1VarB.f = bv7.b;
        mi1VarB.c();
        return Arrays.asList(mi1VarB.b(), gx1.A("fire-analytics", "23.2.0"));
    }
}
