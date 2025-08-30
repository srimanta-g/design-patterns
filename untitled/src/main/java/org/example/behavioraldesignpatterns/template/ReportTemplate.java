package org.example.behavioraldesignpatterns.template;

public abstract class ReportTemplate {
    public void generateReport() {
        openReport();
        readReport();
        closeReport();
    }

    private final void openReport () {
        System.out.println("Opening report...");
    }

    private final void closeReport () {
        System.out.println("Closing report...");
    }

    protected abstract void readReport ();
}
