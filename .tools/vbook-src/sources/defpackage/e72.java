package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e72 {
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0314 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.f72 a(java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e72.a(java.lang.String):f72");
    }

    public static final void b(int i, String str) {
        throw new d72("Parse error at char " + i + ": " + str);
    }

    public static final int c(long j, int i, char c) {
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        b(i, "Value " + j + " does not fit into an Int, which is required for component '" + c + '\'');
        throw null;
    }

    public final oi5 serializer() {
        return i72.b;
    }
}
