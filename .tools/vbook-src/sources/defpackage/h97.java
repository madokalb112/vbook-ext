package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h97 extends o1a implements yb4 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a = 1;
    public Object b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h97(nf1 nf1Var, lm9 lm9Var, v92 v92Var, r07 r07Var, pg8 pg8Var, HashSet hashSet, int i, int i2, jt1 jt1Var) {
        super(2, jt1Var);
        this.x = nf1Var;
        this.y = lm9Var;
        this.z = v92Var;
        this.u = r07Var;
        this.A = pg8Var;
        this.w = hashSet;
        this.f = i;
        this.s = i2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.A;
        switch (i) {
            case 0:
                h97 h97Var = new h97((nf1) this.x, (lm9) this.y, (v92) this.z, (r07) this.u, (pg8) obj2, (HashSet) this.w, this.f, this.s, jt1Var);
                h97Var.b = obj;
                return h97Var;
            default:
                h97 h97Var2 = new h97((ln9) obj2, jt1Var);
                h97Var2.z = obj;
                return h97Var2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((h97) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Path cross not found for [B:37:0x00fe, B:40:0x010c], limit reached: 111 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0168 -> B:58:0x016b). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h97.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h97(ln9 ln9Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.A = ln9Var;
    }
}
