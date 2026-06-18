package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ah5 {
    public static final j46 a;
    public static final d6a b;

    static {
        j46 j46Var;
        String str;
        synchronized (j46.b) {
            try {
                String strReplace = "JvmFsCaseSensitive".replace('.', '_');
                strReplace.getClass();
                String strReplace2 = strReplace.replace('/', '_');
                strReplace2.getClass();
                Locale locale = Locale.ROOT;
                String upperCase = strReplace2.toUpperCase(locale);
                upperCase.getClass();
                HashMap map = j46.c;
                if (map.get(upperCase) == null) {
                    j46 j46Var2 = new j46();
                    String str2 = (String) ((LinkedHashMap) bx1.F()).get("LOG_".concat(upperCase));
                    if (str2 != null) {
                        f46.b.getClass();
                        LinkedHashMap linkedHashMap = f46.c;
                        String upperCase2 = str2.toUpperCase(locale);
                        upperCase2.getClass();
                        f46 f46Var = (f46) linkedHashMap.get(upperCase2);
                        if (f46Var == null) {
                            f46Var = f46.NONE;
                        }
                        j46Var2.a = f46Var;
                    }
                    if (map.isEmpty() && (str = (String) ((LinkedHashMap) bx1.F()).get("LOG_LEVEL")) != null) {
                        f46.b.getClass();
                        LinkedHashMap linkedHashMap2 = f46.c;
                        String upperCase3 = str.toUpperCase(locale);
                        upperCase3.getClass();
                        f46 f46Var2 = (f46) linkedHashMap2.get(upperCase3);
                        if (f46Var2 == null) {
                            f46Var2 = f46.NONE;
                        }
                        j46.d = f46Var2;
                    }
                    map.put(upperCase, j46Var2);
                }
                Object obj = map.get(upperCase);
                obj.getClass();
                j46Var = (j46) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        a = j46Var;
        b = new d6a(new ua5(10));
    }

    public static final boolean a(File file) throws IOException {
        file.getClass();
        if (!file.exists() || ((Boolean) b.getValue()).booleanValue()) {
            return true;
        }
        ut7.a.getClass();
        ph7.a.getClass();
        ph7 ph7Var = h22.a;
        ph7Var.getClass();
        if (ph7Var == ph7.b) {
            return true;
        }
        File canonicalFile = file.getCanonicalFile();
        boolean zQ = lc5.Q(canonicalFile.getName(), file.getName());
        if (!zQ) {
            wfc wfcVar = f46.b;
            j46 j46Var = a;
            j46Var.getClass();
            f46 f46Var = j46Var.a;
            if (f46Var == null && (f46Var = j46.d) == null) {
                f46Var = f46.WARN;
            }
            if (4 <= f46Var.a) {
                j46.e.getClass();
                Log.println(4, "JvmFsCaseSensitive", "File " + canonicalFile + " doesn't match " + file);
            }
        }
        return zQ;
    }
}
