package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wm6 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wm6(a07 a07Var, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = a07Var;
        this.c = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        String str = this.c;
        a07 a07Var = this.b;
        switch (i) {
            case 0:
                return new wm6(a07Var, str, jt1Var, 0);
            case 1:
                return new wm6(a07Var, str, jt1Var, 1);
            default:
                return new wm6(a07Var, str, jt1Var, 2);
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
        return ((wm6) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        int i2 = -1;
        int i3 = 0;
        String str = this.c;
        a07 a07Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                Iterator it = ((List) a07Var.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (lc5.Q(((d35) it.next()).a, str)) {
                            i2 = i3;
                        } else {
                            i3++;
                        }
                    }
                }
                return new Integer(i2);
            case 1:
                e11.e0(obj);
                Iterator it2 = ((List) a07Var.getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (lc5.Q(((koa) it2.next()).a, str)) {
                            i2 = i3;
                        } else {
                            i3++;
                        }
                    }
                }
                return new Integer(i2);
            default:
                e11.e0(obj);
                Iterator it3 = ((List) a07Var.getValue()).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (lc5.Q(((zrb) it3.next()).a, str)) {
                            i2 = i3;
                        } else {
                            i3++;
                        }
                    }
                }
                return new Integer(i2);
        }
    }
}
