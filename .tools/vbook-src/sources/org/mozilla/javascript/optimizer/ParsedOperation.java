package org.mozilla.javascript.optimizer;

import jdk.dynalink.NamedOperation;
import jdk.dynalink.Namespace;
import jdk.dynalink.NamespaceOperation;
import jdk.dynalink.Operation;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
class ParsedOperation {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final String name;
    private final Namespace namespace;
    private final Operation operation;
    private final Operation root;

    public ParsedOperation(Operation operation) {
        this.root = operation;
        Object name = NamedOperation.getName(operation);
        if (name instanceof String) {
            this.name = (String) name;
        } else {
            if (name != null) {
                sy3.p(operation.toString());
                throw null;
            }
            this.name = "";
        }
        NamespaceOperation baseOperation = NamedOperation.getBaseOperation(operation);
        this.namespace = baseOperation.getNamespace(0);
        this.operation = baseOperation.getBaseOperation();
    }

    public String getName() {
        return this.name;
    }

    public boolean isNamespace(Namespace namespace) {
        return namespace.equals(this.namespace);
    }

    public boolean isOperation(Operation operation, Operation operation2) {
        return operation.equals(this.operation) || operation2.equals(this.operation);
    }

    public String toString() {
        return this.root.toString();
    }

    public boolean isOperation(Operation operation) {
        return operation.equals(this.operation);
    }
}
