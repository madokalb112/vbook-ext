package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class yv0 {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ yv0(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public abstract byte[] a(byte[] bArr, h hVar, md2 md2Var, byte[] bArr2);

    public abstract byte[] b(byte[] bArr, h hVar, md2 md2Var, byte[] bArr2);

    public Object c(ni5 ni5Var, Object obj) {
        ni5Var.getClass();
        return d(this.b);
    }

    public abstract Object d(String str);

    public void e(ni5 ni5Var, Object obj) {
        ni5Var.getClass();
        f(obj, this.b);
    }

    public abstract void f(Object obj, String str);

    public String toString() {
        switch (this.a) {
            case 2:
                return this.b;
            default:
                return super.toString();
        }
    }
}
