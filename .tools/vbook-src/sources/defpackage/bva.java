package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bva extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bva(Object obj, Object obj2, Object obj3, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                bva bvaVar = new bva((yb4) this.d, (so9) obj2, jt1Var, 0);
                bvaVar.c = obj;
                return bvaVar;
            case 1:
                return new bva((b15) this.c, (String) this.d, (mn8) obj2, jt1Var, 1);
            case 2:
                bva bvaVar2 = new bva((c1b) this.d, (xq2) obj2, jt1Var, 2);
                bvaVar2.c = obj;
                return bvaVar2;
            case 3:
                return new bva((a07) this.c, (m45) this.d, (a07) obj2, jt1Var, 3);
            case 4:
                return new bva((yf1) obj2, jt1Var, 4);
            case 5:
                bva bvaVar3 = new bva((phb) this.d, (String) obj2, jt1Var, 5);
                bvaVar3.c = obj;
                return bvaVar3;
            case 6:
                bva bvaVar4 = new bva((hib) obj2, jt1Var, 6);
                bvaVar4.c = obj;
                return bvaVar4;
            case 7:
                return new bva((pkb) this.c, (yn7) this.d, (lm8) obj2, jt1Var, 7);
            case 8:
                bva bvaVar5 = new bva((af) this.d, (String) obj2, jt1Var, 8);
                bvaVar5.c = obj;
                return bvaVar5;
            case 9:
                return new bva((h49) this.c, (ArrayList) this.d, (w1b) obj2, jt1Var, 9);
            case 10:
                return new bva((vj8) this.c, (d2c) this.d, (we7) obj2, jt1Var, 10);
            case 11:
                return new bva((t2c) this.c, (zz5) this.d, (m1c) obj2, jt1Var, 11);
            default:
                return new bva((n7c) this.c, (eb7) this.d, (ux7) obj2, jt1Var, 12);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
        }
        return ((bva) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:226:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:398:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d0 A[PHI: r3 r5
  0x01d0: PHI (r3v44 c24) = (r3v43 c24), (r3v50 c24) binds: [B:79:0x01cd, B:69:0x0184] A[DONT_GENERATE, DONT_INLINE]
  0x01d0: PHI (r5v21 java.lang.Object) = (r5v20 java.lang.Object), (r5v24 java.lang.Object) binds: [B:79:0x01cd, B:69:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bva.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bva(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bva(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = obj;
    }
}
