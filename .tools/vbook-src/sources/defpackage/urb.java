package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class urb {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final List d;
    public final int e;
    public final w1b f;
    public final List g;
    public final int h;
    public final List i;
    public final int j;

    public urb(boolean z, boolean z2, String str, List list, int i, w1b w1bVar, List list2, int i2, List list3, int i3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = list;
        this.e = i;
        this.f = w1bVar;
        this.g = list2;
        this.h = i2;
        this.i = list3;
        this.j = i3;
    }

    public static urb a(urb urbVar, boolean z, boolean z2, String str, List list, int i, w1b w1bVar, List list2, int i2, List list3, int i3, int i4) {
        if ((i4 & 1) != 0) {
            z = urbVar.a;
        }
        boolean z3 = z;
        if ((i4 & 2) != 0) {
            z2 = urbVar.b;
        }
        boolean z4 = z2;
        if ((i4 & 4) != 0) {
            str = urbVar.c;
        }
        String str2 = str;
        if ((i4 & 8) != 0) {
            list = urbVar.d;
        }
        List list4 = list;
        int i5 = (i4 & 16) != 0 ? urbVar.e : i;
        w1b w1bVar2 = (i4 & 32) != 0 ? urbVar.f : w1bVar;
        List list5 = (i4 & 64) != 0 ? urbVar.g : list2;
        int i6 = (i4 & Token.CASE) != 0 ? urbVar.h : i2;
        List list6 = (i4 & 256) != 0 ? urbVar.i : list3;
        int i7 = (i4 & 512) != 0 ? urbVar.j : i3;
        urbVar.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        return new urb(z3, z4, str2, list4, i5, w1bVar2, list5, i6, list6, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urb)) {
            return false;
        }
        urb urbVar = (urb) obj;
        return this.a == urbVar.a && this.b == urbVar.b && lc5.Q(this.c, urbVar.c) && lc5.Q(this.d, urbVar.d) && this.e == urbVar.e && lc5.Q(this.f, urbVar.f) && lc5.Q(this.g, urbVar.g) && this.h == urbVar.h && lc5.Q(this.i, urbVar.i) && this.j == urbVar.j;
    }

    public final int hashCode() {
        int iC = j39.c(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iD = tw2.d(this.e, j39.d((iC + (str == null ? 0 : str.hashCode())) * 31, this.d, 31), 31);
        w1b w1bVar = this.f;
        return Integer.hashCode(this.j) + j39.d(tw2.d(this.h, j39.d((iD + (w1bVar != null ? w1bVar.hashCode() : 0)) * 31, this.g, 31), 31), this.i, 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("VideoState(isLoading=", this.a, ", isError=", this.b, ", errorMessage=");
        sbR.append(this.c);
        sbR.append(", tracks=");
        sbR.append(this.d);
        sbR.append(", trackIndex=");
        sbR.append(this.e);
        sbR.append(", trackContent=");
        sbR.append(this.f);
        sbR.append(", audioTracks=");
        sbR.append(this.g);
        sbR.append(", selectedAudioIndex=");
        sbR.append(this.h);
        sbR.append(", subtitleTracks=");
        sbR.append(this.i);
        sbR.append(", selectedSubtitleIndex=");
        sbR.append(this.j);
        sbR.append(")");
        return sbR.toString();
    }
}
