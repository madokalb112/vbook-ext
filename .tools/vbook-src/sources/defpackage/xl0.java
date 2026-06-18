package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xl0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Serializable t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl0(zl0 zl0Var, a82 a82Var, mc mcVar, mc mcVar2, AtomicInteger atomicInteger, List list, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 0;
        this.d = zl0Var;
        this.e = a82Var;
        this.f = mcVar;
        this.s = mcVar2;
        this.t = atomicInteger;
        this.u = list;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.u;
        Serializable serializable = this.t;
        Object obj3 = this.s;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                return new xl0((zl0) this.d, (a82) this.e, (mc) obj4, (mc) obj3, (AtomicInteger) serializable, (List) obj2, jt1Var);
            case 1:
                xl0 xl0Var = new xl0((String) obj4, (kp2) obj3, (String) serializable, (String) obj2, jt1Var, 1);
                xl0Var.e = obj;
                return xl0Var;
            default:
                xl0 xl0Var2 = new xl0((String) obj4, (ah6) obj3, (String) serializable, (String) obj2, jt1Var, 2);
                xl0Var2.e = obj;
                return xl0Var2;
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
        return ((xl0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8 A[Catch: all -> 0x0102, TRY_LEAVE, TryCatch #2 {all -> 0x0102, blocks: (B:9:0x0030, B:30:0x00d8, B:44:0x00fb, B:41:0x00f5, B:45:0x00fc, B:46:0x0101, B:13:0x0044, B:20:0x00a3, B:22:0x00af, B:26:0x00c2, B:16:0x0057, B:38:0x00f0, B:31:0x00e4), top: B:122:0x0026, inners: #3, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc A[Catch: all -> 0x0102, TryCatch #2 {all -> 0x0102, blocks: (B:9:0x0030, B:30:0x00d8, B:44:0x00fb, B:41:0x00f5, B:45:0x00fc, B:46:0x0101, B:13:0x0044, B:20:0x00a3, B:22:0x00af, B:26:0x00c2, B:16:0x0057, B:38:0x00f0, B:31:0x00e4), top: B:122:0x0026, inners: #3, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bf A[Catch: all -> 0x01e9, TRY_LEAVE, TryCatch #6 {all -> 0x01e9, blocks: (B:54:0x0114, B:78:0x01bf, B:92:0x01e2, B:89:0x01dc, B:93:0x01e3, B:94:0x01e8, B:58:0x0128, B:68:0x018f, B:70:0x019b, B:74:0x01a9, B:61:0x013a, B:64:0x0153, B:79:0x01cb, B:86:0x01d7), top: B:129:0x010a, inners: #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e3 A[Catch: all -> 0x01e9, TryCatch #6 {all -> 0x01e9, blocks: (B:54:0x0114, B:78:0x01bf, B:92:0x01e2, B:89:0x01dc, B:93:0x01e3, B:94:0x01e8, B:58:0x0128, B:68:0x018f, B:70:0x019b, B:74:0x01a9, B:61:0x013a, B:64:0x0153, B:79:0x01cb, B:86:0x01d7), top: B:129:0x010a, inners: #4, #7 }] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xl0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xl0(String str, Object obj, String str2, String str3, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.f = str;
        this.s = obj;
        this.t = str2;
        this.u = str3;
    }
}
