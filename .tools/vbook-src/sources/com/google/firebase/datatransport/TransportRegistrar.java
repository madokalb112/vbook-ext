package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.b6b;
import defpackage.gx1;
import defpackage.mi1;
import defpackage.ni1;
import defpackage.oa8;
import defpackage.tv5;
import defpackage.vn2;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d6b lambda$getComponents$0(bj1 bj1Var) {
        g6b.b((Context) bj1Var.a(Context.class));
        return g6b.a().c(zv0.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d6b lambda$getComponents$1(bj1 bj1Var) {
        g6b.b((Context) bj1Var.a(Context.class));
        return g6b.a().c(zv0.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d6b lambda$getComponents$2(bj1 bj1Var) {
        g6b.b((Context) bj1Var.a(Context.class));
        return g6b.a().c(zv0.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ni1> getComponents() {
        mi1 mi1VarB = ni1.b(d6b.class);
        mi1VarB.a = LIBRARY_NAME;
        mi1VarB.a(vn2.b(Context.class));
        mi1VarB.f = new so9(10);
        ni1 ni1VarB = mi1VarB.b();
        mi1 mi1VarA = ni1.a(new oa8(tv5.class, d6b.class));
        mi1VarA.a(vn2.b(Context.class));
        mi1VarA.f = new so9(11);
        ni1 ni1VarB2 = mi1VarA.b();
        mi1 mi1VarA2 = ni1.a(new oa8(b6b.class, d6b.class));
        mi1VarA2.a(vn2.b(Context.class));
        mi1VarA2.f = new so9(12);
        return Arrays.asList(ni1VarB, ni1VarB2, mi1VarA2.b(), gx1.A(LIBRARY_NAME, "19.0.0"));
    }
}
