package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xg5 {
    public final Charset a;

    public xg5(Charset charset) {
        this.a = charset;
    }

    public final String a(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, this.a);
    }

    public final String b() {
        String strName = this.a.name();
        strName.getClass();
        return strName;
    }
}
