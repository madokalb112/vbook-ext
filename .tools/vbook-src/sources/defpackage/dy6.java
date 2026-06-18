package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dy6 extends o1a implements yb4 {
    public hy1 a;
    public zu0 b;
    public Object c;
    public ai1 d;
    public du4 e;
    public long f;
    public long s;
    public long t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ut0 w;
    public final /* synthetic */ zu0 x;
    public final /* synthetic */ Long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy6(ut0 ut0Var, zu0 zu0Var, Long l, jt1 jt1Var) {
        super(2, jt1Var);
        this.w = ut0Var;
        this.x = zu0Var;
        this.y = l;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        dy6 dy6Var = new dy6(this.w, this.x, this.y, jt1Var);
        dy6Var.v = obj;
        return dy6Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((dy6) create((o38) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0305, code lost:
    
        if (r2.f.g(r19, r9) != r12) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0340, code lost:
    
        if (r0.f.g(r19, r3) == r12) goto L122;
     */
    /* JADX WARN: Path cross not found for [B:39:0x0141, B:42:0x015b], limit reached: 123 */
    /* JADX WARN: Path cross not found for [B:42:0x015b, B:39:0x0141], limit reached: 123 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a9 A[PHI: r0 r1 r3
  0x02a9: PHI (r0v26 o38) = (r0v25 o38), (r0v1 o38) binds: [B:98:0x02a5, B:10:0x0044] A[DONT_GENERATE, DONT_INLINE]
  0x02a9: PHI (r1v35 long) = (r1v33 long), (r1v36 long) binds: [B:98:0x02a5, B:10:0x0044] A[DONT_GENERATE, DONT_INLINE]
  0x02a9: PHI (r3v33 hy1) = (r3v31 hy1), (r3v36 hy1) binds: [B:98:0x02a5, B:10:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015b A[PHI: r0 r1 r2 r3 r5 r8
  0x015b: PHI (r0v20 o38) = (r0v1 o38), (r0v1 o38), (r0v1 o38), (r0v17 o38), (r0v22 o38) binds: [B:38:0x013f, B:40:0x0157, B:27:0x00d6, B:56:0x01b1, B:75:0x023b] A[DONT_GENERATE, DONT_INLINE]
  0x015b: PHI (r1v29 zu0) = (r1v8 zu0), (r1v8 zu0), (r1v10 zu0), (r1v25 zu0), (r1v30 zu0) binds: [B:38:0x013f, B:40:0x0157, B:27:0x00d6, B:56:0x01b1, B:75:0x023b] A[DONT_GENERATE, DONT_INLINE]
  0x015b: PHI (r2v10 zu0) = (r2v0 zu0), (r2v0 zu0), (r2v0 zu0), (r2v7 zu0), (r2v12 zu0) binds: [B:38:0x013f, B:40:0x0157, B:27:0x00d6, B:56:0x01b1, B:75:0x023b] A[DONT_GENERATE, DONT_INLINE]
  0x015b: PHI (r3v26 long) = (r3v2 long), (r3v2 long), (r3v4 long), (r3v23 long), (r3v28 long) binds: [B:38:0x013f, B:40:0x0157, B:27:0x00d6, B:56:0x01b1, B:75:0x023b] A[DONT_GENERATE, DONT_INLINE]
  0x015b: PHI (r5v26 hy1) = (r5v1 hy1), (r5v1 hy1), (r5v3 hy1), (r5v22 hy1), (r5v27 hy1) binds: [B:38:0x013f, B:40:0x0157, B:27:0x00d6, B:56:0x01b1, B:75:0x023b] A[DONT_GENERATE, DONT_INLINE]
  0x015b: PHI (r8v14 int) = (r8v0 int), (r8v0 int), (r8v0 int), (r8v8 int), (r8v15 int) binds: [B:38:0x013f, B:40:0x0157, B:27:0x00d6, B:56:0x01b1, B:75:0x023b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ab A[PHI: r0 r1 r2 r3 r5 r8 r13
  0x01ab: PHI (r0v17 o38) = (r0v1 o38), (r0v18 o38) binds: [B:24:0x00b1, B:53:0x01a7] A[DONT_GENERATE, DONT_INLINE]
  0x01ab: PHI (r1v25 zu0) = (r1v13 zu0), (r1v27 zu0) binds: [B:24:0x00b1, B:53:0x01a7] A[DONT_GENERATE, DONT_INLINE]
  0x01ab: PHI (r2v7 zu0) = (r2v0 zu0), (r2v8 zu0) binds: [B:24:0x00b1, B:53:0x01a7] A[DONT_GENERATE, DONT_INLINE]
  0x01ab: PHI (r3v23 long) = (r3v7 long), (r3v24 long) binds: [B:24:0x00b1, B:53:0x01a7] A[DONT_GENERATE, DONT_INLINE]
  0x01ab: PHI (r5v22 hy1) = (r5v6 hy1), (r5v24 hy1) binds: [B:24:0x00b1, B:53:0x01a7] A[DONT_GENERATE, DONT_INLINE]
  0x01ab: PHI (r8v8 int) = (r8v0 int), (r8v12 int) binds: [B:24:0x00b1, B:53:0x01a7] A[DONT_GENERATE, DONT_INLINE]
  0x01ab: PHI (r13v27 java.lang.Object) = (r13v14 java.lang.Object), (r13v33 java.lang.Object) binds: [B:24:0x00b1, B:53:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0213 A[Catch: all -> 0x024a, TRY_LEAVE, TryCatch #4 {all -> 0x024a, blocks: (B:67:0x020a, B:69:0x0213), top: B:133:0x020a }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024f A[Catch: all -> 0x0244, TryCatch #1 {all -> 0x0244, blocks: (B:75:0x023b, B:71:0x0231, B:81:0x024f, B:82:0x025c), top: B:127:0x023b }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0275 A[PHI: r0 r3 r5
  0x0275: PHI (r0v5 o38) = (r0v19 o38), (r0v20 o38) binds: [B:48:0x0181, B:43:0x015f] A[DONT_GENERATE, DONT_INLINE]
  0x0275: PHI (r3v12 long) = (r3v25 long), (r3v26 long) binds: [B:48:0x0181, B:43:0x015f] A[DONT_GENERATE, DONT_INLINE]
  0x0275: PHI (r5v11 hy1) = (r5v25 hy1), (r5v26 hy1) binds: [B:48:0x0181, B:43:0x015f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01b1 -> B:42:0x015b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0239 -> B:127:0x023b). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
