package defpackage;

import org.mozilla.javascript.NativeSymbol;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q40 implements ja7 {
    public static final q40 a = new q40();
    public static final ru3 b = ru3.c("pc");
    public static final ru3 c = ru3.c(NativeSymbol.TYPE_NAME);
    public static final ru3 d = ru3.c("file");
    public static final ru3 e = ru3.c("offset");
    public static final ru3 f = ru3.c("importance");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        lz1 lz1Var = (lz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((k70) lz1Var).a);
        k70 k70Var = (k70) lz1Var;
        ka7Var.add(c, k70Var.b);
        ka7Var.add(d, k70Var.c);
        ka7Var.add(e, k70Var.d);
        ka7Var.add(f, k70Var.e);
    }
}
