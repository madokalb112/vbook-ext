package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ej1 implements s58 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ej1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.s58
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new xc5("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new xc5(xv5.p("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new xc5(xv5.p("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new xc5(ky0.r("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new xc5(ky0.r("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new gy4((gy3) obj);
        }
    }
}
