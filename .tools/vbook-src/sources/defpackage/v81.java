package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v81 {
    public final byte[] a;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public v81(z81 z81Var, x81 x81Var, Object... objArr) {
        int iC;
        byte[] bArr = new byte[(objArr.length * 2) + 4];
        this.a = bArr;
        z81.I(bArr, z81Var.k.f(x81Var), 0);
        z81.I(bArr, objArr.length, 2);
        for (int i = 0; i < objArr.length; i++) {
            ep1 ep1Var = z81Var.k;
            Object obj = objArr[i];
            ep1Var.getClass();
            if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                iC = ep1Var.c(((Number) obj).intValue());
            } else if (obj instanceof Character) {
                iC = ep1Var.c(((Character) obj).charValue());
            } else if (obj instanceof Boolean) {
                iC = ep1Var.c(((Boolean) obj).booleanValue() ? 1 : 0);
            } else if (obj instanceof Float) {
                float fFloatValue = ((Float) obj).floatValue();
                ep1Var.j(5);
                byte[] bArr2 = ep1Var.l;
                int i2 = ep1Var.h;
                ep1Var.h = i2 + 1;
                bArr2[i2] = 4;
                ep1Var.h = z81.J(ep1Var.l, Float.floatToIntBits(fFloatValue), ep1Var.h);
                ep1Var.k.put(Integer.valueOf(ep1Var.i), (byte) 4);
                int i3 = ep1Var.i;
                ep1Var.i = i3 + 1;
                iC = i3;
            } else if (obj instanceof Long) {
                iC = ep1Var.d(((Long) obj).longValue());
            } else if (obj instanceof Double) {
                iC = ep1Var.b(((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                iC = ep1Var.e((String) obj);
            } else {
                if (!(obj instanceof x81)) {
                    gp.l("value ".concat(String.valueOf(obj)));
                    throw null;
                }
                iC = ep1Var.f((x81) obj);
            }
            z81.I(this.a, iC, (i * 2) + 4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v81) {
            return Arrays.equals(this.a, ((v81) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ~Arrays.hashCode(this.a);
    }
}
