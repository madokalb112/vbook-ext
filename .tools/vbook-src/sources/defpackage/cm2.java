package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cm2 implements mw4 {
    public static final cm2 a = new cm2();
    public static final dm2 b;
    public static final dm2 c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;

    static {
        int i;
        int i2;
        int i3;
        dm2 dm2Var = new dm2();
        int[] iArr = new int[288];
        int i4 = 0;
        while (true) {
            i = Token.LABEL;
            if (i4 >= 144) {
                break;
            }
            iArr[i4] = 8;
            i4++;
        }
        while (true) {
            i2 = 256;
            if (i >= 256) {
                break;
            }
            iArr[i] = 9;
            i++;
        }
        while (true) {
            if (i2 >= 280) {
                break;
            }
            iArr[i2] = 7;
            i2++;
        }
        for (i3 = 280; i3 < 288; i3++) {
            iArr[i3] = 8;
        }
        dm2Var.d(iArr, 0, 288);
        b = dm2Var;
        dm2 dm2Var2 = new dm2();
        int[] iArr2 = new int[32];
        for (int i5 = 0; i5 < 32; i5++) {
            iArr2[i5] = 5;
        }
        dm2Var2.d(iArr2, 0, 32);
        c = dm2Var2;
        d = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0, 0, 0};
        e = new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, Token.HOOK, Token.DO, Token.TO_OBJECT, 195, 227, 258, 0, 0};
        f = new int[]{0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};
        g = new int[]{1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, Token.DEFAULT, 193, 257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577, 0, 0};
        h = new int[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[PHI: r11 r12 r13
  0x004a: PHI (r11v11 int) = (r11v5 int), (r11v13 int) binds: [B:14:0x0041, B:48:0x00fa] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r12v8 uf4) = (r12v5 uf4), (r12v13 uf4) binds: [B:14:0x0041, B:48:0x00fa] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r13v7 lp8) = (r13v4 lp8), (r13v8 lp8) binds: [B:14:0x0041, B:48:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec A[PHI: r11 r12 r13
  0x00ec: PHI (r11v13 int) = (r11v4 int), (r11v14 int) binds: [B:16:0x004e, B:45:0x00e9] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r12v13 uf4) = (r12v4 uf4), (r12v14 uf4) binds: [B:16:0x004e, B:45:0x00e9] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r13v8 lp8) = (r13v3 lp8), (r13v9 lp8) binds: [B:16:0x004e, B:45:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x012c -> B:21:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object e(defpackage.cm2 r10, lp8 r11, uf4 r12, defpackage.kt1 r13) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.e(cm2, lp8, uf4, kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x046f, code lost:
    
        if (r2.x(r3, r0, r4) == r7) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:32:0x01a7, B:35:0x01b0], limit reached: 126 */
    /* JADX WARN: Path cross not found for [B:35:0x01b0, B:32:0x01a7], limit reached: 126 */
    /* JADX WARN: Path cross not found for [B:96:0x036f, B:99:0x0378], limit reached: 126 */
    /* JADX WARN: Path cross not found for [B:99:0x0378, B:96:0x036f], limit reached: 126 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x037e A[PHI: r0 r1 r2 r3 r4 r5 r8 r9 r10 r11 r12 r21
  0x037e: PHI (r0v39 ??) = (r0v7 ??), (r0v41 ??) binds: [B:14:0x0066, B:100:0x037a] A[DONT_GENERATE, DONT_INLINE]
  0x037e: PHI (r1v19 gm2) = (r1v2 gm2), (r1v21 gm2) binds: [B:14:0x0066, B:100:0x037a] A[DONT_GENERATE, DONT_INLINE]
  0x037e: PHI (r2v25 int[]) = (r2v8 int[]), (r2v27 int[]) binds: [B:14:0x0066, B:100:0x037a] A[DONT_GENERATE, DONT_INLINE]
  0x037e: PHI (r3v27 int[]) = (r3v11 int[]), (r3v30 int[]) binds: [B:14:0x0066, B:100:0x037a] A[DONT_GENERATE, DONT_INLINE]
  0x037e: PHI (r4v22 dm2) = (r4v8 dm2), (r4v24 dm2) binds: [B:14:0x0066, B:100:0x037a] A[DONT_GENERATE, DONT_INLINE]
  0x037e: PHI (r5v20 dm2) = (r5v10 dm2), (r5v22 dm2) binds: [B:14:0x0066, B:100:0x037a] A[DONT_GENERATE, DONT_INLINE]
  0x037e: PHI (r8v21 em2) = (r8v9 em2), (r8v23 em2) binds: [B:14:0x0066, B:100:0x037a] A[DONT_GENERATE, DONT_INLINE]
  0x037e: PHI (r9v22 lp8) = (r9v9 lp8), (r9v24 lp8) binds: [B:14:0x0066, B:100:0x037a] A[DONT_GENERATE, DONT_INLINE]
  0x037e: PHI (r10v28 cm2) = (r10v11 cm2), (r10v30 cm2) binds: [B:14:0x0066, B:100:0x037a] A[DONT_GENERATE, DONT_INLINE]
  0x037e: PHI (r11v21 dm2) = (r11v6 dm2), (r11v23 dm2) binds: [B:14:0x0066, B:100:0x037a] A[DONT_GENERATE, DONT_INLINE]
  0x037e: PHI (r12v33 dm2) = (r12v5 dm2), (r12v34 dm2) binds: [B:14:0x0066, B:100:0x037a] A[DONT_GENERATE, DONT_INLINE]
  0x037e: PHI (r21v7 heb) = (r21v1 heb), (r21v8 heb) binds: [B:14:0x0066, B:100:0x037a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b5 A[PHI: r1 r2 r3 r4 r5 r6 r8 r9 r10 r13
  0x01b5: PHI (r1v9 gm2) = (r1v2 gm2), (r1v14 gm2) binds: [B:18:0x00e2, B:36:0x01b1] A[DONT_GENERATE, DONT_INLINE]
  0x01b5: PHI (r2v14 int[]) = (r2v4 int[]), (r2v17 int[]) binds: [B:18:0x00e2, B:36:0x01b1] A[DONT_GENERATE, DONT_INLINE]
  0x01b5: PHI (r3v17 int[]) = (r3v5 int[]), (r3v20 int[]) binds: [B:18:0x00e2, B:36:0x01b1] A[DONT_GENERATE, DONT_INLINE]
  0x01b5: PHI (r4v13 dm2) = (r4v2 dm2), (r4v15 dm2) binds: [B:18:0x00e2, B:36:0x01b1] A[DONT_GENERATE, DONT_INLINE]
  0x01b5: PHI (r5v13 dm2) = (r5v4 dm2), (r5v15 dm2) binds: [B:18:0x00e2, B:36:0x01b1] A[DONT_GENERATE, DONT_INLINE]
  0x01b5: PHI (r6v11 heb) = (r6v0 heb), (r6v18 heb) binds: [B:18:0x00e2, B:36:0x01b1] A[DONT_GENERATE, DONT_INLINE]
  0x01b5: PHI (r8v14 em2) = (r8v3 em2), (r8v15 em2) binds: [B:18:0x00e2, B:36:0x01b1] A[DONT_GENERATE, DONT_INLINE]
  0x01b5: PHI (r9v14 lp8) = (r9v4 lp8), (r9v16 lp8) binds: [B:18:0x00e2, B:36:0x01b1] A[DONT_GENERATE, DONT_INLINE]
  0x01b5: PHI (r10v16 cm2) = (r10v5 cm2), (r10v18 cm2) binds: [B:18:0x00e2, B:36:0x01b1] A[DONT_GENERATE, DONT_INLINE]
  0x01b5: PHI (r13v4 int) = (r13v0 int), (r13v10 int) binds: [B:18:0x00e2, B:36:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0245 A[LOOP:1: B:55:0x0243->B:56:0x0245, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x036f  */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v8, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0402 -> B:94:0x0348). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0428 -> B:116:0x042b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x02b8 -> B:94:0x0348). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x033f -> B:94:0x0348). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object f(defpackage.cm2 r23, lp8 r24, uf4 r25, defpackage.kt1 r26) {
        /*
            Method dump skipped, instruction units count: 1184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.f(cm2, lp8, uf4, kt1):java.lang.Object");
    }

    @Override // defpackage.mw4
    public final Object a(lp8 lp8Var, uf4 uf4Var, jt1 jt1Var) {
        return f(this, lp8Var, uf4Var, (kt1) jt1Var);
    }

    @Override // defpackage.en1
    public final Object b(vx vxVar, iy iyVar, o1a o1aVar) {
        return tw1.m0(this, vxVar, iyVar, o1aVar);
    }

    @Override // defpackage.mw4
    public final Object c(lp8 lp8Var, uf4 uf4Var, float f2, jt1 jt1Var) {
        return e(this, lp8Var, uf4Var, (kt1) jt1Var);
    }

    @Override // defpackage.en1
    public final Object d(i02 i02Var, yy yyVar, cp4 cp4Var, l5c l5cVar) {
        return tw1.D(this, i02Var, yyVar, cp4Var, l5cVar);
    }

    @Override // defpackage.en1
    public final String getName() {
        return "DEFLATE";
    }
}
