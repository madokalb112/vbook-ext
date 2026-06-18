package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kq0 extends o1a implements yb4 {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(ha5 ha5Var, nf1 nf1Var, List list, og ogVar, lm9 lm9Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.s = ha5Var;
        this.t = nf1Var;
        this.u = list;
        this.v = ogVar;
        this.w = lm9Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new kq0((mq0) this.t, jt1Var);
            case 1:
                kq0 kq0Var = new kq0((ha5) this.s, (nf1) this.t, (List) this.u, (og) this.v, (lm9) this.w, jt1Var);
                kq0Var.f = obj;
                return kq0Var;
            default:
                return new kq0((ua7[]) this.f, (g7b) this.v, (w2b) this.w, jt1Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return ((kq0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 1:
                return ((kq0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            default:
                return ((kq0) create((ny7) obj, (jt1) obj2)).invokeSuspend(hebVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        if (g7b.c(r10, r9, r4, r25) == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x006f, code lost:
    
        r4 = r7;
        r7 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008f -> B:27:0x0090). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x015b -> B:55:0x015d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0230 -> B:80:0x0236). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(mq0 mq0Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.t = mq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(ua7[] ua7VarArr, g7b g7bVar, w2b w2bVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.f = ua7VarArr;
        this.v = g7bVar;
        this.w = w2bVar;
    }
}
