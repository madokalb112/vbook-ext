package com.google.firebase.auth;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.al4;
import defpackage.gx1;
import defpackage.gy3;
import defpackage.hb5;
import defpackage.jh0;
import defpackage.mi1;
import defpackage.nc1;
import defpackage.ndb;
import defpackage.ni1;
import defpackage.oa8;
import defpackage.s58;
import defpackage.ub0;
import defpackage.ub5;
import defpackage.vn2;
import defpackage.zbc;
import defpackage.zk4;
import defpackage.zx5;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static FirebaseAuth lambda$getComponents$0(oa8 oa8Var, oa8 oa8Var2, oa8 oa8Var3, oa8 oa8Var4, oa8 oa8Var5, bj1 bj1Var) {
        gy3 gy3Var = (gy3) bj1Var.a(gy3.class);
        s58 s58VarC = bj1Var.c(ub5.class);
        s58 s58VarC2 = bj1Var.c(al4.class);
        Executor executor = (Executor) bj1Var.g(oa8Var2);
        return new zbc(gy3Var, s58VarC, s58VarC2, executor, (ScheduledExecutorService) bj1Var.g(oa8Var4), (Executor) bj1Var.g(oa8Var5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ni1> getComponents() {
        oa8 oa8Var = new oa8(ub0.class, Executor.class);
        oa8 oa8Var2 = new oa8(jh0.class, Executor.class);
        oa8 oa8Var3 = new oa8(zx5.class, Executor.class);
        oa8 oa8Var4 = new oa8(zx5.class, ScheduledExecutorService.class);
        oa8 oa8Var5 = new oa8(ndb.class, Executor.class);
        mi1 mi1Var = new mi1(FirebaseAuth.class, new Class[]{hb5.class});
        mi1Var.a(vn2.b(gy3.class));
        mi1Var.a(new vn2(al4.class, 1, 1));
        mi1Var.a(new vn2(oa8Var, 1, 0));
        mi1Var.a(new vn2(oa8Var2, 1, 0));
        mi1Var.a(new vn2(oa8Var3, 1, 0));
        mi1Var.a(new vn2(oa8Var4, 1, 0));
        mi1Var.a(new vn2(oa8Var5, 1, 0));
        mi1Var.a(new vn2(ub5.class, 0, 1));
        nc1 nc1Var = new nc1(23, false);
        nc1Var.b = oa8Var;
        nc1Var.c = oa8Var2;
        nc1Var.d = oa8Var3;
        nc1Var.e = oa8Var4;
        nc1Var.f = oa8Var5;
        mi1Var.f = nc1Var;
        ni1 ni1VarB = mi1Var.b();
        zk4 zk4Var = new zk4(0 == true ? 1 : 0);
        mi1 mi1VarB = ni1.b(zk4.class);
        mi1VarB.e = 1;
        mi1VarB.f = new li1(zk4Var, 0);
        return Arrays.asList(ni1VarB, mi1VarB.b(), gx1.A("fire-auth", "24.0.1"));
    }
}
