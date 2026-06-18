package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ti extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(js1 js1Var, hra hraVar, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 18;
        this.c = js1Var;
        this.d = hraVar;
        this.b = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new ti((String) this.b, (Context) this.c, (d66) obj2, jt1Var, 0);
            case 1:
                return new ti((String) this.b, (Context) this.c, (vi) obj2, jt1Var, 1);
            case 2:
                return new ti((m90) this.b, (vx1) this.c, (st5) obj2, jt1Var, 2);
            case 3:
                return new ti((cp2) this.b, (a07) this.c, (a07) obj2, jt1Var, 3);
            case 4:
                return new ti((e71) this.b, (a07) this.c, (a07) obj2, jt1Var, 4);
            case 5:
                ti tiVar = new ti((xq1) this.c, (mz0) obj2, jt1Var, 5);
                tiVar.b = obj;
                return tiVar;
            case 6:
                return new ti((j15) this.b, (l25) this.c, (a07) obj2, jt1Var, 6);
            case 7:
                ti tiVar2 = new ti((pp3) this.c, (m8) obj2, jt1Var, 7);
                tiVar2.b = obj;
                return tiVar2;
            case 8:
                ti tiVar3 = new ti((rg8) this.c, (h11) obj2, jt1Var, 8);
                tiVar3.b = obj;
                return tiVar3;
            case 9:
                return new ti((ut0) this.b, (bbb) this.c, (ue5) obj2, jt1Var, 9);
            case 10:
                return new ti((gm5) this.b, (a07) this.c, (a07) obj2, jt1Var, 10);
            case 11:
                ti tiVar4 = new ti((zx7) this.c, (tda) obj2, jt1Var, 11);
                tiVar4.b = obj;
                return tiVar4;
            case 12:
                return new ti((v78) this.b, (a07) this.c, (a07) obj2, jt1Var, 12);
            case 13:
                ti tiVar5 = new ti((e18) obj2, (String) this.b, jt1Var);
                tiVar5.c = obj;
                return tiVar5;
            case 14:
                return new ti((fq9) this.b, (a07) this.c, (a07) obj2, jt1Var, 14);
            case 15:
                return new ti((m6a) this.b, (br9) this.c, (br9) obj2, jt1Var, 15);
            case 16:
                return new ti(this.c, (String) this.b, obj2, jt1Var, 16);
            case 17:
                ti tiVar6 = new ti((hra) this.c, (yja) obj2, jt1Var, 17);
                tiVar6.b = obj;
                return tiVar6;
            case 18:
                return new ti((js1) this.c, (hra) obj2, (String) this.b, jt1Var);
            case 19:
                return new ti(this.c, (String) this.b, obj2, jt1Var, 19);
            case 20:
                ti tiVar7 = new ti((kta) this.c, (vx1) obj2, jt1Var, 20);
                tiVar7.b = obj;
                return tiVar7;
            case 21:
                return new ti((ArrayList) this.b, (a07) this.c, (a07) obj2, jt1Var, 21);
            default:
                return new ti((pn2) this.b, (e6c) this.c, (co0) obj2, jt1Var, 22);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 1:
                return ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 2:
                ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 3:
                ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 4:
                ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 5:
                return ((ti) create((gv4) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 6:
                ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 7:
                ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 8:
                ((ti) create(new y11(((y11) obj).a), (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 9:
                return ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 10:
                ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 11:
                return ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 12:
                ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 13:
                ((ti) create((pz6) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 14:
                ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 15:
                ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 16:
                ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 17:
                ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 18:
                ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 19:
                ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 20:
                ((ti) create((xl7) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 21:
                return ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            default:
                ((ti) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0375 A[LOOP:8: B:115:0x0375->B:302:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0394 A[LOOP:9: B:119:0x0394->B:304:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ba  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(e18 e18Var, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 13;
        this.d = e18Var;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ti(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ti(Object obj, Object obj2, Object obj3, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ti(Object obj, String str, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
        this.b = str;
        this.d = obj2;
    }
}
