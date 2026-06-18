package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e7a {
    public static final bbc c;
    public static final d6a d;
    public static final /* synthetic */ ni5[] b = {new z48(e7a.class, "SystemPropertiesClass", "getSystemPropertiesClass()Ljava/lang/Class;", 0)};
    public static final e7a a = new e7a();

    static {
        int i = c91.a;
        c = new bbc(25, false);
        d = new d6a(new i5a(6));
        new d6a(new i5a(7));
        new d6a(new i5a(8));
        new d6a(new i5a(9));
    }

    public static final boolean a(String str) {
        return !bw9.a0(b(str));
    }

    public static String b(String str) {
        Object pm8Var;
        a.getClass();
        wg6 wg6Var = (wg6) d.getValue();
        if (wg6Var != null) {
            Object[] objArr = {str, ""};
            try {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                Method method = wg6Var.c;
                Method method2 = method != null ? method : null;
                if (method2 != null && !method2.isAccessible()) {
                    method2.setAccessible(true);
                }
                pm8Var = method.invoke(wg6Var.b, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                if (pm8Var == null) {
                    pm8Var = null;
                }
            } catch (Throwable th) {
                pm8Var = new pm8(th);
            }
            String str2 = (String) (pm8Var instanceof pm8 ? null : pm8Var);
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public static Class c() {
        ni5 ni5Var = b[0];
        bbc bbcVar = c;
        if (((Class) bbcVar.b) == null) {
            bbcVar.b = c91.a(null, "android.os.SystemProperties");
        }
        Class cls = (Class) bbcVar.b;
        if (cls != null) {
            return cls;
        }
        gp.j("Exception has been thrown above.");
        return null;
    }
}
