package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j58 implements ka7 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final ru3 g;
    public static final ru3 h;
    public static final ef5 i;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final ja7 d;
    public final k58 e = new k58(this);

    static {
        zz zzVar = new zz(1);
        HashMap map = new HashMap();
        map.put(f58.class, zzVar);
        g = new ru3("key", dx1.o(map));
        zz zzVar2 = new zz(2);
        HashMap map2 = new HashMap();
        map2.put(f58.class, zzVar2);
        h = new ru3(ES6Iterator.VALUE_PROPERTY, dx1.o(map2));
        i = new ef5(1);
    }

    public j58(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, ja7 ja7Var) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = ja7Var;
    }

    public static int f(ru3 ru3Var) {
        f58 f58Var = (f58) ru3Var.b(f58.class);
        if (f58Var != null) {
            return f58Var.tag();
        }
        throw new cd3("Field has no @Protobuf config");
    }

    public final void a(ru3 ru3Var, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        g((f(ru3Var) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // defpackage.ka7
    public final ka7 add(ru3 ru3Var, Object obj) {
        d(ru3Var, obj, true);
        return this;
    }

    public final void b(ru3 ru3Var, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        f58 f58Var = (f58) ru3Var.b(f58.class);
        if (f58Var == null) {
            throw new cd3("Field has no @Protobuf config");
        }
        int iOrdinal = f58Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            g(f58Var.tag() << 3);
            g(i2);
        } else if (iOrdinal == 1) {
            g(f58Var.tag() << 3);
            g((i2 << 1) ^ (i2 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            g((f58Var.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    public final void c(ru3 ru3Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        f58 f58Var = (f58) ru3Var.b(f58.class);
        if (f58Var == null) {
            throw new cd3("Field has no @Protobuf config");
        }
        int iOrdinal = f58Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            g(f58Var.tag() << 3);
            h(j);
        } else if (iOrdinal == 1) {
            g(f58Var.tag() << 3);
            h((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            g((f58Var.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void d(ru3 ru3Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            g((f(ru3Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            g(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                d(ru3Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                e(i, ru3Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            a(ru3Var, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            g((f(ru3Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            c(ru3Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            b(ru3Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            g((f(ru3Var) << 3) | 2);
            g(bArr.length);
            this.a.write(bArr);
            return;
        }
        ja7 ja7Var = (ja7) this.b.get(obj.getClass());
        if (ja7Var != null) {
            e(ja7Var, ru3Var, obj, z);
            return;
        }
        ukb ukbVar = (ukb) this.c.get(obj.getClass());
        if (ukbVar != null) {
            k58 k58Var = this.e;
            k58Var.a = false;
            k58Var.c = ru3Var;
            k58Var.b = z;
            ukbVar.encode(obj, k58Var);
            return;
        }
        if (obj instanceof w36) {
            b(ru3Var, ((w36) obj).a, true);
        } else if (obj instanceof Enum) {
            b(ru3Var, ((Enum) obj).ordinal(), true);
        } else {
            e(this.d, ru3Var, obj, z);
        }
    }

    public final void e(ja7 ja7Var, ru3 ru3Var, Object obj, boolean z) throws IOException {
        uv5 uv5Var = new uv5();
        uv5Var.a = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = uv5Var;
            try {
                ja7Var.encode(obj, this);
                this.a = outputStream;
                long j = uv5Var.a;
                uv5Var.close();
                if (z && j == 0) {
                    return;
                }
                g((f(ru3Var) << 3) | 2);
                h(j);
                ja7Var.encode(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                uv5Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void g(int i2) throws IOException {
        while (true) {
            long j = i2 & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i2 & Token.SWITCH);
                return;
            } else {
                outputStream.write((i2 & Token.SWITCH) | Token.CASE);
                i2 >>>= 7;
            }
        }
    }

    public final void h(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & Token.SWITCH);
                return;
            } else {
                outputStream.write((((int) j) & Token.SWITCH) | Token.CASE);
                j >>>= 7;
            }
        }
    }

    @Override // defpackage.ka7
    public final ka7 add(ru3 ru3Var, double d) throws IOException {
        a(ru3Var, d, true);
        return this;
    }

    @Override // defpackage.ka7
    public final ka7 add(ru3 ru3Var, int i2) {
        b(ru3Var, i2, true);
        return this;
    }

    @Override // defpackage.ka7
    public final ka7 add(ru3 ru3Var, long j) throws IOException {
        c(ru3Var, j, true);
        return this;
    }

    @Override // defpackage.ka7
    public final ka7 add(ru3 ru3Var, boolean z) {
        b(ru3Var, z ? 1 : 0, true);
        return this;
    }
}
