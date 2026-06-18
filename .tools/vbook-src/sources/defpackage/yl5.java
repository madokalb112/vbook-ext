package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yl5 {
    public final Float a;

    public /* synthetic */ yl5(Float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl5) && qx1.u(((yl5) obj).a, this.a) && qx1.u(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null});
    }
}
