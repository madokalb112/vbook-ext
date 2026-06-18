package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class il8 extends kc4 implements ib4 {
    public static final il8 a = new il8(0, kl8.class, "getSystemEnvironment", "getSystemEnvironment()Lorg/jetbrains/compose/resources/ResourceEnvironment;", 1);

    @Override // defpackage.ib4
    public final Object invoke() {
        Locale locale = Locale.getDefault();
        Configuration configuration = Resources.getSystem().getConfiguration();
        boolean z = (configuration.uiMode & 48) == 32;
        int i = configuration.densityDpi;
        String language = locale.getLanguage();
        language.getClass();
        fm5 fm5Var = new fm5(language);
        String country = locale.getCountry();
        country.getClass();
        ch8 ch8Var = new ch8(country);
        mra.a.getClass();
        mra mraVar = z ? mra.c : mra.b;
        tn2.b.getClass();
        return new gl8(fm5Var, ch8Var, mraVar, i <= 120 ? tn2.c : i <= 160 ? tn2.d : i <= 240 ? tn2.e : i <= 320 ? tn2.f : i <= 480 ? tn2.s : tn2.t);
    }
}
