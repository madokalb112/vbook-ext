package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j59 {
    public final p59 a;
    public final qu b;

    public j59(p59 p59Var, qu quVar) {
        this.a = p59Var;
        this.b = quVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j59)) {
            return false;
        }
        j59 j59Var = (j59) obj;
        return this.a.equals(j59Var.a) && this.b.equals(j59Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (xh3.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + xh3.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
