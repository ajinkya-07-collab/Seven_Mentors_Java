import java.util.function.Consumer;

class AuditLogger {
    public void log(String message) {
        System.out.println("[AUDIT] " + message);
    }
}

public class InstanceMethodReference {
    public static void main(String[] args) {

        AuditLogger logger = new AuditLogger();

        Consumer<String> auditAction = logger::log;

        auditAction.accept("Order 1001 created");
        auditAction.accept("Order 1001 dispatched");
        auditAction.accept("Order 1001 shipped");
        auditAction.accept("Order 1001 out for delivary");
    }
}
