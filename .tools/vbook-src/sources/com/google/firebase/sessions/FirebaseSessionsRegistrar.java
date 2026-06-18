package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.az3;
import defpackage.f03;
import defpackage.fx3;
import defpackage.fz3;
import defpackage.gc1;
import defpackage.gx1;
import defpackage.gy3;
import defpackage.hz3;
import defpackage.iz3;
import defpackage.jh0;
import defpackage.jx1;
import defpackage.jz3;
import defpackage.kz3;
import defpackage.mi1;
import defpackage.nc1;
import defpackage.ni1;
import defpackage.nx1;
import defpackage.o59;
import defpackage.oa8;
import defpackage.oz3;
import defpackage.q58;
import defpackage.s16;
import defpackage.s58;
import defpackage.ub0;
import defpackage.vn2;
import defpackage.xg3;
import defpackage.y22;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final oz3 Companion = new oz3();
    private static final oa8 appContext = oa8.a(Context.class);
    private static final oa8 firebaseApp = oa8.a(gy3.class);
    private static final oa8 firebaseInstallationsApi = oa8.a(az3.class);
    private static final oa8 backgroundDispatcher = new oa8(ub0.class, nx1.class);
    private static final oa8 blockingDispatcher = new oa8(jh0.class, nx1.class);
    private static final oa8 transportFactory = oa8.a(d6b.class);
    private static final oa8 firebaseSessionsComponent = oa8.a(hz3.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final fz3 getComponents$lambda$0(bj1 bj1Var) {
        return (fz3) ((y22) ((hz3) bj1Var.g(firebaseSessionsComponent))).p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hz3 getComponents$lambda$1(bj1 bj1Var) {
        Object objG = bj1Var.g(appContext);
        objG.getClass();
        Object objG2 = bj1Var.g(backgroundDispatcher);
        objG2.getClass();
        Object objG3 = bj1Var.g(blockingDispatcher);
        objG3.getClass();
        Object objG4 = bj1Var.g(firebaseApp);
        objG4.getClass();
        Object objG5 = bj1Var.g(firebaseInstallationsApi);
        objG5.getClass();
        s58 s58VarF = bj1Var.f(transportFactory);
        s58VarF.getClass();
        y22 y22Var = new y22();
        y22Var.a = kg2.a((gy3) objG4);
        kg2 kg2VarA = kg2.a((Context) objG);
        y22Var.b = kg2VarA;
        y22Var.c = f03.a(new gi8(kg2VarA));
        y22Var.d = f03.a(jz3.a);
        y22Var.e = kg2.a((az3) objG5);
        y22Var.f = f03.a(new xg3(y22Var.a, 1));
        kg2 kg2VarA2 = kg2.a((jx1) objG3);
        y22Var.g = kg2VarA2;
        y22Var.h = f03.a(new iz3(y22Var.f, kg2VarA2));
        y22Var.i = kg2.a((jx1) objG2);
        y22Var.j = f03.a(new o59(y22Var.c, f03.a(new nc1(y22Var.d, y22Var.e, y22Var.f, y22Var.h, f03.a(new be5(20, y22Var.i, y22Var.d, f03.a(new iz3(y22Var.b, y22Var.g, 0)))), 15)), 1));
        q58 q58VarA = f03.a(kz3.a);
        y22Var.k = q58VarA;
        y22Var.l = f03.a(new o59(y22Var.d, q58VarA, 0));
        y22Var.m = f03.a(new nc1(y22Var.a, y22Var.e, y22Var.j, f03.a(new xg3(kg2.a(s58VarF), 0)), y22Var.i, 17));
        y22Var.n = f03.a(new y91(23, y22Var.b, y22Var.g, f03.a(new wx7(y22Var.l))));
        q58 q58VarA2 = f03.a(new fx3(y22Var.j, y22Var.l, y22Var.m, y22Var.d, y22Var.n, f03.a(new iz3(y22Var.b, y22Var.k, 1)), y22Var.i));
        y22Var.o = q58VarA2;
        y22Var.p = f03.a(new s16(y22Var.a, y22Var.j, y22Var.i, f03.a(new vf8(q58VarA2, 3)), 10));
        return y22Var;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ni1> getComponents() {
        mi1 mi1VarB = ni1.b(fz3.class);
        mi1VarB.a = LIBRARY_NAME;
        mi1VarB.a(vn2.a(firebaseSessionsComponent));
        mi1VarB.f = new sy3(7);
        mi1VarB.c();
        ni1 ni1VarB = mi1VarB.b();
        mi1 mi1VarB2 = ni1.b(hz3.class);
        mi1VarB2.a = "fire-sessions-component";
        mi1VarB2.a(vn2.a(appContext));
        mi1VarB2.a(vn2.a(backgroundDispatcher));
        mi1VarB2.a(vn2.a(blockingDispatcher));
        mi1VarB2.a(vn2.a(firebaseApp));
        mi1VarB2.a(vn2.a(firebaseInstallationsApi));
        mi1VarB2.a(new vn2(transportFactory, 1, 1));
        mi1VarB2.f = new sy3(8);
        return gc1.Z(ni1VarB, mi1VarB2.b(), gx1.A(LIBRARY_NAME, "3.0.5"));
    }
}
