package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qi extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;
    public Object f;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(jt1 jt1Var, c24 c24Var, ib4 ib4Var, zb4 zb4Var, b24[] b24VarArr) {
        super(2, jt1Var);
        this.a = 1;
        this.t = b24VarArr;
        this.u = ib4Var;
        this.v = zb4Var;
        this.w = c24Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                qi qiVar = new qi((String) this.s, (Context) obj2, (vi) this.v, jt1Var);
                qiVar.e = obj;
                return qiVar;
            case 1:
                c24 c24Var = (c24) obj2;
                qi qiVar2 = new qi(jt1Var, c24Var, (ib4) this.u, (zb4) this.v, (b24[]) this.t);
                qiVar2.e = obj;
                return qiVar2;
            case 2:
                qi qiVar3 = new qi((ir2) obj2, jt1Var, 2);
                qiVar3.e = obj;
                return qiVar3;
            case 3:
                return new qi((ut2) obj2, jt1Var, 3);
            case 4:
                return new qi((nu2) obj2, jt1Var, 4);
            case 5:
                return new qi((cv2) obj2, (String) this.s, jt1Var);
            case 6:
                qi qiVar4 = new qi((pz5) obj2, jt1Var, 6);
                qiVar4.v = obj;
                return qiVar4;
            case 7:
                return new qi((yl9) obj2, jt1Var, 7);
            default:
                return new qi((ln9) obj2, jt1Var, 8);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
        }
        return ((qi) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0347, code lost:
    
        if (r2 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03ba, code lost:
    
        if (r2 == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x04cb, code lost:
    
        if (r3 == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x05b3, code lost:
    
        if (r2 == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x087b, code lost:
    
        if (r5 != 0) goto L375;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b4 A[Catch: all -> 0x0263, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0263, blocks: (B:118:0x025e, B:142:0x02b4), top: B:415:0x0233 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0462 A[LOOP:5: B:215:0x0462->B:431:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x06f4 A[Catch: all -> 0x05db, LOOP:8: B:326:0x06f4->B:437:?, LOOP_START, TryCatch #1 {all -> 0x05db, blocks: (B:290:0x05d6, B:343:0x0778, B:347:0x0784, B:296:0x05f2, B:340:0x075e, B:299:0x060d, B:324:0x06eb, B:326:0x06f4, B:330:0x070a, B:332:0x072e, B:334:0x073d, B:302:0x0626, B:320:0x06b9, B:305:0x0633, B:316:0x068f, B:308:0x063e, B:310:0x0642, B:312:0x0670), top: B:417:0x05c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x073d A[Catch: all -> 0x05db, TryCatch #1 {all -> 0x05db, blocks: (B:290:0x05d6, B:343:0x0778, B:347:0x0784, B:296:0x05f2, B:340:0x075e, B:299:0x060d, B:324:0x06eb, B:326:0x06f4, B:330:0x070a, B:332:0x072e, B:334:0x073d, B:302:0x0626, B:320:0x06b9, B:305:0x0633, B:316:0x068f, B:308:0x063e, B:310:0x0642, B:312:0x0670), top: B:417:0x05c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x089b A[LOOP:10: B:381:0x089b->B:441:?, LOOP_START, PHI: r5 r13
  0x089b: PHI (r5v14 int) = (r5v13 int), (r5v15 int) binds: [B:379:0x0897, B:441:?] A[DONT_GENERATE, DONT_INLINE]
  0x089b: PHI (r13v8 i65) = (r13v7 i65), (r13v14 i65) binds: [B:379:0x0897, B:441:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3 A[LOOP:0: B:40:0x00c3->B:421:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c3 A[LOOP:2: B:90:0x01c3->B:425:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0331 -> B:162:0x0334). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x03a4 -> B:180:0x03a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x04a1 -> B:191:0x03ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:269:0x0587 -> B:240:0x04fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:392:0x08d8 -> B:375:0x087b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:395:0x08f1 -> B:375:0x087b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:411:0x0982 -> B:412:0x0983). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00fd -> B:48:0x0104). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01fd -> B:98:0x0204). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(cv2 cv2Var, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 5;
        this.w = cv2Var;
        this.s = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi(n5b n5bVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.w = n5bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(String str, Context context, vi viVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 0;
        this.s = str;
        this.w = context;
        this.v = viVar;
    }
}
