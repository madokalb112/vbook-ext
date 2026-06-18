package com.google.android.recaptcha.internal;

import defpackage.heb;
import defpackage.lc5;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class zzfx implements InvocationHandler {
    private final Object zza;

    public zzfx(Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (lc5.Q(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (lc5.Q(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (lc5.Q(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z = false;
            if (objArr != null && objArr.length != 0) {
                Object obj3 = objArr[0];
                if ((obj3 != null ? obj3.hashCode() : 0) == obj.hashCode()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        boolean zZza = zza(obj, method, objArr);
        heb hebVar = heb.a;
        if (!zZza) {
            return hebVar;
        }
        if ((this.zza == null && lc5.Q(method.getReturnType(), Void.TYPE)) || ((obj2 = this.zza) != null && lc5.Q(zzkm.zza(obj2.getClass()), zzkm.zza(method.getReturnType())))) {
            Object obj4 = this.zza;
            return obj4 == null ? hebVar : obj4;
        }
        throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + method.getReturnType());
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
