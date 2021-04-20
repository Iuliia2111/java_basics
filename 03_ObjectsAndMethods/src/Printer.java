public class Printer {
    private String queue;
    private int pagesCount = 0;
    private int documentsCount = 0;
    private int printedDocumentsCount = 0;
    private int printedPagesCount = 0;

    public void append (String text, String name, int count) {
      queue = queue + name + " / " + count + " / "+ text + " ; ";
      pagesCount = pagesCount + count;
      documentsCount = documentsCount + 1;

    }

    public void append (String text, String name) {
      append(text, name, 0);
    }

    public void append (String text, int count) {
        append(text, "", count);
    }

    public void append (String text) {
        append(text, "", 0);
    }

    public void clear() {
        queue = "";
        pagesCount = 0;
        documentsCount = 0;
    }

    public void print () {
        System.out.println(queue);
        printedDocumentsCount = printedDocumentsCount + documentsCount;
        printedPagesCount = printedPagesCount + pagesCount;
        clear();
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public int getDocumentsCount() {
        return documentsCount;
    }

    public String getPrintedCount() {
        String all = "Напечатанных документов: " + printedDocumentsCount + "\n" + "Напечатанных страниц: " + printedPagesCount;
        return all;
    }
}

