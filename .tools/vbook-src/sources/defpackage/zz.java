package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zz implements f58 {
    public final int b;

    public zz(int i) {
        this.b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return f58.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f58)) {
            return false;
        }
        f58 f58Var = (f58) obj;
        return this.b == f58Var.tag() && d58.a.equals(f58Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.b ^ 14552422) + (d58.a.hashCode() ^ 2041407134);
    }

    @Override // defpackage.f58
    public final d58 intEncoding() {
        return d58.a;
    }

    @Override // defpackage.f58
    public final int tag() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + d58.a + ')';
    }
}
