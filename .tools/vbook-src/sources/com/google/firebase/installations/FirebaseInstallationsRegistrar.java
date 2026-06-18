package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.al4;
import defpackage.az3;
import defpackage.gx1;
import defpackage.gy3;
import defpackage.jh0;
import defpackage.mi1;
import defpackage.ni1;
import defpackage.oa8;
import defpackage.ub0;
import defpackage.vn2;
import defpackage.zk4;
import defpackage.zy3;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static az3 lambda$getComponents$0(bj1 bj1Var) {
        return new zy3((gy3) bj1Var.a(gy3.class), bj1Var.c(al4.class), (ExecutorService) bj1Var.g(new oa8(ub0.class, ExecutorService.class)), new k39((Executor) bj1Var.g(new oa8(jh0.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ni1> getComponents() {
        mi1 mi1VarB = ni1.b(az3.class);
        mi1VarB.a = LIBRARY_NAME;
        mi1VarB.a(vn2.b(gy3.class));
        mi1VarB.a(new vn2(al4.class, 0, 1));
        mi1VarB.a(new vn2(new oa8(ub0.class, ExecutorService.class), 1, 0));
        mi1VarB.a(new vn2(new oa8(jh0.class, Executor.class), 1, 0));
        mi1VarB.f = new sy3(5);
        ni1 ni1VarB = mi1VarB.b();
        zk4 zk4Var = new zk4(0);
        mi1 mi1VarB2 = ni1.b(zk4.class);
        mi1VarB2.e = 1;
        mi1VarB2.f = new li1(zk4Var, 0);
        return Arrays.asList(ni1VarB, mi1VarB2.b(), gx1.A(LIBRARY_NAME, "19.1.0"));
    }
}
