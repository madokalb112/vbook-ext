package defpackage;

import androidx.glance.session.SessionWorker;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c69 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c69(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                c69 c69Var = new c69((SessionWorker) obj2, jt1Var, 0);
                c69Var.b = obj;
                return c69Var;
            case 1:
                return new c69((x99) this.b, (y99) obj2, jt1Var, 1);
            case 2:
                return new c69((h8a) this.b, (List) obj2, jt1Var, 2);
            case 3:
                return new c69((jka) this.b, (hra) obj2, jt1Var, 3);
            case 4:
                c69 c69Var2 = new c69((hra) obj2, jt1Var, 4);
                c69Var2.b = obj;
                return c69Var2;
            case 5:
                return new c69((List) this.b, (aoa) obj2, jt1Var, 5);
            case 6:
                return new c69((hra) this.b, (a07) obj2, jt1Var, 6);
            case 7:
                return new c69((br9) this.b, (ym7) obj2, jt1Var, 7);
            case 8:
                c69 c69Var3 = new c69((joa) obj2, jt1Var, 8);
                c69Var3.b = obj;
                return c69Var3;
            case 9:
                return new c69((yia) this.b, (hra) obj2, jt1Var, 9);
            case 10:
                return new c69((sra) this.b, (String) obj2, jt1Var, 10);
            case 11:
                return new c69((csa) this.b, (kra) obj2, jt1Var, 11);
            case 12:
                return new c69((csa) this.b, (bi5) obj2, jt1Var, 12);
            case 13:
                return new c69((csa) this.b, (String) obj2, jt1Var, 13);
            case 14:
                return new c69((qta) this.b, (bta) obj2, jt1Var, 14);
            case 15:
                return new c69((je4) this.b, (hk9) obj2, jt1Var, 15);
            default:
                return new c69((h49) this.b, (String) obj2, jt1Var, 16);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                break;
            case 1:
                ((c69) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 2:
                ((c69) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 3:
                ((c69) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 4:
                ((c69) create((xl7) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 5:
                break;
            case 6:
                ((c69) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 7:
                ((c69) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 8:
                ((c69) create((d8b) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 9:
                ((c69) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 10:
                ((c69) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 11:
                ((c69) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 12:
                ((c69) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 13:
                ((c69) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 14:
                break;
            case 15:
                ((c69) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            default:
                ((c69) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cb  */
    /* JADX WARN: Type inference failed for: r6v0, types: [jt1] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c69.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c69(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
    }
}
