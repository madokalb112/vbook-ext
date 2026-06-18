package com.google.android.recaptcha.internal;

import defpackage.e11;
import defpackage.fc1;
import defpackage.heb;
import defpackage.j39;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.vx1;
import defpackage.yb4;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzfv extends o1a implements yb4 {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzfw zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfv(String[] strArr, zzfw zzfwVar, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.zza = strArr;
        this.zzb = zzfwVar;
        this.zzc = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzfv(this.zza, this.zzb, this.zzc, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfv) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        e11.e0(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        this.zzb.zza.evaluateJavascript(j39.A(this.zzc, "(", fc1.D0(arrayList, ",", null, null, null, 62), ")"), null);
        return heb.a;
    }
}
