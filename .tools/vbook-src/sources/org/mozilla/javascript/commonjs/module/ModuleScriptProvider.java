package org.mozilla.javascript.commonjs.module;

import java.net.URI;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface ModuleScriptProvider {
    ModuleScript getModuleScript(Context context, String str, URI uri, URI uri2, Scriptable scriptable);
}
