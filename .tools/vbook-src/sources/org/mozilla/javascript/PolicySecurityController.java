package org.mozilla.javascript;

import defpackage.z81;
import java.lang.ref.SoftReference;
import java.lang.reflect.UndeclaredThrowableException;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.SecureClassLoader;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class PolicySecurityController extends SecurityController {
    private static final byte[] secureCallerImplBytecode = loadBytecode();
    private static final Map<CodeSource, Map<ClassLoader, SoftReference<SecureCaller>>> callers = new WeakHashMap();

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static class Loader extends SecureClassLoader implements GeneratedClassLoader {
        private final CodeSource codeSource;

        public Loader(ClassLoader classLoader, CodeSource codeSource) {
            super(classLoader);
            this.codeSource = codeSource;
        }

        @Override // org.mozilla.javascript.GeneratedClassLoader
        public Class<?> defineClass(String str, byte[] bArr) {
            return defineClass(str, bArr, 0, bArr.length, this.codeSource);
        }

        @Override // org.mozilla.javascript.GeneratedClassLoader
        public void linkClass(Class<?> cls) {
            resolveClass(cls);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static abstract class SecureCaller {
        public abstract Object call(Callable callable, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr);
    }

    private static byte[] loadBytecode() {
        String name = SecureCaller.class.getName();
        z81 z81Var = new z81(name.concat("Impl"), name, "<generated>");
        z81Var.N("<init>", "()V", (short) 1);
        z81Var.g(0);
        z81Var.m(name, "<init>", Token.TAGGED_TEMPLATE_LITERAL, "()V");
        z81Var.c(Token.METHOD);
        z81Var.O(1);
        z81Var.N("call", "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;", (short) 17);
        for (int i = 1; i < 6; i++) {
            z81Var.g(i);
        }
        z81Var.m("org/mozilla/javascript/Callable", "call", Token.NULLISH_COALESCING, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;");
        z81Var.c(Token.GENEXPR);
        z81Var.O(6);
        return z81Var.P();
    }

    @Override // org.mozilla.javascript.SecurityController
    public Object callWithDomain(Object obj, final Context context, Callable callable, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Map<ClassLoader, SoftReference<SecureCaller>> weakHashMap;
        SecureCaller secureCaller;
        final ClassLoader classLoader = (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.mozilla.javascript.PolicySecurityController.2
            @Override // java.security.PrivilegedAction
            public Object run() {
                return context.getApplicationClassLoader();
            }
        });
        final CodeSource codeSource = (CodeSource) obj;
        Map<CodeSource, Map<ClassLoader, SoftReference<SecureCaller>>> map = callers;
        synchronized (map) {
            try {
                weakHashMap = map.get(codeSource);
                if (weakHashMap == null) {
                    weakHashMap = new WeakHashMap<>();
                    map.put(codeSource, weakHashMap);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (weakHashMap) {
            SoftReference<SecureCaller> softReference = weakHashMap.get(classLoader);
            SecureCaller secureCaller2 = softReference != null ? softReference.get() : null;
            if (secureCaller2 == null) {
                try {
                    secureCaller2 = (SecureCaller) AccessController.doPrivileged(new PrivilegedExceptionAction<Object>() { // from class: org.mozilla.javascript.PolicySecurityController.3
                        @Override // java.security.PrivilegedExceptionAction
                        public Object run() {
                            return new Loader(classLoader, codeSource).defineClass(SecureCaller.class.getName().concat("Impl"), PolicySecurityController.secureCallerImplBytecode).getDeclaredConstructor(null).newInstance(null);
                        }
                    });
                    weakHashMap.put(classLoader, new SoftReference<>(secureCaller2));
                } catch (PrivilegedActionException e) {
                    throw new UndeclaredThrowableException(e.getCause());
                }
            }
            secureCaller = secureCaller2;
        }
        return secureCaller.call(callable, context, scriptable, scriptable2, objArr);
    }

    @Override // org.mozilla.javascript.SecurityController
    public GeneratedClassLoader createClassLoader(final ClassLoader classLoader, final Object obj) {
        return (Loader) AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.mozilla.javascript.PolicySecurityController.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                return new Loader(classLoader, (CodeSource) obj);
            }
        });
    }

    @Override // org.mozilla.javascript.SecurityController
    public Class<?> getStaticSecurityDomainClassInternal() {
        return CodeSource.class;
    }

    @Override // org.mozilla.javascript.SecurityController
    public Object getDynamicSecurityDomain(Object obj) {
        return obj;
    }
}
