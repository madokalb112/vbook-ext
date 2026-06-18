package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vl9 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public Object b;
    public yl9 c;
    public b07 d;
    public Object e;
    public ul9 f;
    public HashMap s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ yl9 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vl9(yl9 yl9Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.z = yl9Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        yl9 yl9Var = this.z;
        switch (i) {
            case 0:
                vl9 vl9Var = new vl9(yl9Var, jt1Var, 0);
                vl9Var.y = obj;
                return vl9Var;
            default:
                vl9 vl9Var2 = new vl9(yl9Var, jt1Var, 1);
                vl9Var2.y = obj;
                return vl9Var2;
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
        return ((vl9) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x02a3, code lost:
    
        if (defpackage.yl9.E(r3, r17) == r5) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0125, code lost:
    
        if (defpackage.yl9.E(r3, r17) == r5) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028f A[PHI: r0 r3 r4 r14
  0x028f: PHI (r0v13 int) = (r0v12 int), (r0v32 int) binds: [B:110:0x028c, B:85:0x01ef] A[DONT_GENERATE, DONT_INLINE]
  0x028f: PHI (r3v3 yl9) = (r3v2 yl9), (r3v12 yl9) binds: [B:110:0x028c, B:85:0x01ef] A[DONT_GENERATE, DONT_INLINE]
  0x028f: PHI (r4v4 java.lang.Object) = (r4v3 java.lang.Object), (r4v14 java.lang.Object) binds: [B:110:0x028c, B:85:0x01ef] A[DONT_GENERATE, DONT_INLINE]
  0x028f: PHI (r14v2 java.lang.Object) = (r14v1 java.lang.Object), (r14v8 java.lang.Object) binds: [B:110:0x028c, B:85:0x01ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111 A[PHI: r0 r3 r4 r14
  0x0111: PHI (r0v47 int) = (r0v46 int), (r0v70 int) binds: [B:42:0x010e, B:14:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x0111: PHI (r3v17 yl9) = (r3v16 yl9), (r3v24 yl9) binds: [B:42:0x010e, B:14:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x0111: PHI (r4v20 java.lang.Object) = (r4v19 java.lang.Object), (r4v33 java.lang.Object) binds: [B:42:0x010e, B:14:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x0111: PHI (r14v12 java.lang.Object) = (r14v11 java.lang.Object), (r14v20 java.lang.Object) binds: [B:42:0x010e, B:14:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01aa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x02dd -> B:124:0x02e2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x015f -> B:56:0x0164). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
