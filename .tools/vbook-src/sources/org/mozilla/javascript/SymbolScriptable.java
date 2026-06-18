package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface SymbolScriptable {
    void delete(Symbol symbol);

    Object get(Symbol symbol, Scriptable scriptable);

    boolean has(Symbol symbol, Scriptable scriptable);

    void put(Symbol symbol, Scriptable scriptable, Object obj);
}
