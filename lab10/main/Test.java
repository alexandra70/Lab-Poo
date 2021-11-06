package main;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        // Execute various tests
        testDraw(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testTextAndColor(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testResize(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testConnect(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testAllCommands(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testSimpleUndoRedo(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testComplexUndoRedo(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));
    }

    private static void testDraw(Client client) {
        client.newDiagram();
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.showDiagram();
    }

    private static void testTextAndColor(Client client) {
        testDraw(client);
        client.executeAction("change color", "0", "RED");
        client.executeAction("change color", "1", "BLUE");
        client.executeAction("draw rectangle");
        client.executeAction("change text", "0", "MyClass1");
        client.executeAction("change text", "5", "MyClass2");
        client.showDiagram();
    }

    private static void testConnect(Client client) {
        // TODO
        System.out.println("+++++++test connect++++++++++");
        client.newDiagram();
        testDraw(client);
        client.executeAction("change color", "0", "RED");
        client.executeAction("change color", "1", "BLUE");
        client.executeAction("connect", "0", "1");
        client.executeAction("connect", "1", "2");

        client.showDiagram();
    }

    private static void testResize(Client client) {
        // TODO

        System.out.println("+++++++test resize++++++++++");
        client.newDiagram();
        testDraw(client);
        client.executeAction("change color", "0", "RED");
        client.executeAction("change color", "1", "BLUE");
        client.executeAction("resize", "1", "5");
        client.executeAction("resize", "2", "1");
        client.executeAction("connect", "0", "1");
        client.executeAction("connect", "1", "2");
        client.showDiagram();
    }

    private static void testAllCommands(Client client) {
        // TODO
        System.out.println("+++++++test -  all tests++++++++++");
        client.newDiagram();
        testDraw(client);
        client.executeAction("change color", "0", "RED");
        client.executeAction("change color", "1", "BLUE");
        client.executeAction("change color", "2", "RED");
        client.executeAction("change color", "3", "BLUE");
        client.executeAction("change color", "4", "RED");
        client.executeAction("resize", "1", "5");
        client.executeAction("resize", "2", "1");
        client.executeAction("connect", "0", "1");
        client.executeAction("connect", "4", "2");
        client.executeAction("connect", "3", "2");
        client.executeAction("connect", "1", "4");
        client.executeAction("change text", "0", "O");
        client.executeAction("change text", "1", "O");
        client.executeAction("change text", "2", "O");
        client.executeAction("change text", "3", "O");
        client.executeAction("change text", "4", "O");
        client.showDiagram();
    }


    private static void testSimpleUndoRedo(Client client) {

        System.out.println("++++++++ simple undo redo +++++++++");
        client.newDiagram();
        client.executeAction("draw rectangle");
        client.executeAction("change color", "0", "ORANGE");
        client.showDiagram();
        client.executeAction("draw rectangle");
        client.showDiagram();
        client.undo();
        client.showDiagram();
        client.redo();
        client.showDiagram();
    }

    private static void testComplexUndoRedo(Client client) {
        // TODO
        System.out.println("++++++++ complex undo redo +++++++++");
        client.newDiagram();
        testDraw(client);
        client.executeAction("change color", "0", "RED");
        client.executeAction("change color", "1", "RED");
        client.executeAction("change color", "2", "RED");
        client.executeAction("change color", "3", "RED");
        client.executeAction("change color", "4", "RED");
        client.showDiagram();
        client.undo();
        client.undo();
        client.undo();
        client.undo();
        client.undo();
        client.showDiagram();
        client.redo();
        client.redo();
        client.redo();
        client.redo();
        client.redo();
        client.showDiagram();
    }
}
