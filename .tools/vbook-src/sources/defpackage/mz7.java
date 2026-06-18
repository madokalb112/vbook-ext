package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mz7 {
    public final char a;
    public final int b;

    public mz7(char c, int i) {
        this.a = c;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz7)) {
            return false;
        }
        mz7 mz7Var = (mz7) obj;
        return this.a == mz7Var.a && this.b == mz7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Character.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PositionChar(char=" + this.a + ", index=" + this.b + ")";
    }
}
