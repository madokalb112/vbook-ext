package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xpa extends o1a implements yb4 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ hra G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;
    public final /* synthetic */ String J;
    public final /* synthetic */ String K;
    public Object a;
    public HashMap b;
    public HashSet c;
    public HashSet d;
    public x07 e;
    public pg8 f;
    public Iterator s;
    public w07 t;
    public HashMap u;
    public String v;
    public String w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpa(hra hraVar, String str, String str2, String str3, String str4, jt1 jt1Var) {
        super(2, jt1Var);
        this.G = hraVar;
        this.H = str;
        this.I = str2;
        this.J = str3;
        this.K = str4;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        xpa xpaVar = new xpa(this.G, this.H, this.I, this.J, this.K, jt1Var);
        xpaVar.F = obj;
        return xpaVar;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((xpa) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x0574, code lost:
    
        r7 = r20;
        r5 = r21;
        r1 = r1;
        r2 = r2;
        r4 = r4;
        r10 = r18;
        r3 = r3;
        r8 = r8;
        r14 = r14;
        r0 = r0;
        r6 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014c A[PHI: r1
  0x014c: PHI (r1v9 java.lang.Object) = (r1v5 java.lang.Object), (r1v12 java.lang.Object) binds: [B:20:0x0149, B:13:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0224 A[PHI: r1 r3 r4 r6 r7 r9 r11 r12
  0x0224: PHI (r1v15 int) = (r1v13 int), (r1v16 int) binds: [B:38:0x0220, B:11:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x0224: PHI (r3v12 int) = (r3v10 int), (r3v13 int) binds: [B:38:0x0220, B:11:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x0224: PHI (r4v11 int) = (r4v9 int), (r4v12 int) binds: [B:38:0x0220, B:11:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x0224: PHI (r6v14 int) = (r6v12 int), (r6v15 int) binds: [B:38:0x0220, B:11:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x0224: PHI (r7v7 int) = (r7v5 int), (r7v8 int) binds: [B:38:0x0220, B:11:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x0224: PHI (r9v10 java.util.HashMap) = (r9v7 java.util.HashMap), (r9v12 java.util.HashMap) binds: [B:38:0x0220, B:11:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x0224: PHI (r11v8 v5b) = (r11v6 v5b), (r11v11 v5b) binds: [B:38:0x0220, B:11:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x0224: PHI (r12v7 java.lang.Object) = (r12v6 java.lang.Object), (r12v12 java.lang.Object) binds: [B:38:0x0220, B:11:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0239 A[LOOP:6: B:41:0x0233->B:43:0x0239, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02a0 A[LOOP:5: B:49:0x029a->B:51:0x02a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03f8  */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.AutoCloseable, x07] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v21, types: [x07] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v27, types: [x07] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x04a8 -> B:107:0x04bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x0626 -> B:143:0x0649). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x0636 -> B:143:0x0649). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:142:0x0645 -> B:143:0x0649). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x03e0 -> B:91:0x03f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x041e -> B:100:0x043c). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
