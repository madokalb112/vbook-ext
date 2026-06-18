package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class gsa {
    public static final zy2 a = new zy2("NO_THREAD_ELEMENTS", 6);
    public static final vw8 b;
    public static final vw8 c;
    public static final vw8 d;

    static {
        byte b2 = 0;
        b = new vw8(18, b2);
        c = new vw8(19, b2);
        d = new vw8(20, b2);
    }

    public static final void a(jx1 jx1Var, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof msa)) {
            Object objFold = jx1Var.fold(null, c);
            objFold.getClass();
            ((fsa) objFold).A0(obj);
            return;
        }
        msa msaVar = (msa) obj;
        fsa[] fsaVarArr = msaVar.c;
        int length = fsaVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            fsa fsaVar = fsaVarArr[length];
            fsaVar.getClass();
            fsaVar.A0(msaVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(jx1 jx1Var) {
        Object objFold = jx1Var.fold(0, b);
        objFold.getClass();
        return objFold;
    }

    public static final Object c(jx1 jx1Var, Object obj) {
        if (obj == null) {
            obj = b(jx1Var);
        }
        return obj == 0 ? a : obj instanceof Integer ? jx1Var.fold(new msa(((Number) obj).intValue(), jx1Var), d) : ((fsa) obj).j0();
    }
}
