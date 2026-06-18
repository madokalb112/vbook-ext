package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sna {
    public final int a;
    public final long b;

    public sna(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sna)) {
            return false;
        }
        sna snaVar = (sna) obj;
        return this.a == snaVar.a && this.b == snaVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextToSpeechProgressState(chapterProgress=" + this.a + ", endDuration=" + this.b + ")";
    }
}
