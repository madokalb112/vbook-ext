package defpackage;

import java.util.Arrays;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g8a extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ h8a c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g8a(h8a h8aVar, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = h8aVar;
        this.d = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        String str = this.d;
        h8a h8aVar = this.c;
        switch (i) {
            case 0:
                return new g8a(h8aVar, str, jt1Var, 0);
            default:
                return new g8a(h8aVar, str, jt1Var, 1);
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
        return ((g8a) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.a;
        String str = this.d;
        h8a h8aVar = this.c;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                tna tnaVar = h8aVar.c;
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    zna znaVar = (zna) tnaVar;
                    String[] strArr = (String[]) znaVar.d().toArray(new String[0]);
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(y86.O(objArrCopyOf.length));
                    fw.H0(objArrCopyOf, linkedHashSet);
                    linkedHashSet.remove(str);
                    oh5 oh5Var = gx3.a;
                    oh5Var.R(zn7.f(zn7.f(qu1.d0(oh5Var), "music"), str), false);
                    znaVar.s(fc1.Z0(linkedHashSet));
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                if (((e8b) h8aVar.d.a.getValue()).f) {
                    h8aVar.e.getClass();
                    d6a d6aVar = vg3.a;
                    vg3.a(ela.a);
                }
                fr9 fr9Var = h8aVar.f;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, e8a.a((e8a) value, false, false, false, false, false, 0.0f, ((zna) tnaVar).d(), null, 191)));
                }
                return hebVar;
            default:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    tna tnaVar2 = h8aVar.c;
                    this.b = 1;
                    n92 n92Var = ((zna) tnaVar2).b.I;
                    n92Var.getClass();
                    str.getClass();
                    ((qj) ((yf1) n92Var).a).q(1790615319, "DELETE FROM DbTTSWord\nWHERE id = ?", new e82(str, 22));
                    n92Var.w(1790615319, new oc2(2));
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
        }
    }
}
