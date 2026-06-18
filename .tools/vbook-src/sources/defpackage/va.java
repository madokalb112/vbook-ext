package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class va extends o1a implements ac4 {
    public final /* synthetic */ int a = 0;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(xq1 xq1Var, String str, jt1 jt1Var) {
        super(4, jt1Var);
        this.c = xq1Var;
        this.d = str;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                va vaVar = new va(4, (jt1) obj4);
                vaVar.b = (kb) obj;
                vaVar.c = (gg2) obj2;
                vaVar.d = obj3;
                vaVar.invokeSuspend(hebVar);
                break;
            case 1:
                va vaVar2 = new va((xq1) this.c, (String) this.d, (jt1) obj4);
                vaVar2.b = (xu4) obj2;
                vaVar2.invokeSuspend(hebVar);
                break;
            default:
                ((Number) obj).longValue();
                va vaVar3 = new va((pz5) this.d, (jt1) obj4);
                vaVar3.b = (List) obj2;
                vaVar3.c = (ac9) obj3;
                vaVar3.invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                e11.e0(obj);
                kb kbVar = (kb) this.b;
                float fC = ((gg2) this.c).c(this.d);
                if (!Float.isNaN(fC)) {
                    kb.b(kbVar, fC);
                }
                break;
            case 1:
                String str = (String) this.d;
                xu4 xu4Var = (xu4) this.b;
                e11.e0(obj);
                if (((xq1) this.c).b) {
                    fk4 fk4Var = xu4Var.c;
                    fk4Var.getClass();
                    if (!((Map) ((yf1) fk4Var).a).containsKey("Accept-Encoding")) {
                        k46 k46Var = br1.a;
                        if (ww1.S(k46Var)) {
                            StringBuilder sbM = dx1.m("Adding Accept-Encoding=", str, " for ");
                            sbM.append(xu4Var.a);
                            k46Var.j(sbM.toString());
                        }
                        xu4Var.c.A("Accept-Encoding", str);
                    }
                }
                break;
            default:
                List list = (List) this.b;
                ac9 ac9Var = (ac9) this.c;
                e11.e0(obj);
                boolean zIsEmpty = list.isEmpty();
                fr9 fr9Var = ((pz5) this.d).N;
                if (!zIsEmpty) {
                    if (fr9Var != null) {
                        while (true) {
                            Object value2 = fr9Var.getValue();
                            heb hebVar2 = hebVar;
                            if (!fr9Var.j(value2, lz5.a((lz5) value2, 0L, false, false, null, false, ac9Var.b, ac9Var.c, false, null, list, 413))) {
                                hebVar = hebVar2;
                            }
                        }
                    }
                } else if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, lz5.a((lz5) value, 0L, false, false, null, false, ac9Var.b, ac9Var.c, false, null, list, 413)));
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ va(int i, jt1 jt1Var) {
        super(i, jt1Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(pz5 pz5Var, jt1 jt1Var) {
        super(4, jt1Var);
        this.d = pz5Var;
    }
}
