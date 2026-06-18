package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tla {
    public final float a;
    public final float b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final List g;

    public tla(float f, float f2, long j, boolean z, boolean z2, float f3, List list) {
        list.getClass();
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = z;
        this.e = z2;
        this.f = f3;
        this.g = list;
    }

    public static tla a(tla tlaVar, float f, float f2, long j, boolean z, boolean z2, float f3, List list, int i) {
        if ((i & 1) != 0) {
            f = tlaVar.a;
        }
        float f4 = f;
        if ((i & 2) != 0) {
            f2 = tlaVar.b;
        }
        float f5 = f2;
        tlaVar.getClass();
        if ((i & 8) != 0) {
            j = tlaVar.c;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            z = tlaVar.d;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = tlaVar.e;
        }
        boolean z4 = z2;
        float f6 = (i & 64) != 0 ? tlaVar.f : f3;
        List list2 = (i & Token.CASE) != 0 ? tlaVar.g : list;
        tlaVar.getClass();
        list2.getClass();
        return new tla(f4, f5, j2, z3, z4, f6, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tla)) {
            return false;
        }
        tla tlaVar = (tla) obj;
        return Float.compare(this.a, tlaVar.a) == 0 && Float.compare(this.b, tlaVar.b) == 0 && Float.compare(1.0f, 1.0f) == 0 && this.c == tlaVar.c && this.d == tlaVar.d && this.e == tlaVar.e && Float.compare(this.f, tlaVar.f) == 0 && lc5.Q(this.g, tlaVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + tw2.c(this.f, j39.c(j39.c(xv5.b(tw2.c(1.0f, tw2.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        return "TextToSpeechConfigState(speed=" + this.a + ", pitch=" + this.b + ", volume=1.0, offTime=" + this.c + ", isSaveOffTime=" + this.d + ", isEnableBackgroundMusic=" + this.e + ", backgroundMusicVolume=" + this.f + ", backgroundMusicList=" + this.g + ")";
    }
}
