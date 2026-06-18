package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class n46 {
    public static volatile int a;
    public static final jz9 b = new jz9();
    public static final g17 c = new g17();
    public static final boolean d;
    public static volatile vq8 e;
    public static final String[] f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        d = property == null ? false : property.equalsIgnoreCase("true");
        f = new String[]{"2.0"};
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = n46.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        vq8 vq8Var = null;
        if (property != null && !property.isEmpty()) {
            try {
                ik8.d("Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property");
                vq8Var = (vq8) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e2) {
                ik8.b("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e2);
            } catch (ClassNotFoundException e3) {
                e = e3;
                ik8.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e4) {
                e = e4;
                ik8.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e5) {
                e = e5;
                ik8.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e6) {
                e = e6;
                ik8.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e7) {
                e = e7;
                ik8.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (vq8Var != null) {
            arrayList.add(vq8Var);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(vq8.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: m46
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(vq8.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((vq8) it.next());
            } catch (ServiceConfigurationError e8) {
                ik8.a("A service provider failed to instantiate:\n" + e8.getMessage());
            }
        }
        return arrayList;
    }

    public static k46 b(String str) {
        return c().b().a(str);
    }

    public static vq8 c() {
        if (a == 0) {
            synchronized (n46.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        d();
                    }
                } finally {
                }
            }
        }
        int i = a;
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            gp.j("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            return null;
        }
        if (i == 3) {
            return e;
        }
        if (i == 4) {
            return c;
        }
        gp.j("Unreachable code");
        return null;
    }

    public static final void d() {
        try {
            ArrayList arrayListA = a();
            h(arrayListA);
            if (arrayListA.isEmpty()) {
                a = 4;
                ik8.e("No SLF4J providers were found.");
                ik8.e("Defaulting to no-operation (NOP) logger implementation");
                ik8.e("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = n46.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e2) {
                    ik8.b("Error getting resources from path", e2);
                }
                g(linkedHashSet);
            } else {
                e = (vq8) arrayListA.get(0);
                j76 j76VarA = e.a();
                if (j76VarA != null) {
                    i12.a = j76VarA;
                }
                e.getClass();
                a = 3;
                f(arrayListA);
            }
            e();
            if (a == 3) {
                try {
                    String strC = e.c();
                    boolean z = false;
                    for (String str : f) {
                        if (strC.startsWith(str)) {
                            z = true;
                        }
                    }
                    if (z) {
                        return;
                    }
                    ik8.e("The requested version " + strC + " by your slf4j provider is not compatible with " + Arrays.asList(f).toString());
                    ik8.e("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                } catch (Throwable th) {
                    ik8.b("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e3) {
            a = 2;
            ik8.b("Failed to instantiate SLF4J LoggerFactory", e3);
            throw new IllegalStateException("Unexpected initialization failure", e3);
        }
    }

    public static void e() {
        jz9 jz9Var = b;
        synchronized (jz9Var) {
            try {
                jz9Var.a.a = true;
                hz9 hz9Var = jz9Var.a;
                hz9Var.getClass();
                ArrayList arrayList = new ArrayList(hz9Var.b.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    gz9 gz9Var = (gz9) obj;
                    gz9Var.b = b(gz9Var.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = b.a.c;
        int size2 = linkedBlockingQueue.size();
        ArrayList arrayList2 = new ArrayList(Token.CASE);
        int i2 = 0;
        while (linkedBlockingQueue.drainTo(arrayList2, Token.CASE) != 0) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                iz9 iz9Var = (iz9) obj2;
                if (iz9Var != null) {
                    gz9 gz9Var2 = iz9Var.b;
                    String str = gz9Var2.a;
                    if (gz9Var2.b == null) {
                        gp.j("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!(gz9Var2.b instanceof e17)) {
                        if (!gz9Var2.m()) {
                            ik8.e(str);
                        } else if (gz9Var2.k(iz9Var.a) && gz9Var2.m()) {
                            try {
                                gz9Var2.d.invoke(gz9Var2.b, iz9Var);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i4 = i2 + 1;
                if (i2 == 0) {
                    if (iz9Var.b.m()) {
                        ik8.e("A number (" + size2 + ") of logging calls during the initialization phase have been intercepted and are");
                        ik8.e("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        ik8.e("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(iz9Var.b.b instanceof e17)) {
                        ik8.e("The following set of substitute loggers may have been accessed");
                        ik8.e("during the initialization phase. Logging calls during this");
                        ik8.e("phase were not honored. However, subsequent logging calls to these");
                        ik8.e("loggers will work as normally expected.");
                        ik8.e("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i2 = i4;
            }
            arrayList2.clear();
        }
        hz9 hz9Var2 = b.a;
        hz9Var2.b.clear();
        hz9Var2.c.clear();
    }

    public static void f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            gp.j("No providers were found which is impossible after successful initialization.");
            return;
        }
        if (arrayList.size() > 1) {
            ik8.d("Actual provider is of type [" + arrayList.get(0) + "]");
            return;
        }
        String str = "Connected with provider of type [" + ((vq8) arrayList.get(0)).getClass().getName() + "]";
        int i = ik8.a;
        if (dx1.C(1) >= dx1.C(ik8.b)) {
            ik8.c().println("SLF4J(D): ".concat(str));
        }
    }

    public static void g(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        ik8.e("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ik8.e("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        ik8.e("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void h(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            ik8.e("Class path contains multiple SLF4J providers.");
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ik8.e("Found provider [" + ((vq8) obj) + "]");
            }
            ik8.e("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
