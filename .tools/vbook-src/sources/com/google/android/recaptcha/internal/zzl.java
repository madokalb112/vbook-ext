package com.google.android.recaptcha.internal;

import defpackage.jt1;
import defpackage.lc3;
import defpackage.wx1;
import defpackage.zf2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzl {
    private final List zza;
    private zzek zzb;

    public /* synthetic */ zzl(List list, int i, zf2 zf2Var) {
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) lc3.a.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }

    private final void zzh(zze... zzeVarArr) {
        List list = this.zza;
        list.getClass();
        zzeVarArr.getClass();
        List listAsList = Arrays.asList(zzeVarArr);
        listAsList.getClass();
        list.addAll(listAsList);
    }

    public final Object zzb(String str, long j, jt1 jt1Var) {
        return wx1.a0(new zzh(this, str, j, null), jt1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzc(long r11, com.google.android.recaptcha.internal.zzsc r13, com.google.android.recaptcha.internal.zzek r14, defpackage.jt1 r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.google.android.recaptcha.internal.zzi
            if (r0 == 0) goto L13
            r0 = r15
            com.google.android.recaptcha.internal.zzi r0 = (com.google.android.recaptcha.internal.zzi) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzi r0 = new com.google.android.recaptcha.internal.zzi
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r15)
            goto L44
        L25:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            r10 = 0
            return r10
        L2c:
            defpackage.e11.e0(r15)
            com.google.android.recaptcha.internal.zzk r3 = new com.google.android.recaptcha.internal.zzk
            r9 = 0
            r4 = r10
            r6 = r11
            r8 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r8, r9)
            r0.zzc = r2
            java.lang.Object r15 = defpackage.wx1.a0(r3, r0)
            xx1 r10 = defpackage.xx1.a
            if (r15 != r10) goto L44
            return r10
        L44:
            qm8 r15 = (defpackage.qm8) r15
            java.lang.Object r10 = r15.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzl.zzc(long, com.google.android.recaptcha.internal.zzsc, com.google.android.recaptcha.internal.zzek, jt1):java.lang.Object");
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
