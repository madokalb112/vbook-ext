package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pd7 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ rd7 c;
    public final /* synthetic */ yn7 d;
    public final /* synthetic */ lm8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd7(rd7 rd7Var, yn7 yn7Var, lm8 lm8Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = rd7Var;
        this.d = yn7Var;
        this.e = lm8Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new pd7(this.c, this.d, this.e, jt1Var, 0);
            case 1:
                return new pd7(this.c, this.d, this.e, jt1Var, 1);
            case 2:
                return new pd7(this.c, this.d, this.e, jt1Var, 2);
            case 3:
                return new pd7(this.c, this.d, this.e, jt1Var, 3);
            case 4:
                return new pd7(this.c, this.d, this.e, jt1Var, 4);
            case 5:
                return new pd7(this.c, this.d, this.e, jt1Var, 5);
            default:
                return new pd7(this.c, this.d, this.e, jt1Var, 6);
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
        return ((pd7) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0388 A[LOOP:0: B:168:0x0382->B:170:0x0388, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03eb A[PHI: r5
  0x03eb: PHI (r5v2 int) = (r5v1 int), (r5v1 int), (r5v1 int), (r5v13 int) binds: [B:194:0x03f3, B:196:0x03f6, B:198:0x03f9, B:189:0x03e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x045a  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r53) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
