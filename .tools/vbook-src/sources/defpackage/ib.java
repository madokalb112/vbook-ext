package defpackage;

import androidx.glance.session.SessionWorker;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ib extends o1a implements kb4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib(Object obj, Object obj2, Object obj3, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new ib((ob) obj2, this.c, (ac4) obj, jt1Var, 0);
            case 1:
                return new ib((pb) obj2, this.c, (ac4) obj, jt1Var, 1);
            case 2:
                return new ib((mw4) obj2, (r5a) this.c, (r5a) obj, jt1Var, 2);
            case 3:
                return new ib((SessionWorker) obj2, (ava) obj, jt1Var);
            case 4:
                return new ib((gja) obj2, (bi5) this.c, (lm8) obj, jt1Var, 4);
            case 5:
                return new ib((hja) obj2, (bi5) this.c, (lm8) obj, jt1Var, 5);
            case 6:
                return new ib((lja) obj2, (bi5) this.c, (lm8) obj, jt1Var, 6);
            default:
                return new ib((nja) obj2, (bi5) this.c, (lm8) obj, jt1Var, 7);
        }
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj;
        switch (i) {
        }
        return ((ib) create(jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(SessionWorker sessionWorker, ava avaVar, jt1 jt1Var) {
        super(1, jt1Var);
        this.a = 3;
        this.e = sessionWorker;
        this.d = avaVar;
    }
}
