package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class c91 {
    public static final /* synthetic */ int a = 0;

    static {
        new ConcurrentHashMap();
    }

    public static final Class a(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            classLoader = null;
        }
        Class<?> cls = classLoader != null ? Class.forName(str, false, classLoader) : Class.forName(str);
        if (cls != null) {
            return cls;
        }
        mn5.n(str, "JVM class not resolved: ");
        return null;
    }

    public static Class b(String str, ClassLoader classLoader, int i) {
        Object pm8Var;
        if ((i & 1) != 0) {
            classLoader = null;
        }
        try {
            pm8Var = a(classLoader, str);
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        return (Class) (pm8Var instanceof pm8 ? null : pm8Var);
    }

    public static final boolean c(ClassLoader classLoader, String str) {
        Object pm8Var;
        try {
            pm8Var = classLoader.loadClass(str);
            if (pm8Var == null) {
                pm8Var = null;
            }
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        return ((Class) (pm8Var instanceof pm8 ? null : pm8Var)) != null;
    }
}
