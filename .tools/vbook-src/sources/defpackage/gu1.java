package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class gu1 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ st5 b;
    public final /* synthetic */ yb4 c;
    public final /* synthetic */ a07 d;

    public /* synthetic */ gu1(st5 st5Var, yb4 yb4Var, a07 a07Var, int i) {
        this.a = i;
        this.b = st5Var;
        this.c = yb4Var;
        this.d = a07Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj2 = null;
        a07 a07Var = this.d;
        yb4 yb4Var = this.c;
        st5 st5Var = this.b;
        eb7 eb7Var = (eb7) obj;
        switch (i) {
            case 0:
                Iterator it = st5Var.j().k.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        ot5 ot5Var = (ot5) next;
                        if (ot5Var.p <= Float.intBitsToFloat((int) (eb7Var.a >> 32)) && ot5Var.p + ot5Var.q > Float.intBitsToFloat((int) (eb7Var.a >> 32))) {
                            obj2 = next;
                        }
                    }
                }
                ot5 ot5Var2 = (ot5) obj2;
                if (ot5Var2 != null) {
                    yb4Var.invoke(eb7Var, ((List) a07Var.getValue()).get(ot5Var2.a));
                }
                break;
            case 1:
                Iterator it2 = st5Var.j().k.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        ot5 ot5Var3 = (ot5) next2;
                        if (ot5Var3.p <= Float.intBitsToFloat((int) (eb7Var.a >> 32)) && ot5Var3.p + ot5Var3.q > Float.intBitsToFloat((int) (eb7Var.a >> 32))) {
                            obj2 = next2;
                        }
                    }
                }
                ot5 ot5Var4 = (ot5) obj2;
                if (ot5Var4 != null) {
                    yb4Var.invoke(eb7Var, ((List) a07Var.getValue()).get(ot5Var4.a));
                }
                break;
            case 2:
                Iterator it3 = st5Var.j().k.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next3 = it3.next();
                        ot5 ot5Var5 = (ot5) next3;
                        if (ot5Var5.p <= Float.intBitsToFloat((int) (eb7Var.a & 4294967295L)) && ot5Var5.p + ot5Var5.q > Float.intBitsToFloat((int) (eb7Var.a & 4294967295L))) {
                            obj2 = next3;
                        }
                    }
                }
                ot5 ot5Var6 = (ot5) obj2;
                if (ot5Var6 != null) {
                    yb4Var.invoke(eb7Var, ((List) a07Var.getValue()).get(ot5Var6.a));
                }
                break;
            default:
                Iterator it4 = st5Var.j().k.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        Object next4 = it4.next();
                        ot5 ot5Var7 = (ot5) next4;
                        if (ot5Var7.p <= Float.intBitsToFloat((int) (eb7Var.a & 4294967295L)) && ot5Var7.p + ot5Var7.q > Float.intBitsToFloat((int) (eb7Var.a & 4294967295L))) {
                            obj2 = next4;
                        }
                    }
                }
                ot5 ot5Var8 = (ot5) obj2;
                if (ot5Var8 != null) {
                    yb4Var.invoke(eb7Var, ((List) a07Var.getValue()).get(ot5Var8.a));
                }
                break;
        }
        return hebVar;
    }
}
