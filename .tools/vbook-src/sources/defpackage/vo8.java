package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class vo8 {
    public static final lp8 a;

    static {
        hf5 hf5Var = new hf5();
        i50 i50Var = i50.a;
        hf5Var.registerEncoder(vo8.class, i50Var);
        hf5Var.registerEncoder(s80.class, i50Var);
        a = new lp8(hf5Var, 21);
    }

    public static s80 a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new s80(string, string2, string3, string4, j);
    }
}
