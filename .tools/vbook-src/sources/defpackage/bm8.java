package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class bm8<T> {
    public static final am8 Companion = new am8();
    public static final hx7 c;
    public final int a;
    public final Object b;

    static {
        hx7 hx7Var = new hx7("com.reader.data.community.api.Response", null, 2);
        hx7Var.k("code", true);
        hx7Var.k("data", false);
        c = hx7Var;
    }

    public /* synthetic */ bm8(int i, Object obj, int i2) {
        if (2 != (i & 2)) {
            qu1.w0(i, 2, c);
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        this.b = obj;
    }
}
