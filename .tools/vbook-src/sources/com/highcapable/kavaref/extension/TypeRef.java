package com.highcapable.kavaref.extension;

import com.highcapable.kavaref.extension.TypeRef;
import defpackage.d6a;
import defpackage.dp5;
import defpackage.fw;
import defpackage.ib4;
import defpackage.lc5;
import defpackage.tu1;
import defpackage.ug8;
import defpackage.zib;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class TypeRef<T> {
    private final dp5 rawType$delegate;
    private final dp5 type$delegate;

    public TypeRef() {
        final int i = 0;
        this.type$delegate = new d6a(new ib4(this) { // from class: ebb
            public final /* synthetic */ TypeRef b;

            {
                this.b = this;
            }

            @Override // defpackage.ib4
            public final Object invoke() {
                int i2 = i;
                TypeRef typeRef = this.b;
                switch (i2) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(typeRef);
                    default:
                        return TypeRef.rawType_delegate$lambda$1(typeRef);
                }
            }
        });
        final int i2 = 1;
        this.rawType$delegate = new d6a(new ib4(this) { // from class: ebb
            public final /* synthetic */ TypeRef b;

            {
                this.b = this;
            }

            @Override // defpackage.ib4
            public final Object invoke() {
                int i22 = i2;
                TypeRef typeRef = this.b;
                switch (i22) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(typeRef);
                    default:
                        return TypeRef.rawType_delegate$lambda$1(typeRef);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class rawType_delegate$lambda$1(TypeRef typeRef) {
        return zib.m(typeRef.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type type_delegate$lambda$0(TypeRef typeRef) {
        Class cls;
        Type genericSuperclass = typeRef.getClass().getGenericSuperclass();
        cls = TypeRef.class;
        if (!(genericSuperclass instanceof ParameterizedType)) {
            Class<TypeRef> clsO = tu1.O(ug8.a(cls));
            if (lc5.Q(genericSuperclass, clsO != null ? clsO : TypeRef.class)) {
                gp.j("TypeRef must be created with a type argument: object : TypeRef<...>() {}.");
                return null;
            }
            gp.j("Must only create direct subclasses of TypeRef.");
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type rawType = parameterizedType.getRawType();
        Class<TypeRef> clsO2 = tu1.O(ug8.a(cls));
        if (!lc5.Q(rawType, clsO2 != null ? clsO2 : TypeRef.class)) {
            gp.j("Must only create direct subclasses of TypeRef.");
            return null;
        }
        Type type = (Type) fw.k0(parameterizedType.getActualTypeArguments());
        if (type != null) {
            return type;
        }
        gp.j("Type argument cannot be null.");
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof TypeRef) && lc5.Q(getType(), ((TypeRef) obj).getType());
    }

    public final Class<T> getRawType() {
        return (Class) this.rawType$delegate.getValue();
    }

    public final Type getType() {
        return (Type) this.type$delegate.getValue();
    }

    public int hashCode() {
        return getType().hashCode();
    }

    public String toString() {
        return getType().toString();
    }
}
