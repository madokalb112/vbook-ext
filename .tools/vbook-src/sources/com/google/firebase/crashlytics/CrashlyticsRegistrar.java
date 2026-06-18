package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.az3;
import defpackage.ez3;
import defpackage.gx1;
import defpackage.gy3;
import defpackage.jh0;
import defpackage.lz3;
import defpackage.mi1;
import defpackage.ni1;
import defpackage.nz3;
import defpackage.oa8;
import defpackage.t07;
import defpackage.ty3;
import defpackage.ub0;
import defpackage.vn2;
import defpackage.x9;
import defpackage.y5;
import defpackage.y59;
import defpackage.zx5;
import defpackage.zy1;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final oa8 a = new oa8(ub0.class, ExecutorService.class);
    public final oa8 b = new oa8(jh0.class, ExecutorService.class);
    public final oa8 c = new oa8(zx5.class, ExecutorService.class);

    static {
        Map map = nz3.b;
        y59 y59Var = y59.a;
        if (map.containsKey(y59Var)) {
            Log.d("FirebaseSessions", "Dependency " + y59Var + " already added.");
            return;
        }
        map.put(y59Var, new lz3(new t07(true)));
        Log.d("FirebaseSessions", "Dependency to " + y59Var + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        mi1 mi1VarB = ni1.b(ty3.class);
        mi1VarB.a = "fire-cls";
        mi1VarB.a(vn2.b(gy3.class));
        mi1VarB.a(vn2.b(az3.class));
        mi1VarB.a(new vn2(this.a, 1, 0));
        mi1VarB.a(new vn2(this.b, 1, 0));
        mi1VarB.a(new vn2(this.c, 1, 0));
        mi1VarB.a(new vn2(zy1.class, 0, 2));
        mi1VarB.a(new vn2(x9.class, 0, 2));
        mi1VarB.a(new vn2(ez3.class, 0, 2));
        mi1VarB.f = new y5(this, 5);
        mi1VarB.c();
        return Arrays.asList(mi1VarB.b(), gx1.A("fire-cls", "20.0.5"));
    }
}
