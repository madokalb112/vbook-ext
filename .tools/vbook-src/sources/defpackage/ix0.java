package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ix0 implements qh5, Serializable, jk5 {
    public static final Object NO_RECEIVER = hx0.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient qh5 reflected;
    private final String signature;

    public ix0(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.qh5
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.qh5
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public qh5 compute() {
        qh5 qh5Var = this.reflected;
        if (qh5Var != null) {
            return qh5Var;
        }
        qh5 qh5VarComputeReflected = computeReflected();
        this.reflected = qh5VarComputeReflected;
        return qh5VarComputeReflected;
    }

    public abstract qh5 computeReflected();

    public GenericDeclaration findJavaDeclaration() {
        th5 owner = getOwner();
        String signature = getSignature();
        signature.getClass();
        if (!(owner instanceof r81)) {
            return null;
        }
        String strV0 = bw9.v0(signature, '(');
        if (strV0.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + owner + '/' + signature);
        }
        Method[] declaredMethods = ((r81) owner).c().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (lc5.Q(method.getName(), strV0)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    yn2.p(sb, cls);
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                yn2.p(sb, returnType);
                if (sb.toString().equals(signature)) {
                    return method;
                }
            }
        }
        return null;
    }

    @Override // defpackage.ph5
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.qh5
    public String getName() {
        return this.name;
    }

    public th5 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return ug8.a(cls);
        }
        ug8.a.getClass();
        return new ij7(cls);
    }

    @Override // defpackage.qh5
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract qh5 getReflected();

    @Override // defpackage.qh5
    public pi5 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.qh5
    public List<cbb> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.qh5
    public ui5 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.qh5
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.qh5
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.qh5
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
