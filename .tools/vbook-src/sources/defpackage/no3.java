package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class no3 extends o1a implements yb4 {
    public Object a;
    public Object b;
    public Object c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ oo3 s;
    public final /* synthetic */ HashMap t;
    public final /* synthetic */ ng8 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no3(oo3 oo3Var, HashMap map, ng8 ng8Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.s = oo3Var;
        this.t = map;
        this.u = ng8Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        no3 no3Var = new no3(this.s, this.t, this.u, jt1Var);
        no3Var.f = obj;
        return no3Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((no3) create((gnb) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0121, code lost:
    
        if (r1 == r12) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0186, code lost:
    
        if (r1 != r12) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0105 A[PHI: r1 r3 r4 r9
  0x0105: PHI (r1v3 gnb) = (r1v2 gnb), (r1v23 gnb) binds: [B:29:0x0101, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]
  0x0105: PHI (r3v2 java.lang.Object) = (r3v1 java.lang.Object), (r3v43 java.lang.Object) binds: [B:29:0x0101, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]
  0x0105: PHI (r4v1 java.util.HashMap) = (r4v0 java.util.HashMap), (r4v4 java.util.HashMap) binds: [B:29:0x0101, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]
  0x0105: PHI (r9v1 int) = (r9v0 int), (r9v2 int) binds: [B:29:0x0101, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0172  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
