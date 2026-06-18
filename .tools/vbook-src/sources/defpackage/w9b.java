package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w9b extends o1a implements yb4 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ x9b C;
    public final /* synthetic */ String D;
    public final /* synthetic */ jl3 E;
    public a82 a;
    public Object b;
    public c24 c;
    public Object d;
    public Closeable e;
    public jl3 f;
    public x9b s;
    public lr0 t;
    public ng8 u;
    public lr0 v;
    public Object w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9b(x9b x9bVar, String str, jl3 jl3Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.C = x9bVar;
        this.D = str;
        this.E = jl3Var;
    }

    public static final heb m(ng8 ng8Var, lr0 lr0Var, String str) {
        String string = bw9.B0(str).toString();
        int length = string.length();
        heb hebVar = heb.a;
        if (length == 0) {
            return hebVar;
        }
        if (ng8Var.a) {
            lr0Var.d0("\n\n");
        }
        lr0Var.d0(string);
        ng8Var.a = true;
        return hebVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        w9b w9bVar = new w9b(this.C, this.D, this.E, jt1Var);
        w9bVar.B = obj;
        return w9bVar;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((w9b) create((c24) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0493, code lost:
    
        if (r1 == r12) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04f8, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x049f, code lost:
    
        r22 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d3, code lost:
    
        if (defpackage.dj0.e(r2, (java.lang.String) r0, r21) != r12) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0238, code lost:
    
        if (defpackage.dj0.e(r2, (java.lang.String) r0, r21) != r12) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:202:0x03e6, B:130:0x03f8], limit reached: 199 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x039c A[Catch: all -> 0x04ae, TRY_LEAVE, TryCatch #7 {all -> 0x04ae, blocks: (B:108:0x0396, B:110:0x039c, B:107:0x0387, B:89:0x0313), top: B:200:0x0313 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fa A[PHI: r0 r3
  0x01fa: PHI (r0v28 a82) = (r0v26 a82), (r0v42 a82) binds: [B:55:0x01f6, B:33:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x01fa: PHI (r3v11 java.lang.Object) = (r3v10 java.lang.Object), (r3v15 java.lang.Object) binds: [B:55:0x01f6, B:33:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0317  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [lr0] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v3, types: [he8, java.io.Closeable, lr0] */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v4, types: [lr0] */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16, types: [a82, c24, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [a82, c24, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [lr0] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17, types: [lr0] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v10, types: [lr0] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [lr0] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [lr0] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x0493 -> B:160:0x049f). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w9b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
