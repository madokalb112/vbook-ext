package com.google.mlkit.common.internal;

import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.fu6;
import defpackage.ia9;
import defpackage.lh6;
import defpackage.mi1;
import defpackage.mi3;
import defpackage.nh6;
import defpackage.ni1;
import defpackage.ra1;
import defpackage.vn2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ni1 ni1Var = ia9.b;
        mi1 mi1VarB = ni1.b(fu6.class);
        mi1VarB.a(vn2.b(lh6.class));
        mi1VarB.f = new xn7(8);
        ni1 ni1VarB = mi1VarB.b();
        mi1 mi1VarB2 = ni1.b(nh6.class);
        mi1VarB2.f = new ix7(8);
        ni1 ni1VarB2 = mi1VarB2.b();
        mi1 mi1VarB3 = ni1.b(gi8.class);
        mi1VarB3.a(new vn2(fi8.class, 2, 0));
        mi1VarB3.f = new ju7(10);
        ni1 ni1VarB3 = mi1VarB3.b();
        mi1 mi1VarB4 = ni1.b(mi3.class);
        mi1VarB4.a(new vn2(nh6.class, 1, 1));
        mi1VarB4.f = new xn7(13);
        ni1 ni1VarB4 = mi1VarB4.b();
        mi1 mi1VarB5 = ni1.b(j91.class);
        mi1VarB5.f = new s08(15);
        ni1 ni1VarB5 = mi1VarB5.b();
        mi1 mi1VarB6 = ni1.b(ra1.class);
        mi1VarB6.a(vn2.b(j91.class));
        mi1VarB6.f = new bv7(18);
        ni1 ni1VarB6 = mi1VarB6.b();
        mi1 mi1VarB7 = ni1.b(wfc.class);
        mi1VarB7.a(vn2.b(lh6.class));
        mi1VarB7.f = new am7(21);
        ni1 ni1VarB7 = mi1VarB7.b();
        mi1 mi1VarB8 = ni1.b(fi8.class);
        mi1VarB8.e = 1;
        mi1VarB8.a(new vn2(wfc.class, 1, 1));
        mi1VarB8.f = new vs7(21);
        return zzaf.zzi(ni1Var, ni1VarB, ni1VarB2, ni1VarB3, ni1VarB4, ni1VarB5, ni1VarB6, ni1VarB7, mi1VarB8.b());
    }
}
