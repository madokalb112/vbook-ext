package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g36 {
    public final Locale a;

    /* JADX WARN: Illegal instructions before constructor call */
    public g36(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (lc5.Q(localeForLanguageTag.toLanguageTag(), "und")) {
            System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        this(localeForLanguageTag);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof g36)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return lc5.Q(this.a.toLanguageTag(), ((g36) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }

    public g36(Locale locale) {
        this.a = locale;
    }
}
