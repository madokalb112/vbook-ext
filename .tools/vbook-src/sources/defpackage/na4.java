package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class na4 {
    public final ra4 a;
    public final byte[] b;

    public na4(ra4 ra4Var, byte[] bArr) {
        this.a = ra4Var;
        this.b = bArr;
        ByteBuffer.wrap(bArr).getClass();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame ");
        sb.append(this.a);
        sb.append(" (fin=true, buffer len = ");
        return tw2.p(sb, this.b.length, ')');
    }
}
