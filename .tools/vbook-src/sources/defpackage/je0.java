package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class je0 implements k77 {
    public final su3 a;

    public je0(su3 su3Var) {
        this.a = su3Var;
    }

    @Override // defpackage.r84
    public final s84 a() {
        return this.a.a();
    }

    @Override // defpackage.r84
    public final sn7 b() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof je0) {
            return this.a.equals(((je0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.a + ')';
    }
}
