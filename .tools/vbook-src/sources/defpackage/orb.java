package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class orb {
    public final String a;

    public orb(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof orb) && lc5.Q(this.a, ((orb) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + j39.c(j39.c(this.a.hashCode() * 31, 31, false), 31, true);
    }

    public final String toString() {
        return xv5.p("VideoSourceInfo(name=", this.a, ", isSupportDownload=false, isSupportCheckNewChapter=true, isSupportShowEpisodeName=true)");
    }
}
