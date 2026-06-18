package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ml5 {
    public final String a;

    public ml5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ml5) && lc5.Q(this.a, ((ml5) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(1) + ((str == null ? 0 : str.hashCode()) * 961);
    }

    public final String toString() {
        return xv5.p("LacConfig(modelPath=", this.a, ", userDictPath=null, threadCount=1)");
    }
}
