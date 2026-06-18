package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k96 {
    public final Matcher a;
    public final CharSequence b;
    public final j96 c;
    public i96 d;

    public k96(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new j96(this, 0);
    }

    public final List a() {
        if (this.d == null) {
            this.d = new i96(this);
        }
        i96 i96Var = this.d;
        i96Var.getClass();
        return i96Var;
    }

    public final ha5 b() {
        Matcher matcher = this.a;
        return wx1.s0(matcher.start(), matcher.end());
    }

    public final k96 c() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return sw1.w(matcher2, iEnd, charSequence);
    }
}
