package org.mozilla.javascript.commonjs.module;

import java.net.URI;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.TopLevel;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class ModuleScope extends TopLevel {
    private static final long serialVersionUID = 1;
    private final URI base;
    private final URI uri;

    public ModuleScope(Scriptable scriptable, URI uri, URI uri2) {
        this.uri = uri;
        this.base = uri2;
        setPrototype(scriptable);
        cacheBuiltins(scriptable, false);
    }

    public URI getBase() {
        return this.base;
    }

    public URI getUri() {
        return this.uri;
    }
}
