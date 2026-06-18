package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class vc0 implements jt1, yx1, Serializable {
    private final jt1 completion;

    public vc0(jt1 jt1Var) {
        this.completion = jt1Var;
    }

    public jt1 create(jt1 jt1Var) {
        jt1Var.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public yx1 getCallerFrame() {
        jt1 jt1Var = this.completion;
        if (jt1Var instanceof yx1) {
            return (yx1) jt1Var;
        }
        return null;
    }

    public final jt1 getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        jd2 jd2Var = (jd2) getClass().getAnnotation(jd2.class);
        String str = null;
        if (jd2Var == null || jd2Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? jd2Var.l()[iIntValue] : -1;
        be5 be5Var = fe.f0;
        be5 be5Var2 = fe.g0;
        if (be5Var2 == null) {
            try {
                be5 be5Var3 = new be5(4, Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                fe.g0 = be5Var3;
                be5Var2 = be5Var3;
            } catch (Exception unused2) {
                fe.g0 = be5Var;
                be5Var2 = be5Var;
            }
        }
        if (be5Var2 != be5Var && (method = (Method) be5Var2.b) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) be5Var2.c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) be5Var2.d;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = jd2Var.c();
        } else {
            strC = str + '/' + jd2Var.c();
        }
        return new StackTraceElement(strC, jd2Var.m(), jd2Var.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.jt1
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            vc0 vc0Var = (vc0) r2;
            jt1 jt1Var = vc0Var.completion;
            jt1Var.getClass();
            try {
                obj = vc0Var.invokeSuspend(obj);
                if (obj == xx1.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new pm8(th);
            }
            vc0Var.releaseIntercepted();
            if (!(jt1Var instanceof vc0)) {
                jt1Var.resumeWith(obj);
                return;
            }
            r2 = jt1Var;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public jt1 create(Object obj, jt1 jt1Var) {
        jt1Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
