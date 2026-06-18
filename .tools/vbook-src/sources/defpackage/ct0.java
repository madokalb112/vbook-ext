package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ct0 implements bt0 {
    public final ay0 b;
    public final Throwable c;

    public ct0(ay0 ay0Var) {
        this.b = ay0Var;
        String property = System.getProperty("io.ktor.development");
        if (property == null || !Boolean.parseBoolean(property)) {
            return;
        }
        int iHashCode = ay0Var.hashCode();
        gjb.X(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        Throwable th = new Throwable("WriteTask 0x".concat(string));
        i12.d0(th);
        this.c = th;
    }

    @Override // defpackage.bt0
    public final Throwable c() {
        return this.c;
    }

    @Override // defpackage.bt0
    public final jt1 d() {
        return this.b;
    }
}
