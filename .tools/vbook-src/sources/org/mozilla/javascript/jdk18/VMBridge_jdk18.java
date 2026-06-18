package org.mozilla.javascript.jdk18;

import defpackage.w58;
import defpackage.xv5;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.InterfaceAdapter;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.VMBridge;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class VMBridge_jdk18 extends VMBridge {
    private static final ThreadLocal<Object[]> contextLocal = new ThreadLocal<>();

    @Override // org.mozilla.javascript.VMBridge
    public Context getContext(Object obj) {
        return (Context) ((Object[]) obj)[0];
    }

    @Override // org.mozilla.javascript.VMBridge
    public Object getInterfaceProxyHelper(ContextFactory contextFactory, Class<?>[] clsArr) {
        try {
            return Proxy.getProxyClass(clsArr[0].getClassLoader(), clsArr).getConstructor(InvocationHandler.class);
        } catch (NoSuchMethodException e) {
            w58.o(e);
            return null;
        }
    }

    @Override // org.mozilla.javascript.VMBridge
    public Object getThreadContextHelper() {
        ThreadLocal<Object[]> threadLocal = contextLocal;
        Object[] objArr = threadLocal.get();
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[1];
        threadLocal.set(objArr2);
        return objArr2;
    }

    @Override // org.mozilla.javascript.VMBridge
    public Object newInterfaceProxy(Object obj, final ContextFactory contextFactory, final InterfaceAdapter interfaceAdapter, final Object obj2, final Scriptable scriptable) {
        try {
            return ((Constructor) obj).newInstance(new InvocationHandler() { // from class: org.mozilla.javascript.jdk18.VMBridge_jdk18.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj3, Method method, Object[] objArr) {
                    if (method.getDeclaringClass() == Object.class) {
                        String name = method.getName();
                        if (name.equals("equals")) {
                            return Boolean.valueOf(obj3 == objArr[0]);
                        }
                        if (name.equals("hashCode")) {
                            return Integer.valueOf(obj2.hashCode());
                        }
                        if (name.equals("toString")) {
                            return xv5.p("Proxy[", obj2.toString(), "]");
                        }
                    }
                    return interfaceAdapter.invoke(contextFactory, obj2, scriptable, obj3, method, objArr);
                }
            });
        } catch (IllegalAccessException e) {
            w58.o(e);
            return null;
        } catch (InstantiationException e2) {
            w58.o(e2);
            return null;
        } catch (InvocationTargetException e3) {
            throw Context.throwAsScriptRuntimeEx(e3);
        }
    }

    @Override // org.mozilla.javascript.VMBridge
    public void setContext(Object obj, Context context) {
        ((Object[]) obj)[0] = context;
    }

    @Override // org.mozilla.javascript.VMBridge
    public boolean tryToMakeAccessible(AccessibleObject accessibleObject) {
        if (!accessibleObject.isAccessible()) {
            accessibleObject.setAccessible(true);
        }
        return true;
    }
}
