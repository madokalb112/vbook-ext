package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vg5 implements ka7, vkb {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final ja7 e;
    public final boolean f;

    public vg5(Writer writer, Map map, Map map2, ja7 ja7Var, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = ja7Var;
        this.f = z;
    }

    public final vg5 a(Object obj) throws IOException {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        b(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new cd3(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            ja7 ja7Var = (ja7) this.c.get(obj.getClass());
            if (ja7Var != null) {
                jsonWriter.beginObject();
                ja7Var.encode(obj, this);
                jsonWriter.endObject();
                return this;
            }
            ukb ukbVar = (ukb) this.d.get(obj.getClass());
            if (ukbVar != null) {
                ukbVar.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.e.encode(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof ia7) {
                int iA = ((ia7) obj).a();
                c();
                jsonWriter.value(iA);
                return this;
            }
            String strName = ((Enum) obj).name();
            c();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            c();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                c();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                a(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                a(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    @Override // defpackage.ka7
    public final ka7 add(ru3 ru3Var, int i) throws IOException {
        String str = ru3Var.a;
        c();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(i);
        return this;
    }

    public final vg5 b(Object obj, String str) throws IOException {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj == null) {
                return this;
            }
            c();
            jsonWriter.name(str);
            a(obj);
            return this;
        }
        c();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        a(obj);
        return this;
    }

    public final void c() {
        if (this.a) {
            return;
        }
        gp.j("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // defpackage.ka7
    public final ka7 add(ru3 ru3Var, double d) throws IOException {
        String str = ru3Var.a;
        c();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(d);
        return this;
    }

    @Override // defpackage.ka7
    public final ka7 add(ru3 ru3Var, long j) throws IOException {
        String str = ru3Var.a;
        c();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(j);
        return this;
    }

    @Override // defpackage.ka7
    public final ka7 add(ru3 ru3Var, Object obj) throws IOException {
        b(obj, ru3Var.a);
        return this;
    }

    @Override // defpackage.ka7
    public final ka7 add(ru3 ru3Var, boolean z) throws IOException {
        String str = ru3Var.a;
        c();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(z);
        return this;
    }

    @Override // defpackage.vkb
    public final vkb add(String str) throws IOException {
        c();
        this.b.value(str);
        return this;
    }

    @Override // defpackage.vkb
    public final vkb add(boolean z) throws IOException {
        c();
        this.b.value(z);
        return this;
    }
}
