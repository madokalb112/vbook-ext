package org.mozilla.javascript;

import defpackage.j31;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.mozilla.javascript.xml.XMLLib;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class ContextFactory {
    private static ContextFactory global = new ContextFactory();
    private static volatile boolean hasCustomGlobal;
    private ClassLoader applicationClassLoader;
    private boolean disabledListening;
    private volatile Object listeners;
    private final Object listenersLock = new Object();
    private volatile boolean sealed;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public interface GlobalSetter {
        ContextFactory getContextFactoryGlobal();

        void setContextFactoryGlobal(ContextFactory contextFactory);
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public interface Listener {
        void contextCreated(Context context);

        void contextReleased(Context context);
    }

    public static ContextFactory getGlobal() {
        return global;
    }

    public static synchronized GlobalSetter getGlobalSetter() {
        if (hasCustomGlobal) {
            throw new IllegalStateException();
        }
        hasCustomGlobal = true;
        return new GlobalSetter() { // from class: org.mozilla.javascript.ContextFactory.1GlobalSetterImpl
            @Override // org.mozilla.javascript.ContextFactory.GlobalSetter
            public ContextFactory getContextFactoryGlobal() {
                return ContextFactory.global;
            }

            @Override // org.mozilla.javascript.ContextFactory.GlobalSetter
            public void setContextFactoryGlobal(ContextFactory contextFactory) {
                if (contextFactory == null) {
                    contextFactory = new ContextFactory();
                }
                ContextFactory.global = contextFactory;
            }
        };
    }

    public static boolean hasExplicitGlobal() {
        return hasCustomGlobal;
    }

    public static synchronized void initGlobal(ContextFactory contextFactory) {
        if (contextFactory == null) {
            throw new IllegalArgumentException();
        }
        if (hasCustomGlobal) {
            throw new IllegalStateException();
        }
        hasCustomGlobal = true;
        global = contextFactory;
    }

    private static boolean isDom3Present() {
        Class<?> clsClassOrNull = Kit.classOrNull("org.w3c.dom.Node");
        if (clsClassOrNull == null) {
            return false;
        }
        try {
            clsClassOrNull.getMethod("getUserData", String.class);
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }

    public final void addListener(Listener listener) {
        checkNotSealed();
        synchronized (this.listenersLock) {
            try {
                if (this.disabledListening) {
                    throw new IllegalStateException();
                }
                this.listeners = Kit.addListener(this.listeners, listener);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <T> T call(ContextAction<T> contextAction) {
        return (T) Context.call(this, contextAction);
    }

    public final void checkNotSealed() {
        if (this.sealed) {
            j31.d();
        }
    }

    public GeneratedClassLoader createClassLoader(final ClassLoader classLoader) {
        return (GeneratedClassLoader) AccessController.doPrivileged(new PrivilegedAction<DefiningClassLoader>() { // from class: org.mozilla.javascript.ContextFactory.1
            @Override // java.security.PrivilegedAction
            public DefiningClassLoader run() {
                return new DefiningClassLoader(classLoader);
            }
        });
    }

    public final void disableContextListening() {
        checkNotSealed();
        synchronized (this.listenersLock) {
            this.disabledListening = true;
            this.listeners = null;
        }
    }

    public Object doTopCall(Callable callable, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object objCall = callable.call(context, scriptable, scriptable2, objArr);
        return objCall instanceof ConsString ? objCall.toString() : objCall;
    }

    @Deprecated
    public final Context enter() {
        return enterContext(null);
    }

    public Context enterContext() {
        return enterContext(null);
    }

    @Deprecated
    public final void exit() {
        Context.exit();
    }

    public final ClassLoader getApplicationClassLoader() {
        return this.applicationClassLoader;
    }

    public XMLLib.Factory getE4xImplementationFactory() {
        if (isDom3Present()) {
            return XMLLib.Factory.create("org.mozilla.javascript.xmlimpl.XMLLibImpl");
        }
        return null;
    }

    public boolean hasFeature(Context context, int i) {
        switch (i) {
            case 1:
                int languageVersion = context.getLanguageVersion();
                return languageVersion == 100 || languageVersion == 110 || languageVersion == 120;
            case 2:
                return false;
            case 3:
                return true;
            case 4:
                return context.getLanguageVersion() == 120;
            case 6:
                int languageVersion2 = context.getLanguageVersion();
                if (languageVersion2 != 0 && languageVersion2 < 160) {
                    return false;
                }
            case 5:
                return true;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return false;
            case 14:
                return true;
            case 15:
                return context.getLanguageVersion() <= 170;
            case 16:
                return context.getLanguageVersion() >= 200;
            case 17:
            case 18:
            case 19:
                return false;
            case 20:
                return true;
            case 21:
            case 22:
                return false;
            default:
                gp.l(String.valueOf(i));
                return false;
        }
    }

    public final void initApplicationClassLoader(ClassLoader classLoader) {
        if (classLoader == null) {
            gp.l("loader is null");
            return;
        }
        if (!Kit.testIfCanLoadRhinoClasses(classLoader)) {
            gp.l("Loader can not resolve Rhino classes");
        } else if (this.applicationClassLoader != null) {
            gp.j("applicationClassLoader can only be set once");
        } else {
            checkNotSealed();
            this.applicationClassLoader = classLoader;
        }
    }

    public final boolean isSealed() {
        return this.sealed;
    }

    public Context makeContext() {
        return new Context(this);
    }

    public void onContextCreated(Context context) {
        Object obj = this.listeners;
        int i = 0;
        while (true) {
            Listener listener = (Listener) Kit.getListener(obj, i);
            if (listener == null) {
                return;
            }
            listener.contextCreated(context);
            i++;
        }
    }

    public void onContextReleased(Context context) {
        Object obj = this.listeners;
        int i = 0;
        while (true) {
            Listener listener = (Listener) Kit.getListener(obj, i);
            if (listener == null) {
                return;
            }
            listener.contextReleased(context);
            i++;
        }
    }

    public final void removeListener(Listener listener) {
        checkNotSealed();
        synchronized (this.listenersLock) {
            try {
                if (this.disabledListening) {
                    throw new IllegalStateException();
                }
                this.listeners = Kit.removeListener(this.listeners, listener);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void seal() {
        checkNotSealed();
        this.sealed = true;
    }

    public final Context enterContext(Context context) {
        return Context.enter(context, this);
    }

    public void observeInstructionCount(Context context, int i) {
    }
}
