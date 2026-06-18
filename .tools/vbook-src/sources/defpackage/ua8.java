package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ua8 implements wa8 {
    public final kb4 b;

    public final boolean equals(Object obj) {
        if (obj instanceof ua8) {
            return this.b.equals(((ua8) obj).b);
        }
        return false;
    }

    public final Object getValue() {
        throw new IllegalStateException("The driver used with SQLDelight is asynchronous, so SQLDelight should be configured for\nasynchronous usage:\n\nsqldelight {\n  databases {\n    MyDatabase {\n      generateAsync = true\n    }\n  }\n}");
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "AsyncValue(getter=" + this.b + ')';
    }
}
