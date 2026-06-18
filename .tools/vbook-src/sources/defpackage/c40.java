package defpackage;

import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c40 implements ja7 {
    public static final c40 a = new c40();
    public static final ru3 b = ru3.c("key");
    public static final ru3 c = ru3.c(ES6Iterator.VALUE_PROPERTY);

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        cz1 cz1Var = (cz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((s60) cz1Var).a);
        ka7Var.add(c, ((s60) cz1Var).b);
    }
}
