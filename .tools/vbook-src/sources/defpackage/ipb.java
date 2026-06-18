package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ipb {
    public final int a;
    public final String b;
    public final int c;
    public final double d;

    public ipb(int i, String str, int i2, double d) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = d;
    }

    public static ipb a(ipb ipbVar, int i, String str, int i2, double d, int i3) {
        if ((i3 & 1) != 0) {
            i = ipbVar.a;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            str = ipbVar.b;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            i2 = ipbVar.c;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            d = ipbVar.d;
        }
        ipbVar.getClass();
        str2.getClass();
        return new ipb(i4, str2, i5, d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipb)) {
            return false;
        }
        ipb ipbVar = (ipb) obj;
        return this.a == ipbVar.a && this.b.equals(ipbVar.b) && this.c == ipbVar.c && Double.compare(this.d, ipbVar.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + tw2.d(this.c, j39.a(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbP = j39.p("VideoEpisodeState(episodeIndex=", ", episodeName=", this.b, ", totalEpisode=", this.a);
        sbP.append(this.c);
        sbP.append(", lastReadPositionPercent=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
