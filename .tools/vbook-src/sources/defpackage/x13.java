package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x13 implements Comparable {
    public final float a;

    public /* synthetic */ x13(float f) {
        this.a = f;
    }

    public static final /* synthetic */ x13 a(float f) {
        return new x13(f);
    }

    public static int b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean c(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String d(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b(this.a, ((x13) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x13) {
            return Float.compare(this.a, ((x13) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
