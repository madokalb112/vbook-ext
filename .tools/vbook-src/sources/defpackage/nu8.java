package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nu8 extends v37 {
    public final mu8 a;

    public nu8(mu8 mu8Var) {
        this.a = mu8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nu8.class != obj.getClass()) {
            return false;
        }
        return lc5.Q(this.a, ((nu8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SceneInfo(scene=" + this.a + ')';
    }
}
