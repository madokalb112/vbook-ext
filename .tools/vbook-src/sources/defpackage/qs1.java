package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class qs1 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qs1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        fs9 fs9Var = (fs9) this.b;
        br9 br9Var = (br9) this.c;
        pj7 pj7Var = (pj7) obj2;
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((yn0) obj).getClass();
        pj7Var.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if (dd4Var.V(iIntValue & 1, (iIntValue & Token.TARGET) != 144)) {
            cs9 cs9Var = (cs9) br9Var.getValue();
            boolean zF = dd4Var.f(fs9Var);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                s49 s49Var = new s49(1, fs9Var, fs9.class, "changeBookSortMode", "changeBookSortMode(Lcom/reader/app/ui/screen/setting/statistic/model/BookSortMode;)V", 0, 12);
                dd4Var.p0(s49Var);
                objQ = s49Var;
            }
            h67.U(pj7Var, cs9Var, (kb4) ((ei5) objQ), tg9.c, dd4Var, ((iIntValue >> 3) & 14) | 3072);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        o9b o9bVar = (o9b) this.b;
        br9 br9Var = (br9) this.c;
        pj7 pj7Var = (pj7) obj2;
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((yn0) obj).getClass();
        pj7Var.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        int i = iIntValue;
        if (dd4Var.V(i & 1, (i & Token.TARGET) != 144)) {
            l9b l9bVar = (l9b) br9Var.getValue();
            px3 px3Var = tg9.c;
            boolean zF = dd4Var.f(o9bVar);
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (zF || objQ == fu6Var) {
                vra vraVar = new vra(1, o9bVar, o9b.class, "changeTurnByTouch", "changeTurnByTouch(I)V", 0, 7);
                dd4Var.p0(vraVar);
                objQ = vraVar;
            }
            kb4 kb4Var = (kb4) ((ei5) objQ);
            boolean zF2 = dd4Var.f(o9bVar);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == fu6Var) {
                vra vraVar2 = new vra(1, o9bVar, o9b.class, "changeTouchMode", "changeTouchMode(I)V", 0, 8);
                dd4Var.p0(vraVar2);
                objQ2 = vraVar2;
            }
            kb4 kb4Var2 = (kb4) ((ei5) objQ2);
            boolean zF3 = dd4Var.f(o9bVar);
            Object objQ3 = dd4Var.Q();
            if (zF3 || objQ3 == fu6Var) {
                vra vraVar3 = new vra(1, o9bVar, o9b.class, "changeTurnByKeyboard", "changeTurnByKeyboard(Z)V", 0, 9);
                dd4Var.p0(vraVar3);
                objQ3 = vraVar3;
            }
            kb4 kb4Var3 = (kb4) ((ei5) objQ3);
            boolean zF4 = dd4Var.f(o9bVar);
            Object objQ4 = dd4Var.Q();
            if (zF4 || objQ4 == fu6Var) {
                vra vraVar4 = new vra(1, o9bVar, o9b.class, "changeTurnByVolume", "changeTurnByVolume(Z)V", 0, 10);
                dd4Var.p0(vraVar4);
                objQ4 = vraVar4;
            }
            kb4 kb4Var4 = (kb4) ((ei5) objQ4);
            boolean zF5 = dd4Var.f(o9bVar);
            Object objQ5 = dd4Var.Q();
            if (zF5 || objQ5 == fu6Var) {
                vra vraVar5 = new vra(1, o9bVar, o9b.class, "changeRevertTurnByVolume", "changeRevertTurnByVolume(Z)V", 0, 11);
                dd4Var.p0(vraVar5);
                objQ5 = vraVar5;
            }
            kb4 kb4Var5 = (kb4) ((ei5) objQ5);
            boolean zF6 = dd4Var.f(o9bVar);
            Object objQ6 = dd4Var.Q();
            if (zF6 || objQ6 == fu6Var) {
                vra vraVar6 = new vra(1, o9bVar, o9b.class, "changeTurnPageAnim", "changeTurnPageAnim(Z)V", 0, 12);
                dd4Var.p0(vraVar6);
                objQ6 = vraVar6;
            }
            fe.F(l9bVar, pj7Var, px3Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, (kb4) ((ei5) objQ6), dd4Var, (i & Token.ASSIGN_MOD) | 384);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        ehb ehbVar = (ehb) this.b;
        br9 br9Var = (br9) this.c;
        pj7 pj7Var = (pj7) obj2;
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((yn0) obj).getClass();
        pj7Var.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if (dd4Var.V(iIntValue & 1, (iIntValue & Token.TARGET) != 144)) {
            dhb dhbVar = (dhb) br9Var.getValue();
            px3 px3Var = tg9.c;
            boolean zF = dd4Var.f(ehbVar);
            Object objQ = dd4Var.Q();
            Object obj5 = vl1.a;
            if (zF || objQ == obj5) {
                objQ = new ci4(ehbVar, 3);
                dd4Var.p0(objQ);
            }
            bc4 bc4Var = (bc4) objQ;
            boolean zF2 = dd4Var.f(ehbVar);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj5) {
                vra vraVar = new vra(1, ehbVar, ehb.class, "deleteAccount", "deleteAccount(Ljava/lang/String;)V", 0, 15);
                dd4Var.p0(vraVar);
                objQ2 = vraVar;
            }
            jf0.o(dhbVar, pj7Var, px3Var, bc4Var, (kb4) ((ei5) objQ2), dd4Var, (iIntValue & Token.ASSIGN_MOD) | 384);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x035f A[PHI: r0
  0x035f: PHI (r0v150 float) = (r0v149 float), (r0v155 float) binds: [B:78:0x036b, B:71:0x035a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ac4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r57, java.lang.Object r58, java.lang.Object r59, java.lang.Object r60) {
        /*
            Method dump skipped, instruction units count: 3378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qs1.g(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
