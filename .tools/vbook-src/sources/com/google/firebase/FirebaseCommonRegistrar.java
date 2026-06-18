package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.al4;
import defpackage.bl4;
import defpackage.gx1;
import defpackage.gy3;
import defpackage.if2;
import defpackage.j80;
import defpackage.mi1;
import defpackage.mk5;
import defpackage.ni1;
import defpackage.oa8;
import defpackage.ub0;
import defpackage.vn2;
import defpackage.xk2;
import defpackage.y5;
import defpackage.yg2;
import defpackage.zk4;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        mi1 mi1VarB = ni1.b(xk2.class);
        mi1VarB.a(new vn2(j80.class, 2, 0));
        mi1VarB.f = new if2(15);
        arrayList.add(mi1VarB.b());
        oa8 oa8Var = new oa8(ub0.class, Executor.class);
        mi1 mi1Var = new mi1(yg2.class, new Class[]{al4.class, bl4.class});
        mi1Var.a(vn2.b(Context.class));
        mi1Var.a(vn2.b(gy3.class));
        mi1Var.a(new vn2(zk4.class, 2, 0));
        mi1Var.a(new vn2(xk2.class, 1, 1));
        mi1Var.a(new vn2(oa8Var, 1, 0));
        mi1Var.f = new y5(oa8Var, 11);
        arrayList.add(mi1Var.b());
        arrayList.add(gx1.A("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(gx1.A("fire-core", "22.0.1"));
        arrayList.add(gx1.A("device-name", a(Build.PRODUCT)));
        arrayList.add(gx1.A("device-model", a(Build.DEVICE)));
        arrayList.add(gx1.A("device-brand", a(Build.BRAND)));
        arrayList.add(gx1.F("android-target-sdk", new sy3(0)));
        arrayList.add(gx1.F("android-min-sdk", new sy3(1)));
        arrayList.add(gx1.F("android-platform", new sy3(2)));
        arrayList.add(gx1.F("android-installer", new sy3(3)));
        try {
            mk5.b.getClass();
            str = "2.3.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(gx1.A("kotlin", str));
        }
        return arrayList;
    }
}
