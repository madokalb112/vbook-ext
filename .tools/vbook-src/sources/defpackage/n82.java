package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class n82 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n82(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj) {
        vx1 vx1Var = (vx1) this.b;
        kb4 kb4Var = (kb4) this.c;
        bi5 bi5Var = (bi5) obj;
        if (bi5Var != null) {
            ah1.J(vx1Var, null, null, new hl2(kb4Var, bi5Var, null, 12), 3);
        }
        return heb.a;
    }

    private final Object b(Object obj) {
        Object value;
        List list;
        en3 en3Var = (en3) this.b;
        a07 a07Var = (a07) this.c;
        String str = (String) obj;
        str.getClass();
        fr9 fr9Var = en3Var.e;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
                list = ((dn3) value).b;
                list.getClass();
            } while (!fr9Var.j(value, new dn3(str, list)));
        }
        a07Var.setValue(Boolean.FALSE);
        return heb.a;
    }

    private final Object d(Object obj) {
        yn3 yn3Var = (yn3) this.b;
        t27 t27Var = (t27) this.c;
        ((String) obj).getClass();
        vx1 vx1VarA = utb.a(yn3Var);
        aj2 aj2Var = rw2.a;
        yn3Var.g(vx1VarA, nh2.c, new wn3(yn3Var, null, 2));
        t27Var.b();
        return heb.a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0355  */
    @Override // defpackage.kb4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 3260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n82.invoke(java.lang.Object):java.lang.Object");
    }
}
