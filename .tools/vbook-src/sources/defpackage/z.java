package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public long c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(vca vcaVar, long j, ada adaVar, uca ucaVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 8;
        this.d = vcaVar;
        this.c = j;
        this.e = adaVar;
        this.f = ucaVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new z((yd5) this.e, this.c, (yy6) obj2, jt1Var, 0);
            case 1:
                z zVar = new z((e71) obj2, this.c, jt1Var);
                zVar.e = obj;
                return zVar;
            case 2:
                return new z(this.c, (my4) this.e, (a07) obj2, jt1Var);
            case 3:
                return new z((qg8) this.d, (qg8) this.e, (za5) obj2, this.c, jt1Var);
            case 4:
                return new z((sr5) this.e, (by3) obj2, this.c, jt1Var);
            case 5:
                z zVar2 = new z((gy8) this.e, this.c, (og8) obj2, jt1Var, 5);
                zVar2.d = obj;
                return zVar2;
            case 6:
                return new z((oy9) this.d, (ty9) this.e, this.c, (String) obj2, jt1Var);
            case 7:
                z zVar3 = new z((p5a) obj2, jt1Var);
                zVar3.e = obj;
                return zVar3;
            case 8:
                return new z((vca) this.d, this.c, (ada) this.e, (uca) obj2, jt1Var);
            case 9:
                return new z((a07) this.e, this.c, (yy6) obj2, jt1Var, 9);
            default:
                return new z((q6c) this.e, this.c, (Map) obj2, jt1Var, 10);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
        }
        return ((z) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fd, code lost:
    
        if (r3 == r9) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03e6, code lost:
    
        if (defpackage.ym.b(r2, r5, r11, r10, r4, 4) != r9) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0427, code lost:
    
        if (tn9.q(r4) == r1) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x044f, code lost:
    
        if (defpackage.tw1.H((r8 - r6) / 1000000, r4) == r1) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x056a, code lost:
    
        if (r0.b(r3, r4) != r2) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010c, code lost:
    
        if (r0.b(r8, r4) == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0171, code lost:
    
        if (r1.a(r2, r4) == r0) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0218 A[Catch: all -> 0x01b6, TRY_ENTER, TryCatch #3 {all -> 0x01b6, blocks: (B:94:0x01b0, B:111:0x0218, B:112:0x021d), top: B:291:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025d A[LOOP:0: B:135:0x025d->B:304:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e71 e71Var, long j, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 1;
        this.f = e71Var;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(sr5 sr5Var, by3 by3Var, long j, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 4;
        this.e = sr5Var;
        this.f = by3Var;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(qg8 qg8Var, qg8 qg8Var2, za5 za5Var, long j, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 3;
        this.d = qg8Var;
        this.e = qg8Var2;
        this.f = za5Var;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(oy9 oy9Var, ty9 ty9Var, long j, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 6;
        this.d = oy9Var;
        this.e = ty9Var;
        this.c = j;
        this.f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p5a p5aVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 7;
        this.f = p5aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(long j, my4 my4Var, a07 a07Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 2;
        this.c = j;
        this.e = my4Var;
        this.f = a07Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj, long j, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = obj;
        this.c = j;
        this.f = obj2;
    }
}
