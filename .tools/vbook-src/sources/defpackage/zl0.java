package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zl0 {
    public final m62 a;
    public final qt b;
    public final mka c;
    public final w25 d;
    public final mrb e;
    public final m87 f;
    public final f4b g;

    public zl0(m62 m62Var, qt qtVar, mka mkaVar, w25 w25Var, mrb mrbVar, m87 m87Var, f4b f4bVar) {
        this.a = m62Var;
        this.b = qtVar;
        this.c = mkaVar;
        this.d = w25Var;
        this.e = mrbVar;
        this.f = m87Var;
        this.g = f4bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
    
        if (r10 == r7) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.zl0 r8, defpackage.a82 r9, defpackage.kt1 r10) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zl0.a(zl0, a82, kt1):java.lang.Object");
    }

    public final Object b(mc mcVar, mc mcVar2, w wVar) {
        qt qtVar = this.b;
        List listR0 = f39.r0(new vx3(new vx3(new r04(2, fc1.q0(this.a.b.Z(true).c()), new k54(13)), true, new vl0(((Number) qtVar.B.c(qt.T[26], qtVar)).intValue(), 0)), true, new vl0(qtVar.d(), 1)));
        mcVar.invoke(new Integer(0), new Integer(listR0.size()));
        Object objA0 = wx1.a0(new ug(listR0, this, mcVar2, mcVar, null, 2), wVar);
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        if (objA0 != xx1Var) {
            objA0 = hebVar;
        }
        return objA0 == xx1Var ? objA0 : hebVar;
    }

    public final Object c(boolean z, mc mcVar, mc mcVar2, w wVar) {
        List listC = this.a.b.Z(z).c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            long jC = r95.a.k().c() - ((a82) obj).I;
            mc8 mc8Var = k63.b;
            if (jC > k63.e(lx1.z0(30, o63.MINUTES))) {
                arrayList.add(obj);
            }
        }
        List listR0 = fc1.R0(new k54(14), arrayList);
        mcVar.invoke(new Integer(0), new Integer(listR0.size()));
        Object objA0 = wx1.a0(new ug(listR0, this, mcVar2, mcVar, null, 2), wVar);
        return objA0 == xx1.a ? objA0 : heb.a;
    }
}
