package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.reader.data.download.impl.AndroidDownloadService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tf extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(String str, String str2, em3 em3Var, cm3 cm3Var, kl3 kl3Var, jl3 jl3Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 4;
        this.s = str;
        this.t = str2;
        this.c = em3Var;
        this.d = cm3Var;
        this.e = kl3Var;
        this.f = jl3Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                tf tfVar = new tf((AndroidDownloadService) this.f, (String) obj2, jt1Var, 0);
                tfVar.d = obj;
                return tfVar;
            case 1:
                tf tfVar2 = new tf((h11) this.e, (ym) this.f, (a07) this.s, (a07) obj2, jt1Var, 1);
                tfVar2.c = obj;
                return tfVar2;
            case 2:
                tf tfVar3 = new tf((zz5) this.f, (vj8) this.s, (d2c) obj2, jt1Var);
                tfVar3.c = obj;
                return tfVar3;
            case 3:
                tf tfVar4 = new tf(3, jt1Var, (List) this.s, (ArrayList) obj2, false);
                tfVar4.d = obj;
                return tfVar4;
            case 4:
                return new tf((String) this.s, (String) obj2, (em3) this.c, (cm3) this.d, (kl3) this.e, (jl3) this.f, jt1Var);
            case 5:
                tf tfVar5 = new tf((Context) this.d, (au) this.e, (wd0) this.f, (Bundle) this.s, (zb4) obj2, jt1Var, 5);
                tfVar5.c = obj;
                return tfVar5;
            case 6:
                tf tfVar6 = new tf(6, jt1Var, (q07) this.s, (kb4) obj2, false);
                tfVar6.d = obj;
                return tfVar6;
            case 7:
                tf tfVar7 = new tf((rg8) this.e, (i57) this.f, (rg8) this.s, (o57) obj2, jt1Var, 7);
                tfVar7.c = obj;
                return tfVar7;
            case 8:
                return new tf((pm1) this.d, (ju) this.e, (Context) this.f, (ff8) this.s, (ava) obj2, jt1Var, 8);
            case 9:
                tf tfVar8 = new tf((zx7) this.d, (kb4) this.e, (kb4) this.f, (zb4) this.s, (kb4) obj2, jt1Var, 9);
                tfVar8.c = obj;
                return tfVar8;
            case 10:
                return new tf((aoa) this.e, (yba) this.f, (hra) this.s, (a07) obj2, jt1Var, 10);
            case 11:
                tf tfVar9 = new tf((sra) this.f, (bi5) obj2, jt1Var, 11);
                tfVar9.c = obj;
                return tfVar9;
            case 12:
                tf tfVar10 = new tf((c1b) this.d, (xq2) this.e, (String) this.s, (Long) this.f, (List) obj2, jt1Var);
                tfVar10.c = obj;
                return tfVar10;
            default:
                return new tf(13, jt1Var, (sbb) this.s, (bi1) obj2, false);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
        }
        return ((tf) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x03e8, code lost:
    
        if (r8.f(r10, (int) (r1 - (r13 / 2.0f)), r35) == r7) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03f8, code lost:
    
        if (r8.l(r10, (int) (r1 - (r13 / 2.0f)), r35) == r7) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x040c, code lost:
    
        if (r8.f(r10, 0, r35) == r7) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x04b9, code lost:
    
        if (r0.Q(r35) == r5) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04c3, code lost:
    
        if (r1 != r5) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0578, code lost:
    
        if (r1 == r5) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0728, code lost:
    
        if (r1.c(r7, r0, r35) == r5) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:354:0x082c, B:361:0x0852], limit reached: 511 */
    /* JADX WARN: Path cross not found for [B:361:0x0852, B:354:0x082c], limit reached: 511 */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bf A[Catch: all -> 0x0278, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x0278, blocks: (B:114:0x02bf, B:82:0x025d, B:84:0x0266, B:88:0x027a), top: B:473:0x025d }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0946 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x099f  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x02ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21, types: [int] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v29, types: [int, r07] */
    /* JADX WARN: Type inference failed for: r2v6, types: [yd5] */
    /* JADX WARN: Type inference failed for: r2v8, types: [yd5] */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v63, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r9v0, types: [jt1] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:360:0x0850 -> B:354:0x082c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:362:0x0879 -> B:354:0x082c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:414:0x0993 -> B:416:0x0997). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(zz5 zz5Var, vj8 vj8Var, d2c d2cVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 2;
        this.f = zz5Var;
        this.s = vj8Var;
        this.t = d2cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(c1b c1bVar, xq2 xq2Var, String str, Long l, List list, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 12;
        this.d = c1bVar;
        this.e = xq2Var;
        this.s = str;
        this.f = l;
        this.t = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.f = obj;
        this.t = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf(Object obj, Object obj2, Object obj3, Object obj4, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = obj;
        this.f = obj2;
        this.s = obj3;
        this.t = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.s = obj4;
        this.t = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf(int i, jt1 jt1Var, Object obj, Object obj2, boolean z) {
        super(2, jt1Var);
        this.a = i;
        this.s = obj;
        this.t = obj2;
    }
}
