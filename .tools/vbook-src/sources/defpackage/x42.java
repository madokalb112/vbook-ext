package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x42 extends o1a implements kb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x42(Object obj, Object obj2, Object obj3, Object obj4, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new x42((rg8) this.e, (a52) obj2, (pg8) obj, jt1Var, 0);
            case 1:
                return new x42((a52) obj2, (jx1) this.e, (yb4) obj, jt1Var);
            case 2:
                return new x42((nx3) obj2, obj, jt1Var);
            case 3:
                return new x42((kb4) this.e, (lf2) obj2, (String) obj, jt1Var, 3);
            case 4:
                return new x42((vx1) this.d, (rd7) this.e, (yn7) obj2, (lm8) obj, jt1Var, 4);
            case 5:
                return new x42((ua8) this.d, (ArrayList) this.e, (ra8) obj2, (re) obj, jt1Var, 5);
            default:
                return new x42((ua8) this.e, (ra8) obj2, (re) obj, jt1Var, 6);
        }
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj;
        switch (i) {
        }
        return ((x42) create(jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x02e8, code lost:
    
        if (r0 != r8) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c2 -> B:43:0x00c5). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x42.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x42(nx3 nx3Var, Object obj, jt1 jt1Var) {
        super(1, jt1Var);
        this.a = 2;
        this.c = nx3Var;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x42(Object obj, Object obj2, Object obj3, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x42(a52 a52Var, jx1 jx1Var, yb4 yb4Var, jt1 jt1Var) {
        super(1, jt1Var);
        this.a = 1;
        this.c = a52Var;
        this.e = jx1Var;
        this.f = yb4Var;
    }
}
