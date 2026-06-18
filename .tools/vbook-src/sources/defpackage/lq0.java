package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lq0 extends o1a implements yb4 {
    public final /* synthetic */ int a = 3;
    public Serializable b;
    public Object c;
    public Object d;
    public int e;
    public int f;
    public int s;
    public int t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(List list, int i, hra hraVar, int i2, jt1 jt1Var) {
        super(2, jt1Var);
        this.d = list;
        this.s = i;
        this.x = hraVar;
        this.t = i2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new lq0((mq0) this.w, (String) this.u, jt1Var);
            case 1:
                return new lq0((mo4) this.y, (String) this.u, jt1Var);
            case 2:
                return new lq0((List) this.d, this.s, (hra) this.x, this.t, jt1Var);
            default:
                return new lq0((hra) this.x, jt1Var);
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
        return ((lq0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0602, code lost:
    
        if (r10 != r6) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        if (r2 == r6) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05be A[LOOP:4: B:123:0x05b8->B:125:0x05be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0256 A[LOOP:0: B:35:0x0256->B:139:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0347 A[LOOP:1: B:63:0x0341->B:65:0x0347, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x044b A[LOOP:2: B:89:0x0445->B:91:0x044b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0478 A[LOOP:3: B:96:0x0472->B:98:0x0478, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x04cf -> B:82:0x03bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x0602 -> B:116:0x0526). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0104 -> B:10:0x0050). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r57) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(mo4 mo4Var, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.y = mo4Var;
        this.u = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(hra hraVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.x = hraVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(mq0 mq0Var, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.w = mq0Var;
        this.u = str;
    }
}
