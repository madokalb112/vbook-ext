package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f36 {
    public static final f38 b = new f38();
    public final bbc a;

    public f36(bbc bbcVar) {
        this.a = bbcVar;
    }

    public final String a() {
        Locale localeB = i36.c().b(0);
        if (localeB == null) {
            localeB = Locale.getDefault();
        }
        localeB.getClass();
        String displayLanguage = ((Locale) this.a.b).getDisplayLanguage(localeB);
        displayLanguage.getClass();
        return displayLanguage;
    }

    public final String b(f36 f36Var) {
        String displayLanguage = ((Locale) this.a.b).getDisplayLanguage((Locale) f36Var.a.b);
        displayLanguage.getClass();
        return displayLanguage;
    }

    public final String c() {
        String language = ((Locale) this.a.b).getLanguage();
        language.getClass();
        return language;
    }

    public final String d() {
        String languageTag = ((Locale) this.a.b).toLanguageTag();
        languageTag.getClass();
        return languageTag;
    }

    public final String toString() {
        return this.a.toString();
    }
}
