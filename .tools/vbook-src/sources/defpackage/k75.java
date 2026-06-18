package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k75 implements dp5, Serializable {
    public final Object a;

    public k75(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.dp5
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dp5
    public final Object getValue() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
