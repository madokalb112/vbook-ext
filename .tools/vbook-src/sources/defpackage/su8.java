package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class su8 {
    public final ArrayList a;
    public final ArrayList b;
    public final mu8 c;
    public final ArrayList d;

    public su8(ArrayList arrayList, ArrayList arrayList2, mu8 mu8Var, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = mu8Var;
        this.d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || su8.class != obj.getClass()) {
            return false;
        }
        su8 su8Var = (su8) obj;
        return this.a.equals(su8Var.a) && this.b.equals(su8Var.b) && lc5.Q(this.c, su8Var.c) && this.d.equals(su8Var.d);
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SceneState(entries=" + this.a + ", overlayScenes=" + this.b + ", currentScene=" + this.c + ", previousScenes=" + this.d + ')';
    }
}
