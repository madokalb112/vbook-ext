package org.mozilla.javascript.regexp;

import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class NativeRegExpInstantiator {
    private NativeRegExpInstantiator() {
    }

    public static NativeRegExp withLanguageVersion(int i) {
        return i < 200 ? new NativeRegExpCallable() : new NativeRegExp();
    }

    public static NativeRegExp withLanguageVersionScopeCompiled(int i, Scriptable scriptable, RECompiled rECompiled) {
        return i < 200 ? new NativeRegExpCallable(scriptable, rECompiled) : new NativeRegExp(scriptable, rECompiled);
    }
}
