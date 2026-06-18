package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class br2 extends o1a implements yb4 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ ir2 C;
    public Object a;
    public ir2 b;
    public vm3 c;
    public ho2 d;
    public fr9 e;
    public b07 f;
    public Object s;
    public HashMap t;
    public String u;
    public String v;
    public wq2 w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br2(ir2 ir2Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.C = ir2Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        br2 br2Var = new br2(this.C, jt1Var);
        br2Var.B = obj;
        return br2Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((br2) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0384, code lost:
    
        if (r0 == r11) goto L128;
     */
    /* JADX WARN: Path cross not found for [B:90:0x026b, B:93:0x0283], limit reached: 151 */
    /* JADX WARN: Path cross not found for [B:93:0x0283, B:90:0x026b], limit reached: 151 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x032a A[Catch: all -> 0x0322, TryCatch #0 {all -> 0x0322, blocks: (B:105:0x02e9, B:109:0x02fb, B:116:0x0326, B:118:0x032a, B:119:0x032e, B:101:0x02b8), top: B:143:0x02e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039a A[LOOP:0: B:136:0x039a->B:148:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[PHI: r0 r2 r5
  0x00a4: PHI (r0v28 int) = (r0v25 int), (r0v29 int) binds: [B:76:0x0233, B:23:0x00a1] A[DONT_GENERATE, DONT_INLINE]
  0x00a4: PHI (r2v22 vm3) = (r2v18 vm3), (r2v23 vm3) binds: [B:76:0x0233, B:23:0x00a1] A[DONT_GENERATE, DONT_INLINE]
  0x00a4: PHI (r5v23 ir2) = (r5v20 ir2), (r5v27 ir2) binds: [B:76:0x0233, B:23:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf A[PHI: r0 r2 r5 r8
  0x00cf: PHI (r0v23 int) = (r0v21 int), (r0v24 int) binds: [B:58:0x01a1, B:30:0x00cd] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r2v15 vm3) = (r2v13 vm3), (r2v17 vm3) binds: [B:58:0x01a1, B:30:0x00cd] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r5v12 ir2) = (r5v7 ir2), (r5v18 ir2) binds: [B:58:0x01a1, B:30:0x00cd] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r8v17 java.lang.Object) = (r8v13 java.lang.Object), (r8v20 java.lang.Object) binds: [B:58:0x01a1, B:30:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f A[Catch: all -> 0x005a, LOOP:1: B:45:0x011f->B:150:?, LOOP_START, TryCatch #1 {all -> 0x005a, blocks: (B:8:0x004b, B:99:0x02a8, B:14:0x006b, B:96:0x029e, B:17:0x007d, B:93:0x0283, B:20:0x008f, B:88:0x0265, B:90:0x026b, B:23:0x00a1, B:78:0x0237, B:81:0x0252, B:26:0x00b7, B:66:0x01d8, B:68:0x01e1, B:71:0x01ea, B:75:0x0201, B:29:0x00ca, B:60:0x01a5, B:62:0x01b2, B:33:0x00de, B:51:0x0177, B:53:0x017b, B:57:0x0182, B:36:0x00ef, B:43:0x0119, B:45:0x011f, B:47:0x014d, B:39:0x00fa), top: B:145:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017b A[Catch: all -> 0x005a, TryCatch #1 {all -> 0x005a, blocks: (B:8:0x004b, B:99:0x02a8, B:14:0x006b, B:96:0x029e, B:17:0x007d, B:93:0x0283, B:20:0x008f, B:88:0x0265, B:90:0x026b, B:23:0x00a1, B:78:0x0237, B:81:0x0252, B:26:0x00b7, B:66:0x01d8, B:68:0x01e1, B:71:0x01ea, B:75:0x0201, B:29:0x00ca, B:60:0x01a5, B:62:0x01b2, B:33:0x00de, B:51:0x0177, B:53:0x017b, B:57:0x0182, B:36:0x00ef, B:43:0x0119, B:45:0x011f, B:47:0x014d, B:39:0x00fa), top: B:145:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b2 A[Catch: all -> 0x005a, TryCatch #1 {all -> 0x005a, blocks: (B:8:0x004b, B:99:0x02a8, B:14:0x006b, B:96:0x029e, B:17:0x007d, B:93:0x0283, B:20:0x008f, B:88:0x0265, B:90:0x026b, B:23:0x00a1, B:78:0x0237, B:81:0x0252, B:26:0x00b7, B:66:0x01d8, B:68:0x01e1, B:71:0x01ea, B:75:0x0201, B:29:0x00ca, B:60:0x01a5, B:62:0x01b2, B:33:0x00de, B:51:0x0177, B:53:0x017b, B:57:0x0182, B:36:0x00ef, B:43:0x0119, B:45:0x011f, B:47:0x014d, B:39:0x00fa), top: B:145:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e1 A[Catch: all -> 0x005a, TryCatch #1 {all -> 0x005a, blocks: (B:8:0x004b, B:99:0x02a8, B:14:0x006b, B:96:0x029e, B:17:0x007d, B:93:0x0283, B:20:0x008f, B:88:0x0265, B:90:0x026b, B:23:0x00a1, B:78:0x0237, B:81:0x0252, B:26:0x00b7, B:66:0x01d8, B:68:0x01e1, B:71:0x01ea, B:75:0x0201, B:29:0x00ca, B:60:0x01a5, B:62:0x01b2, B:33:0x00de, B:51:0x0177, B:53:0x017b, B:57:0x0182, B:36:0x00ef, B:43:0x0119, B:45:0x011f, B:47:0x014d, B:39:0x00fa), top: B:145:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ea A[Catch: all -> 0x005a, PHI: r0 r2 r5 r8 r9 r10
  0x01ea: PHI (r0v25 int) = (r0v23 int), (r0v26 int) binds: [B:61:0x01b0, B:70:0x01e5] A[DONT_GENERATE, DONT_INLINE]
  0x01ea: PHI (r2v18 vm3) = (r2v15 vm3), (r2v20 vm3) binds: [B:61:0x01b0, B:70:0x01e5] A[DONT_GENERATE, DONT_INLINE]
  0x01ea: PHI (r5v19 ho2) = (r5v14 ho2), (r5v21 ho2) binds: [B:61:0x01b0, B:70:0x01e5] A[DONT_GENERATE, DONT_INLINE]
  0x01ea: PHI (r8v21 fr9) = (r8v18 fr9), (r8v26 fr9) binds: [B:61:0x01b0, B:70:0x01e5] A[DONT_GENERATE, DONT_INLINE]
  0x01ea: PHI (r9v7 ir2) = (r9v6 ir2), (r9v12 ir2) binds: [B:61:0x01b0, B:70:0x01e5] A[DONT_GENERATE, DONT_INLINE]
  0x01ea: PHI (r10v12 java.lang.String) = (r10v8 java.lang.String), (r10v17 java.lang.String) binds: [B:61:0x01b0, B:70:0x01e5] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x005a, blocks: (B:8:0x004b, B:99:0x02a8, B:14:0x006b, B:96:0x029e, B:17:0x007d, B:93:0x0283, B:20:0x008f, B:88:0x0265, B:90:0x026b, B:23:0x00a1, B:78:0x0237, B:81:0x0252, B:26:0x00b7, B:66:0x01d8, B:68:0x01e1, B:71:0x01ea, B:75:0x0201, B:29:0x00ca, B:60:0x01a5, B:62:0x01b2, B:33:0x00de, B:51:0x0177, B:53:0x017b, B:57:0x0182, B:36:0x00ef, B:43:0x0119, B:45:0x011f, B:47:0x014d, B:39:0x00fa), top: B:145:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026b A[Catch: all -> 0x005a, TryCatch #1 {all -> 0x005a, blocks: (B:8:0x004b, B:99:0x02a8, B:14:0x006b, B:96:0x029e, B:17:0x007d, B:93:0x0283, B:20:0x008f, B:88:0x0265, B:90:0x026b, B:23:0x00a1, B:78:0x0237, B:81:0x0252, B:26:0x00b7, B:66:0x01d8, B:68:0x01e1, B:71:0x01ea, B:75:0x0201, B:29:0x00ca, B:60:0x01a5, B:62:0x01b2, B:33:0x00de, B:51:0x0177, B:53:0x017b, B:57:0x0182, B:36:0x00ef, B:43:0x0119, B:45:0x011f, B:47:0x014d, B:39:0x00fa), top: B:145:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x02e2 -> B:10:0x0052). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
