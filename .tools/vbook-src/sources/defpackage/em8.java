package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class em8 extends RuntimeException {
    public final int a;
    public final String b;
    public final String c;

    public em8(int i, String str, String str2) {
        super(str2);
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.c;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return ky0.s(this.c, "')", j39.p("ResponseException(errorCode=", ", data='", this.b, "', message='", this.a));
    }
}
