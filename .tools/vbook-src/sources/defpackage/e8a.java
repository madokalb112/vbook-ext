package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e8a {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final List g;
    public final List h;

    public e8a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = f;
        this.g = list;
        this.h = list2;
    }

    public static e8a a(e8a e8aVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f, List list, List list2, int i) {
        if ((i & 1) != 0) {
            z = e8aVar.a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = e8aVar.b;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = e8aVar.c;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = e8aVar.d;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = e8aVar.e;
        }
        boolean z10 = z5;
        if ((i & 32) != 0) {
            f = e8aVar.f;
        }
        float f2 = f;
        List list3 = (i & 64) != 0 ? e8aVar.g : list;
        List list4 = (i & Token.CASE) != 0 ? e8aVar.h : list2;
        e8aVar.getClass();
        list3.getClass();
        list4.getClass();
        return new e8a(z6, z7, z8, z9, z10, f2, list3, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8a)) {
            return false;
        }
        e8a e8aVar = (e8a) obj;
        return this.a == e8aVar.a && this.b == e8aVar.b && this.c == e8aVar.c && this.d == e8aVar.d && this.e == e8aVar.e && Float.compare(this.f, e8aVar.f) == 0 && lc5.Q(this.g, e8aVar.g) && lc5.Q(this.h, e8aVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + j39.d(tw2.c(this.f, j39.c(j39.c(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("TTSSettingState(isAlwaysExpandTTS=", this.a, ", isAllowContinueWhenExit=", this.b, ", isHeadSetControl=");
        ky0.D(sbR, this.c, ", isSkipFocusAudio=", this.d, ", isEnableBackgroundMusic=");
        sbR.append(this.e);
        sbR.append(", backgroundMusicVolume=");
        sbR.append(this.f);
        sbR.append(", backgroundMusicList=");
        sbR.append(this.g);
        sbR.append(", skipWordList=");
        sbR.append(this.h);
        sbR.append(")");
        return sbR.toString();
    }
}
