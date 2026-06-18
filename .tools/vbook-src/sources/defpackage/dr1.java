package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dr1 {
    public final mo0 a;
    public final ay0 b;

    public dr1(mo0 mo0Var, ay0 ay0Var) {
        this.a = mo0Var;
        this.b = ay0Var;
    }

    public final String toString() {
        ay0 ay0Var = this.b;
        rx1 rx1Var = ay0Var.e.get(rx1.c);
        String str = rx1Var != null ? rx1Var.b : null;
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        gjb.X(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        sb.append(str != null ? xv5.p("[", str, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.a.invoke());
        sb.append(", continuation=");
        sb.append(ay0Var);
        sb.append(')');
        return sb.toString();
    }
}
