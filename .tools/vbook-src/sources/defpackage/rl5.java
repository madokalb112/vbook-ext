package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class rl5 implements ic4, Serializable {
    private final int arity;

    public rl5(int i) {
        this.arity = i;
    }

    @Override // defpackage.ic4
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        ug8.a.getClass();
        return vg8.a(this);
    }
}
