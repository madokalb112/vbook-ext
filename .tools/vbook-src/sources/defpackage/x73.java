package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x73 extends r21 {
    public static final d6a e = new d6a(new g53(22));

    @Override // defpackage.r21
    public final int b(int i, byte[] bArr) {
        bArr.getClass();
        if ((bArr[i] & 255) < 196) {
            return -1;
        }
        return (((r1 - 196) * 94) + (bArr[i + 1] & 255)) - 161;
    }
}
