package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import com.google.android.gms.internal.mlkit_language_id_common.zzu;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.mi1;
import defpackage.mi3;
import defpackage.ni1;
import defpackage.tac;
import defpackage.vn2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        mi1 mi1VarB = ni1.b(sfc.class);
        mi1VarB.a(vn2.b(Context.class));
        mi1VarB.a(new vn2(tac.class, 2, 0));
        mi1VarB.f = g83.z;
        ni1 ni1VarB = mi1VarB.b();
        mi1 mi1VarB2 = ni1.b(am5.class);
        mi1VarB2.a(vn2.b(sfc.class));
        mi1VarB2.a(vn2.b(mi3.class));
        mi1VarB2.f = lr3.D;
        return zzu.zzi(ni1VarB, mi1VarB2.b());
    }
}
