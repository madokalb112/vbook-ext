package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cc3 implements t55 {
    public final boolean a;

    public cc3(boolean z) {
        this.a = z;
    }

    @Override // defpackage.t55
    public final e77 c() {
        return null;
    }

    @Override // defpackage.t55
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        return xv5.s(new StringBuilder("Empty{"), this.a ? "Active" : "New", '}');
    }
}
