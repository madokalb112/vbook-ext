package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.gc1;
import defpackage.jh0;
import defpackage.mi1;
import defpackage.ndb;
import defpackage.ni1;
import defpackage.nx1;
import defpackage.oa8;
import defpackage.ra1;
import defpackage.s00;
import defpackage.ub0;
import defpackage.vn2;
import defpackage.zx5;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ni1> getComponents() {
        mi1 mi1VarA = ni1.a(new oa8(ub0.class, nx1.class));
        mi1VarA.a(new vn2(new oa8(ub0.class, Executor.class), 1, 0));
        mi1VarA.f = wfc.f;
        ni1 ni1VarB = mi1VarA.b();
        mi1 mi1VarA2 = ni1.a(new oa8(zx5.class, nx1.class));
        mi1VarA2.a(new vn2(new oa8(zx5.class, Executor.class), 1, 0));
        mi1VarA2.f = s00.f;
        ni1 ni1VarB2 = mi1VarA2.b();
        mi1 mi1VarA3 = ni1.a(new oa8(jh0.class, nx1.class));
        mi1VarA3.a(new vn2(new oa8(jh0.class, Executor.class), 1, 0));
        mi1VarA3.f = ra1.x;
        ni1 ni1VarB3 = mi1VarA3.b();
        mi1 mi1VarA4 = ni1.a(new oa8(ndb.class, nx1.class));
        mi1VarA4.a(new vn2(new oa8(ndb.class, Executor.class), 1, 0));
        mi1VarA4.f = g83.f;
        return gc1.Z(ni1VarB, ni1VarB2, ni1VarB3, mi1VarA4.b());
    }
}
