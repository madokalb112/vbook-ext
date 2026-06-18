package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class if0 {
    public final pa8 a;
    public final a91 b;
    public final yb4 c;
    public final ck5 d;
    public List e;

    public if0(pa8 pa8Var, a91 a91Var, yb4 yb4Var, ck5 ck5Var) {
        pa8Var.getClass();
        this.a = pa8Var;
        this.b = a91Var;
        this.c = yb4Var;
        this.d = ck5Var;
        this.e = lc3.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        obj.getClass();
        if0 if0Var = (if0) obj;
        return this.b.equals(if0Var.b) && lc5.Q(this.a, if0Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.d);
        sb.append(": '");
        sb.append(rh5.a(this.b));
        sb.append('\'');
        ov9 ov9Var = s16.t;
        pa8 pa8Var = this.a;
        if (!lc5.Q(pa8Var, ov9Var)) {
            sb.append(",scope:");
            sb.append(pa8Var);
        }
        if (!this.e.isEmpty()) {
            sb.append(",binds:");
            fc1.C0(this.e, sb, ",", new e4(26), 60);
        }
        sb.append(']');
        return sb.toString();
    }
}
