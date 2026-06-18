package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qia {
    public final boolean a;
    public final int b;
    public final int c;
    public final float d;

    public qia(float f, int i, int i2, boolean z) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qia)) {
            return false;
        }
        qia qiaVar = (qia) obj;
        return this.a == qiaVar.a && this.b == qiaVar.b && this.c == qiaVar.c && Float.compare(this.d, qiaVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + tw2.d(this.c, tw2.d(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Line(isParagraphSpace=" + this.a + ", lineIndex=" + this.b + ", paragraphIndex=" + this.c + ", lineHeight=" + this.d + ")";
    }
}
